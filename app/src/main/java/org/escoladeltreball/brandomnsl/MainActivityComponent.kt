package org.escoladeltreball.brandomnsl

import dagger.Subcomponent
import dagger.android.AndroidInjector

@ActvityScope
/* Will be built on top of the ApplicationComponent  */
@Subcomponent
interface MainActivityComponent : AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder : AndroidInjector<MainActivity>

}