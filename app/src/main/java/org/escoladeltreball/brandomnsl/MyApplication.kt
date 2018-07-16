package org.escoladeltreball.brandomnsl

import android.app.Application

class MyApplication : Application() {

    private lateinit var component: ApplicationComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerApplicationComponent.builder()
                .applicationModule(ApplicationModule(this))
                .build()

    }
}