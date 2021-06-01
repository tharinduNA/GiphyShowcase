package shoo.denonapps.com.freshworks.di.module

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap
import shoo.denonapps.com.freshworks.di.ViewModelKey
import shoo.denonapps.com.freshworks.di.ViewModelProviderFactory
import shoo.denonapps.com.freshworks.ui.favourite.FavouriteViewModel
import shoo.denonapps.com.freshworks.ui.home.HomeViewModel

@Module
abstract class ViewModelModule {

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelProviderFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(HomeViewModel::class)
    abstract fun bindHomeViewModel(homeViewModel: HomeViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(FavouriteViewModel::class)
    abstract fun bindDashboardViewModel(homeViewModel: FavouriteViewModel): ViewModel

}