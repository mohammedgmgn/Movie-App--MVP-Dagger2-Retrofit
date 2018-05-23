package com.mahmoud.mohammed.movieapp.dagger

import com.mahmoud.mohammed.movieapp.activities.view.ShowingMoviesListActivity
import com.mahmoud.mohammed.movieapp.dagger.RemoteDataModules.RetrofitModule
import dagger.Component
import retrofit2.Retrofit
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class,RetrofitModule::class])
interface AppComponent{
    fun inject(target: ShowingMoviesListActivity)
}