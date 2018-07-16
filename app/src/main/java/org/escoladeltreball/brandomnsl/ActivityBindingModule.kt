package org.escoladeltreball.brandomnsl

import android.app.Activity
import dagger.Binds
import dagger.Module
import dagger.android.ActivityKey
import dagger.android.AndroidInjector
import dagger.multibindings.IntoMap

@Module(subcomponents = [MainActivityComponent::class])
abstract class ActivityBindingModule {

    @Binds @IntoMap @ActivityKey(MainActivity::class)
    abstract fun providesMainActivityInjector(builder: MainActivityComponent.Builder): AndroidInjector.Factory<out Activity>

}