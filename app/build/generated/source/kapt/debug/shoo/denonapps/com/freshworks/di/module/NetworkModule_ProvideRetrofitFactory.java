// Generated by Dagger (https://dagger.dev).
package shoo.denonapps.com.freshworks.di.module;

import com.google.gson.Gson;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class NetworkModule_ProvideRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<Gson> gsonProvider;

  public NetworkModule_ProvideRetrofitFactory(NetworkModule module, Provider<Gson> gsonProvider) {
    this.module = module;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public Retrofit get() {
    return provideRetrofit(module, gsonProvider.get());
  }

  public static NetworkModule_ProvideRetrofitFactory create(NetworkModule module,
      Provider<Gson> gsonProvider) {
    return new NetworkModule_ProvideRetrofitFactory(module, gsonProvider);
  }

  public static Retrofit provideRetrofit(NetworkModule instance, Gson gson) {
    return Preconditions.checkNotNullFromProvides(instance.provideRetrofit(gson));
  }
}