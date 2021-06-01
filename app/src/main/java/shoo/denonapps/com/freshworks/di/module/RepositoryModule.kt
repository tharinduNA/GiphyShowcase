package shoo.denonapps.com.freshworks.di.module

import dagger.Binds
import dagger.Module
import shoo.denonapps.com.freshworks.datasource.GiphyRemoteDataSource
import shoo.denonapps.com.freshworks.repository.GiphyRepository

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindGiphyRepository(giphyProvider: GiphyRemoteDataSource): GiphyRepository

}