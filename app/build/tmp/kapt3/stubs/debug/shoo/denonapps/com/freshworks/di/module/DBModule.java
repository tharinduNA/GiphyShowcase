package shoo.denonapps.com.freshworks.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\f"}, d2 = {"Lshoo/denonapps/com/freshworks/di/module/DBModule;", "", "()V", "provideUserDataSource", "Lshoo/denonapps/com/freshworks/datasource/GiphyFavDataSource;", "database", "Lshoo/denonapps/com/freshworks/database/AppDatabase;", "providesAppDatabase", "application", "Landroid/app/Application;", "providesUserDao", "Lshoo/denonapps/com/freshworks/repository/GiphyDao;", "app_debug"})
@dagger.Module()
public final class DBModule {
    
    public DBModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final shoo.denonapps.com.freshworks.database.AppDatabase providesAppDatabase(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final shoo.denonapps.com.freshworks.repository.GiphyDao providesUserDao(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.database.AppDatabase database) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource provideUserDataSource(@org.jetbrains.annotations.NotNull()
    shoo.denonapps.com.freshworks.database.AppDatabase database) {
        return null;
    }
}