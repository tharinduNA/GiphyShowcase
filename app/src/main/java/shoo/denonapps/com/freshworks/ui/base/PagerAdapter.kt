package shoo.denonapps.com.freshworks.ui.base

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import shoo.denonapps.com.freshworks.ui.favourite.FavouriteFragment
import shoo.denonapps.com.freshworks.ui.home.HomeFragment

class PageAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    private val homeFragment = HomeFragment()
    private val favouriteFragment = FavouriteFragment()

    override fun getItemCount(): Int = 2

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> homeFragment
            1 -> favouriteFragment
            else -> Fragment()
        }
    }

    fun updateHome(){
        homeFragment.updateUi()
    }

    fun updateFavourite() {
        favouriteFragment.updateUi()
    }

}