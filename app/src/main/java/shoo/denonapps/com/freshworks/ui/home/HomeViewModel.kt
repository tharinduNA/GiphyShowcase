package shoo.denonapps.com.freshworks.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.onCompletion
import kotlinx.coroutines.flow.onStart
import kotlinx.coroutines.launch
import shoo.denonapps.com.freshworks.model.Giphy
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.repository.GiphyRepository
import shoo.denonapps.com.freshworks.utils.Result
import shoo.denonapps.com.freshworks.utils.events.SingleLiveEvent
import javax.inject.Inject

class HomeViewModel @Inject constructor(
    private val giphyRepository: GiphyRepository,
    private val giphyFavDataSource: GiphyFavDataSource
) : ViewModel() {

    val loadingIndicator = SingleLiveEvent<Boolean>()

    var gifList: MutableLiveData<ArrayList<GiphyObject>> = MutableLiveData()
    var error: MutableLiveData<Exception> = MutableLiveData()

    fun fetchTrendingList() {
        viewModelScope.launch {
            giphyRepository.trendingGiphys()
                .onStart {
                    handleLoadingScreen(true)
                }
                .onCompletion {
                    handleLoadingScreen(false)
                }
                .collect { result ->
                    when (result) {
                        is Result.Success -> gifList.value = result.data
                        is Result.Error -> error.value = result.exception
                    }
                }

        }
    }

    fun fetchSearchList(search: String) {
        viewModelScope.launch {
            giphyRepository.searchedGiphys(search)
                .onStart {
                    handleLoadingScreen(true)
                }
                .onCompletion {
                    handleLoadingScreen(false)
                }
                .collect { result ->
                    when (result) {
                        is Result.Success -> gifList.value = result.data
                        is Result.Error -> error.value = result.exception
                    }
                }

        }
    }

    fun handleLoadingScreen(show: Boolean) {
        loadingIndicator.value = show
    }

    fun addToFavs(giphyObject: GiphyObject) {
        viewModelScope.launch {
            if (giphyObject.isFav.not()) {
                giphyFavDataSource.addToFavourite(Giphy(giphyObject.id))
            }
            else giphyFavDataSource.deleteById(giphyObject.id)
        }
    }

    fun arrangeList(favList: List<String>, originalList: ArrayList<GiphyObject>): ArrayList<GiphyObject> {
        originalList.forEachIndexed { index, element ->
            if (favList.contains(element.id)){
                originalList.set(index, GiphyObject(element.id, element.title, true))
            }
        }
        return originalList
    }

}