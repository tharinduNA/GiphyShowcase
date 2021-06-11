package shoo.denonapps.com.freshworks.ui.home

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.appcompat.widget.SearchView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import shoo.denonapps.com.freshworks.R
import shoo.denonapps.com.freshworks.databinding.FragmentHomeBinding
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.ui.loading.LoadingFragment
import javax.inject.Inject

class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelProvider: ViewModelProvider.Factory
    private val viewModel by viewModels<HomeViewModel> { viewModelProvider }

    private lateinit var binding: FragmentHomeBinding
    private lateinit var giphyAdapter: GiphyAdapter

    private lateinit var loadingScreen: Dialog

    private lateinit var itemOnClick: (GiphyObject) -> Unit

    private var favList = listOf<String>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentHomeBinding.inflate(
            inflater, container, false
        ).apply {
            viewModel = this@HomeFragment.viewModel
            lifecycleOwner = this@HomeFragment
        }

        binding.searchText.setOnQueryTextListener(queryTextListener)

        viewModel.fetchTrendingList()

        itemOnClick = { giphyObj ->
            giphyAdapter.updateList(giphyObj, EntryPoint.HOME)
            viewModel.addToFavs(giphyObj)
        }
        subscribeToEvents()
        loadingScreen = LoadingFragment.progressDialog(requireContext())

        return binding.root
    }

    private fun subscribeToEvents() {

        viewModel.fetchFavFromLocalDb().observe(viewLifecycleOwner, { it ->
            if (it != null && it.isNotEmpty()) {
                favList = it.map { item -> item?.id ?: "" }
                if(this::giphyAdapter.isInitialized) giphyAdapter.cleanFavourites(favList)
            } else if(this::giphyAdapter.isInitialized) giphyAdapter.cleanFavourites(listOf())

        })

        viewModel.gifList.observe(viewLifecycleOwner, {
            binding.noResults.isVisible = it.size == 0
            val list = viewModel.arrangeList(favList, it)
            giphyAdapter = GiphyAdapter(list, itemOnClick)
            binding.trendingList.adapter = giphyAdapter
        })

        viewModel.loadingIndicator.observe(viewLifecycleOwner, {
            if (it) loadingScreen.show()
            else loadingScreen.dismiss()
        })

        viewModel.error.observe(viewLifecycleOwner, {
            Toast.makeText(
                requireContext(),
                R.string.oops_something_went_wrong,
                Toast.LENGTH_LONG
            )
        })

    }

    private val queryTextListener = object : SearchView.OnQueryTextListener {
        override fun onQueryTextSubmit(query: String?): Boolean {
            if (query?.length == 0) viewModel.fetchTrendingList()
            else viewModel.fetchSearchList(query.toString())
            binding.searchText.clearFocus()
            return false
        }

        override fun onQueryTextChange(newText: String): Boolean {
            if(newText.isEmpty()) viewModel.fetchTrendingList()
            return true
        }
    }

    fun updateUi(){
        if (this::giphyAdapter.isInitialized ) subscribeToEvents()
    }

}