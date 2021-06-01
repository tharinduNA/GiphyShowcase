// Generated by Dagger (https://dagger.dev).
package shoo.denonapps.com.freshworks.di.module;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import shoo.denonapps.com.freshworks.database.AppDatabase;
import shoo.denonapps.com.freshworks.repository.GiphyDao;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DBModule_ProvidesUserDaoFactory implements Factory<GiphyDao> {
  private final DBModule module;

  private final Provider<AppDatabase> databaseProvider;

  public DBModule_ProvidesUserDaoFactory(DBModule module, Provider<AppDatabase> databaseProvider) {
    this.module = module;
    this.databaseProvider = databaseProvider;
  }

  @Override
  public GiphyDao get() {
    return providesUserDao(module, databaseProvider.get());
  }

  public static DBModule_ProvidesUserDaoFactory create(DBModule module,
      Provider<AppDatabase> databaseProvider) {
    return new DBModule_ProvidesUserDaoFactory(module, databaseProvider);
  }

  public static GiphyDao providesUserDao(DBModule instance, AppDatabase database) {
    return Preconditions.checkNotNullFromProvides(instance.providesUserDao(database));
  }
}
