package shoo.denonapps.com.freshworks.di.module

import android.app.Application
import androidx.room.Room
import dagger.Module
import dagger.Provides
import shoo.denonapps.com.freshworks.database.AppDatabase
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource

@Module
class DBModule {

    @Provides
    fun providesAppDatabase(application: Application): AppDatabase =
        Room.databaseBuilder(application, AppDatabase::class.java, "giphy-fav-db").allowMainThreadQueries().build()

    @Provides
    fun providesUserDao(database: AppDatabase) = database.giphyDao()

    @Provides
    fun provideUserDataSource(database: AppDatabase): GiphyFavDataSource =
        GiphyFavDataSource(database.giphyDao())

}