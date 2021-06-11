package shoo.denonapps.com.freshworks.ui.home

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import shoo.denonapps.com.freshworks.R
import shoo.denonapps.com.freshworks.databinding.GiphyItemBinding
import shoo.denonapps.com.freshworks.model.GiphyObject
import shoo.denonapps.com.freshworks.utils.Utils.Companion.loadImage

enum class EntryPoint {
    HOME,
    FAVOURITE
}

class GiphyAdapter(
    private var giphyList: ArrayList<GiphyObject>,
    private val itemClickListener: (GiphyObject) -> Unit
) : RecyclerView.Adapter<GiphyAdapter.GiphyViewHolder>() {

    private lateinit var binding: GiphyItemBinding

    fun updateList(giphyObject: GiphyObject, entryPoint: EntryPoint) {
        val index = giphyList.indexOf(giphyObject)
        when (entryPoint) {
            EntryPoint.HOME -> {
                giphyList.set(index, GiphyObject(giphyObject.id, giphyObject.title, giphyObject.isFav.not()))
            }
            EntryPoint.FAVOURITE -> {
                giphyList.remove(giphyObject)
            }
        }
        notifyDataSetChanged()
    }

    fun cleanFavourites(favList: List<String>) {
        if (favList.isNotEmpty()) {
            giphyList.filter { it.isFav }
                .forEach {
                    if (favList.contains(it.id).not()) {
                        it.isFav = false
                    }
                }
        } else giphyList.filter { it.isFav }.map { it.isFav = false }
        notifyDataSetChanged()
    }

    fun removeList() {
        giphyList.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): GiphyViewHolder {
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context),
            R.layout.giphy_item, parent, false
        )
        return GiphyViewHolder(binding.root)
    }

    override fun getItemCount() = giphyList.size
    override fun onBindViewHolder(holder: GiphyViewHolder, position: Int) {
        holder.bind(giphyList[position], itemClickListener)
    }

    inner class GiphyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        private val image: ImageView = binding.gif
        private val fav: ImageView = binding.favIcon

        fun bind(giphyItem: GiphyObject, itemClickListener: (GiphyObject) -> Unit) {
            image.loadImage(giphyItem.id)
            if (giphyItem.isFav) fav.setImageResource(R.drawable.fav)
            else fav.setImageResource(R.drawable.fav_un)
            fav.setOnClickListener { itemClickListener(giphyItem) }
        }
    }
}