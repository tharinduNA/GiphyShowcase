package shoo.denonapps.com.freshworks.datasource

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.withContext
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.repository.GiphyRepository
import shoo.denonapps.com.freshworks.service.GiphyService
import shoo.denonapps.com.freshworks.service.Result
import javax.inject.Inject

class GiphyRemoteDataSource @Inject constructor(
    private val giphyService: GiphyService
) : GiphyRepository {

    //TODO refer api key from properties file
    val apiKey = "lOAVx2ykgag8kwFi8qNk6SkwAfnyuxC2"

    override fun trendingGiphys(): Flow<Result<ArrayList<GiphyObject>?>> =
        flow {
            emit(
                withContext(Dispatchers.Main) {
                    giphyService.getTrendingPosts(apiKey)
                })
        }.map { result ->
            if (result.isSuccessful) Result.Success(result.body()?.data)
            else Result.Error(Exception("Something went wrong"))
        }

    override fun searchedGiphys(search: String): Flow<Result<ArrayList<GiphyObject>?>> =
        flow {
            emit(
                withContext(Dispatchers.Main) {
                    giphyService.getSearchResults(apiKey, 20, search)
                })
        }.map { result ->
            if (result.isSuccessful) Result.Success(result.body()?.data)
            else Result.Error(Exception("Something went wrong"))
        }
}