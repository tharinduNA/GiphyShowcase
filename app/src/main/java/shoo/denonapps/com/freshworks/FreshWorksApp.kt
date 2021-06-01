package shoo.denonapps.com.freshworks

import dagger.android.DaggerApplication
import shoo.denonapps.com.freshworks.di.AppComponent
import shoo.denonapps.com.freshworks.di.DaggerAppComponent

class FreshWorksApp: DaggerApplication() {

    override fun applicationInjector(): AppComponent {
        return DaggerAppComponent.builder().application(this).build()
    }

}