package shoo.denonapps.com.freshworks.di

import android.app.Application
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import shoo.denonapps.com.freshworks.FreshWorksApp
import shoo.denonapps.com.freshworks.di.module.*

@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        ActivityModule::class,
        DBModule::class,
        FragmentModule::class,
        ViewModelModule::class,
        RepositoryModule::class,
        NetworkModule::class
    ]
)
interface AppComponent : AndroidInjector<FreshWorksApp> {
    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder
        fun build(): AppComponent
    }
}