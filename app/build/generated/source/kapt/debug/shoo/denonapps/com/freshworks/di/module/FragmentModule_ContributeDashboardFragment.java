package shoo.denonapps.com.freshworks.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import shoo.denonapps.com.freshworks.ui.favourite.FavouriteFragment;

@Module(
  subcomponents = FragmentModule_ContributeDashboardFragment.FavouriteFragmentSubcomponent.class
)
public abstract class FragmentModule_ContributeDashboardFragment {
  private FragmentModule_ContributeDashboardFragment() {}

  @Binds
  @IntoMap
  @ClassKey(FavouriteFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      FavouriteFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface FavouriteFragmentSubcomponent extends AndroidInjector<FavouriteFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<FavouriteFragment> {}
  }
}
