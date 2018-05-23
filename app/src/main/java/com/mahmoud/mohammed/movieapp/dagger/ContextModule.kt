package com.mahmoud.mohammed.movieapp.dagger

import android.app.Application
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ContextModule(private val appContext: Application) {
    @Provides
    @Singleton
  fun provideContext (): Context =appContext;
}
