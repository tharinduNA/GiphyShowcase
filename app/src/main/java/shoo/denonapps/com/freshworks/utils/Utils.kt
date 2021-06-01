package shoo.denonapps.com.freshworks.utils

import android.widget.ImageView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import shoo.denonapps.com.freshworks.R

class Utils {

    companion object {
        fun ImageView.loadImage(id: String) {
            val options = RequestOptions()
                .error(R.mipmap.ic_launcher_round)
            Glide.with(this.context)
                .setDefaultRequestOptions(options)
                .load(getUri(id))
                .placeholder(R.drawable.loading_placeholder)
                .into(this)
        }

        fun getUri(id: String): String = "https://media.giphy.com/media/$id/giphy.gif"
    }

}