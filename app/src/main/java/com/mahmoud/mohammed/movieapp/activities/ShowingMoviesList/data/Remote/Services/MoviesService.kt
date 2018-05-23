package com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Remote.Services

import com.mahmoud.mohammed.movieapp.BuildConfig
import com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Models.MovieModel
import com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Remote.EndPoints
import retrofit2.Call
import retrofit2.http.GET

interface MoviesService{
    @GET("/3/discover/movie?api_key="+ BuildConfig.THE_MOVIE_API_KEY)
    fun movieList(): Call<MovieModel>
}
