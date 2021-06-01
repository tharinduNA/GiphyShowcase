package shoo.denonapps.com.freshworks.di.module;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import shoo.denonapps.com.freshworks.ui.base.MainActivity;

@Module(subcomponents = ActivityModule_ContributeBaseActivity.MainActivitySubcomponent.class)
public abstract class ActivityModule_ContributeBaseActivity {
  private ActivityModule_ContributeBaseActivity() {}

  @Binds
  @IntoMap
  @ClassKey(MainActivity.class)
  abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
      MainActivitySubcomponent.Factory builder);

  @Subcomponent
  public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Factory
    interface Factory extends AndroidInjector.Factory<MainActivity> {}
  }
}
