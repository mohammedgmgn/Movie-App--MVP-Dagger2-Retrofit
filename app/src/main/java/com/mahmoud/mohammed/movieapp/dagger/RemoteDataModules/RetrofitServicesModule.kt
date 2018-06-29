package com.mahmoud.mohammed.movieapp.dagger.RemoteDataModules

import com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Remote.Services.MoviesService
import dagger.Module
import dagger.Provides
import retrofit2.Retrofit
import javax.inject.Singleton
@Module
class RetrofitServicesModule{
    @Provides
    @Singleton
    fun provideMovieServices(retrofit: Retrofit): MoviesService = retrofit.create(MoviesService::class.java)
}
