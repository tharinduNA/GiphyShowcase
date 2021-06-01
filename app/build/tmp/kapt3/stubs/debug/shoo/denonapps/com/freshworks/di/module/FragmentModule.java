package shoo.denonapps.com.freshworks.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\'J\b\u0010\u0005\u001a\u00020\u0006H\'J\b\u0010\u0007\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lshoo/denonapps/com/freshworks/di/module/FragmentModule;", "", "()V", "contributeDashboardFragment", "Lshoo/denonapps/com/freshworks/ui/favourite/FavouriteFragment;", "contributeHomeFragment", "Lshoo/denonapps/com/freshworks/ui/home/HomeFragment;", "contributeLoadingFragment", "Lshoo/denonapps/com/freshworks/ui/loading/LoadingFragment;", "app_debug"})
@dagger.Module()
public abstract class FragmentModule {
    
    public FragmentModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract shoo.denonapps.com.freshworks.ui.home.HomeFragment contributeHomeFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract shoo.denonapps.com.freshworks.ui.favourite.FavouriteFragment contributeDashboardFragment();
    
    @org.jetbrains.annotations.NotNull()
    @dagger.android.ContributesAndroidInjector()
    public abstract shoo.denonapps.com.freshworks.ui.loading.LoadingFragment contributeLoadingFragment();
}