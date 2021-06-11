package shoo.denonapps.com.freshworks.model

import java.io.Serializable

data class GipghyListResponse(
    val data: ArrayList<GiphyObject>
) : Serializable

data class GiphyObject(
    val id: String,
    val title: String,
    var isFav: Boolean = false
)
