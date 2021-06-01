package shoo.denonapps.com.freshworks.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import shoo.denonapps.com.freshworks.ui.loading.LoadingFragment;

@Module(subcomponents = FragmentModule_ContributeLoadingFragment.LoadingFragmentSubcomponent.class)
public abstract class FragmentModule_ContributeLoadingFragment {
  private FragmentModule_ContributeLoadingFragment() {}

  @Binds
  @IntoMap
  @ClassKey(LoadingFragment.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      LoadingFragmentSubcomponent.Factory builder);

  @Subcomponent
  public interface LoadingFragmentSubcomponent extends AndroidInjector<LoadingFragment> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<LoadingFragment> {}
  }
}
