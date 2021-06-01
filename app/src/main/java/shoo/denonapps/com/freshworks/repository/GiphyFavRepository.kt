package shoo.denonapps.com.freshworks.repository

import androidx.lifecycle.LiveData
import shoo.denonapps.com.freshworks.model.Giphy

interface GiphyFavRepository {
    fun findAll(): LiveData<List<Giphy?>?>?
    suspend fun addToFavourite(giphy: Giphy)
    suspend fun deleteById(id: String)
}