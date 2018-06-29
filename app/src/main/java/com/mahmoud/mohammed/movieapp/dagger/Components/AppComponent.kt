package com.mahmoud.mohammed.movieapp.dagger.Components

import com.mahmoud.mohammed.movieapp.activities.view.ShowingMoviesListActivity
import com.mahmoud.mohammed.movieapp.dagger.ContextModule
import com.mahmoud.mohammed.movieapp.dagger.PresenterModule
import com.mahmoud.mohammed.movieapp.dagger.RemoteDataModules.RetrofitModule
import com.mahmoud.mohammed.movieapp.dagger.RemoteDataModules.RetrofitServicesModule
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class,RetrofitModule::class, RetrofitServicesModule::class,
    PresenterModule::class
])
interface AppComponent{
    fun inject(target: ShowingMoviesListActivity)
}