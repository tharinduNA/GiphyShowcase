package shoo.denonapps.com.freshworks.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\bH\'J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\'\u00a8\u0006\r"}, d2 = {"Lshoo/denonapps/com/freshworks/di/module/ViewModelModule;", "", "()V", "bindDashboardViewModel", "Landroidx/lifecycle/ViewModel;", "homeViewModel", "Lshoo/denonapps/com/freshworks/ui/favourite/FavouriteViewModel;", "bindHomeViewModel", "Lshoo/denonapps/com/freshworks/ui/home/HomeViewModel;", "bindViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "factory", "Lshoo/denonapps/com/freshworks/di/ViewModelProviderFactory;", "app_debug"})
@dagger.Module()
public abstract class ViewModelModule {
    
    public ViewModelModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModelProvider.Factory bindViewModelFactory(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.di.ViewModelProviderFactory factory);
    
    @org.jetbrains.annotations.NotNull()
    @shoo.denonapps.com.freshworks.di.ViewModelKey(value = shoo.denonapps.com.freshworks.ui.home.HomeViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindHomeViewModel(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.ui.home.HomeViewModel homeViewModel);
    
    @org.jetbrains.annotations.NotNull()
    @shoo.denonapps.com.freshworks.di.ViewModelKey(value = shoo.denonapps.com.freshworks.ui.favourite.FavouriteViewModel.class)
    @dagger.multibindings.IntoMap()
    @dagger.Binds()
    public abstract androidx.lifecycle.ViewModel bindDashboardViewModel(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.ui.favourite.FavouriteViewModel homeViewModel);
}