package shoo.denonapps.com.freshworks.ui.favourite

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import dagger.android.support.DaggerFragment
import shoo.denonapps.com.freshworks.databinding.FragmentFavBinding
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.ui.home.EntryPoint
import shoo.denonapps.com.freshworks.ui.home.GiphyAdapter
import shoo.denonapps.com.freshworks.ui.loading.LoadingFragment
import javax.inject.Inject

class FavouriteFragment : DaggerFragment() {

    @Inject
    lateinit var viewModelProvider: ViewModelProvider.Factory
    private val viewModel by viewModels<FavouriteViewModel> {viewModelProvider}

    private lateinit var binding: FragmentFavBinding

    private lateinit var giphyAdapter: GiphyAdapter

    private lateinit var itemOnClick: (GiphyObject) -> Unit
    private lateinit var loadingScreen: Dialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        binding = FragmentFavBinding.inflate(inflater, container, false
        ).apply {
            viewModel= this@FavouriteFragment.viewModel
            lifecycleOwner = this@FavouriteFragment
        }
        loadingScreen = LoadingFragment.progressDialog(requireContext())

        itemOnClick = { giphyObj ->
            loadingScreen.show()
            giphyAdapter.updateList(giphyObj, EntryPoint.FAVOURITE)
            viewModel.removeFav(giphyObj)
        }
        subscribeForEvents()

        return binding.root
    }

    private fun subscribeForEvents() {

        viewModel.fetchFavFromLocalDb().observe(viewLifecycleOwner, {
            if (it != null && it.isNotEmpty()) {
                binding.noResults.isVisible = it.isEmpty()
                val giphyList = arrayListOf<GiphyObject>()
                it.forEach { giphy ->
                    val trendingList = GiphyObject(giphy?.id ?: "", "", true)
                    giphyList.add(trendingList)
                }
                giphyAdapter = GiphyAdapter(giphyList, itemOnClick)
                binding.trendingList.adapter = giphyAdapter

            } else {
                if (this::giphyAdapter.isInitialized) giphyAdapter.removeList()
                binding.noResults.isVisible = true
            }
            loadingScreen.dismiss()
        })

    }

    fun updateUi(){
        if (this::viewModelProvider.isInitialized) subscribeForEvents()
    }

}