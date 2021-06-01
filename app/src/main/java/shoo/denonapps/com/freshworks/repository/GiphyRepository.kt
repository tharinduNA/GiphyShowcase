package shoo.denonapps.com.freshworks.repository

import kotlinx.coroutines.flow.Flow
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.service.Result

interface GiphyRepository {
    fun trendingGiphys(): Flow<Result<ArrayList<GiphyObject>?>>
    fun searchedGiphys(search: String): Flow<Result<ArrayList<GiphyObject>?>>
}