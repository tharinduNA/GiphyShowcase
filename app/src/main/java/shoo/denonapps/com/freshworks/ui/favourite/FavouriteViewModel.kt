package shoo.denonapps.com.freshworks.ui.favourite

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource
import shoo.denonapps.com.freshworks.model.GiphyObject
import javax.inject.Inject

class FavouriteViewModel @Inject constructor(private val giphyFavDataSource: GiphyFavDataSource): ViewModel() {

    fun removeFav(giphyObject: GiphyObject) {
        viewModelScope.launch {
            giphyFavDataSource.deleteById(giphyObject.id)
        }
    }

    fun fetchFavFromLocalDb() = giphyFavDataSource.findAll()

}