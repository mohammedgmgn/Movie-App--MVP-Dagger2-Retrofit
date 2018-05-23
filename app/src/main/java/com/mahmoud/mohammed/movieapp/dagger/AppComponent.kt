package com.mahmoud.mohammed.movieapp.dagger

import com.mahmoud.mohammed.movieapp.activities.view.ShowingMoviesListActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [ContextModule::class])
interface AppComponent{
    fun inject(target: ShowingMoviesListActivity)
}