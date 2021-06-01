// Generated by Dagger (https://dagger.dev).
package shoo.denonapps.com.freshworks.datasource;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import shoo.denonapps.com.freshworks.service.GiphyService;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class GiphyRemoteDataSource_Factory implements Factory<GiphyRemoteDataSource> {
  private final Provider<GiphyService> giphyServiceProvider;

  public GiphyRemoteDataSource_Factory(Provider<GiphyService> giphyServiceProvider) {
    this.giphyServiceProvider = giphyServiceProvider;
  }

  @Override
  public GiphyRemoteDataSource get() {
    return newInstance(giphyServiceProvider.get());
  }

  public static GiphyRemoteDataSource_Factory create(Provider<GiphyService> giphyServiceProvider) {
    return new GiphyRemoteDataSource_Factory(giphyServiceProvider);
  }

  public static GiphyRemoteDataSource newInstance(GiphyService giphyService) {
    return new GiphyRemoteDataSource(giphyService);
  }
}