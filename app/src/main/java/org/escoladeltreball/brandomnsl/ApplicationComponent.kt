package org.escoladeltreball.brandomnsl

import dagger.Component
import javax.inject.Singleton

/* His lifecycle is the lifecycle of the app  */
@Singleton
/* Dagger will implement this interface  */
@Component(modules = [ApplicationModule::class])
interface ApplicationComponent