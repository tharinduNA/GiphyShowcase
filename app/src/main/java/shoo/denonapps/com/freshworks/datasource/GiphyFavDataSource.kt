package shoo.denonapps.com.freshworks.datasource

import androidx.annotation.WorkerThread
import androidx.lifecycle.LiveData
import shoo.denonapps.com.freshworks.model.Giphy
import shoo.denonapps.com.freshworks.repository.GiphyDao
import shoo.denonapps.com.freshworks.repository.GiphyFavRepository
import javax.inject.Inject

class GiphyFavDataSource @Inject constructor(private val giphyDao: GiphyDao) : GiphyFavRepository {

    @Suppress("RedundantSuspendModifier")
    @WorkerThread
    override fun findAll(): LiveData<List<Giphy?>?> {
        return giphyDao.findAll()
    }

    override suspend fun addToFavourite(giphy: Giphy) {
        return giphyDao.addToFavourite(giphy)
    }

    override suspend fun deleteById(id: String) {
        return giphyDao.deleteById(id)
    }
}