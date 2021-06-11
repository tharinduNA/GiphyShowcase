package shoo.denonapps.com.freshworks.ui.base

import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayoutMediator
import dagger.android.support.DaggerAppCompatActivity
import shoo.denonapps.com.freshworks.R
import shoo.denonapps.com.freshworks.databinding.ActivityMainBinding

class MainActivity : DaggerAppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: PageAdapter
    private lateinit var viewPager2: ViewPager2

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.navView.setOnNavigationItemSelectedListener(bottomNavigation)

        val tabLayout = binding.tabLayout
        viewPager2 = binding.pager

        viewPager2.registerOnPageChangeCallback(viewPageListener)

        adapter = PageAdapter(supportFragmentManager, lifecycle)

        viewPager2.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, view ->
        }.attach()

    }

    private val viewPageListener = object : ViewPager2.OnPageChangeCallback() {
        override fun onPageSelected(position: Int) {
            if (position == 0) {
                adapter.updateHome()
                binding.navView.selectedItemId = R.id.navigation_home
            } else if (position == 1) {
                adapter.updateFavourite()
                binding.navView.selectedItemId = R.id.navigation_dashboard
            }
            super.onPageSelected(position)
        }
    }

    private val bottomNavigation =
        BottomNavigationView.OnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.navigation_home -> {
                    viewPager2.setCurrentItem(0, true)
                }
                R.id.navigation_dashboard -> {
                    viewPager2.setCurrentItem(1, true)
                }
            }
            true
        }
}