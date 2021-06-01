package shoo.denonapps.com.freshworks.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003\u00a8\u0006\u0004"}, d2 = {"Lshoo/denonapps/com/freshworks/di/AppComponent;", "Ldagger/android/AndroidInjector;", "Lshoo/denonapps/com/freshworks/FreshWorksApp;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, shoo.denonapps.com.freshworks.di.module.ActivityModule.class, shoo.denonapps.com.freshworks.di.module.DBModule.class, shoo.denonapps.com.freshworks.di.module.FragmentModule.class, shoo.denonapps.com.freshworks.di.module.ViewModelModule.class, shoo.denonapps.com.freshworks.di.module.RepositoryModule.class, shoo.denonapps.com.freshworks.di.module.NetworkModule.class})
public abstract interface AppComponent extends dagger.android.AndroidInjector<shoo.denonapps.com.freshworks.FreshWorksApp> {
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lshoo/denonapps/com/freshworks/di/AppComponent$Builder;", "", "application", "Landroid/app/Application;", "build", "Lshoo/denonapps/com/freshworks/di/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract shoo.denonapps.com.freshworks.di.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        android.app.Application application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract shoo.denonapps.com.freshworks.di.AppComponent build();
    }
}