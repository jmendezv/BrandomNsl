package org.escoladeltreball.brandomnsl

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides

/* Provider of dependencies */
@Module
class ApplicationModule(val application: Application) {

    /* Any class can inject the application context */
    @Provides
    public fun provideApplicationContext(): Context = application

}