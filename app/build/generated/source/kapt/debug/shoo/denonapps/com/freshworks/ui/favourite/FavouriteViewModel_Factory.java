// Generated by Dagger (https://dagger.dev).
package shoo.denonapps.com.freshworks.ui.favourite;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;
import shoo.denonapps.com.freshworks.datasource.GiphyFavDataSource;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class FavouriteViewModel_Factory implements Factory<FavouriteViewModel> {
  private final Provider<GiphyFavDataSource> giphyFavDataSourceProvider;

  public FavouriteViewModel_Factory(Provider<GiphyFavDataSource> giphyFavDataSourceProvider) {
    this.giphyFavDataSourceProvider = giphyFavDataSourceProvider;
  }

  @Override
  public FavouriteViewModel get() {
    return newInstance(giphyFavDataSourceProvider.get());
  }

  public static FavouriteViewModel_Factory create(
      Provider<GiphyFavDataSource> giphyFavDataSourceProvider) {
    return new FavouriteViewModel_Factory(giphyFavDataSourceProvider);
  }

  public static FavouriteViewModel newInstance(GiphyFavDataSource giphyFavDataSource) {
    return new FavouriteViewModel(giphyFavDataSource);
  }
}
