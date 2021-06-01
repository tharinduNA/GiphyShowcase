package shoo.denonapps.com.freshworks.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import shoo.denonapps.com.freshworks.ui.home.HomeFragment;

@Module(subcomponents = FragmentModule_ContributeHomeFragment.HomeFragmentSubcomponent.class)
public abstract class FragmentModule_ContributeHomeFragment {
  private FragmentModule_ContributeHomeFragment() {}

  @Binds
  @IntoMap
  @ClassKey(HomeFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      HomeFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface HomeFragmentSubcomponent extends AndroidInjector<HomeFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<HomeFragment> {}
  }
}
