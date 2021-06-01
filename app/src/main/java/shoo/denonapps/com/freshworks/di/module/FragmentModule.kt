package shoo.denonapps.com.freshworks.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import shoo.denonapps.com.freshworks.ui.loading.LoadingFragment
import shoo.denonapps.com.freshworks.ui.favourite.FavouriteFragment
import shoo.denonapps.com.freshworks.ui.home.HomeFragment

@Module
abstract class FragmentModule {

    @ContributesAndroidInjector
    abstract fun contributeHomeFragment(): HomeFragment

    @ContributesAndroidInjector
    abstract fun contributeDashboardFragment(): FavouriteFragment

    @ContributesAndroidInjector
    abstract fun contributeLoadingFragment(): LoadingFragment

}