package shoo.denonapps.com.freshworks.di.module

import dagger.Module
import dagger.android.ContributesAndroidInjector
import shoo.denonapps.com.freshworks.ui.base.MainActivity

@Module
abstract class ActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeBaseActivity(): MainActivity

}