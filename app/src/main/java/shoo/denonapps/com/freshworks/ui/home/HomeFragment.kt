package shoo.denonapps.com.freshworks.ui.home

import android.app.Dialog
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import shoo.denonapps.com.freshworks.databinding.FragmentHomeBinding
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.ui.base.LoadingFragment
import javax.inject.Inject

class HomeFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelProvider: ViewModelProvider.Factory
    private val viewModel by viewModels<HomeViewModel> { viewModelProvider }

    @Inject
    lateinit var giphyFavDataSource: GiphyFavDataSource

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

        binding.searchText.addTextChangedListener(textWatcher)

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

        giphyFavDataSource.findAll().observe(viewLifecycleOwner, { it ->
            if (it != null && it.isNotEmpty()) {
                favList = it.map { item -> item?.id ?: "" }
            }
        })

    }

    private val textWatcher = object : TextWatcher {
        override fun afterTextChanged(s: Editable?) {
        }

        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            if (s?.length == 0) viewModel.fetchTrendingList()
            else viewModel.fetchSearchList(s.toString())
        }
    }

    fun updateUi(){
        if (this::giphyAdapter.isInitialized ) subscribeToEvents()
    }

}