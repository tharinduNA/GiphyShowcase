package shoo.denonapps.com.freshworks.service

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import shoo.denonapps.com.freshworks.model.GipghyListResponse

interface GiphyService {

    @GET("/v1/gifs/trending")
    suspend fun getTrendingPosts(
        @Query("api_key") apiKey: String
    ): Response<GipghyListResponse>

    @GET("/v1/gifs/search")
    suspend fun getSearchResults(
        @Query("api_key") apiKey: String,
        @Query("limit") limit: Int,
        @Query("q") search: String
    ): Response<GipghyListResponse>

}