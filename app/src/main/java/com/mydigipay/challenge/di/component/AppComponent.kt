package com.mydigipay.challenge.di.component

import android.content.Context
import com.einhesari.batmanmovies.di.module.ViewModelModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent

@Component
interface AppComponent {

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }

    val viewModelProviderFactory: ViewModelComponent.Factory

}

@Subcomponent(modules = [ViewModelModule::class])
interface ViewModelComponent {

    @Subcomponent.Factory
    interface Factory {
        fun create(): ViewModelComponent
    }

}