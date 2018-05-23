package com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Remote

import com.mahmoud.mohammed.movieapp.BuildConfig


object EndPoints {
   // val baseURL = "https://api.themoviedb.org/3/discover/movie?api_key="
    val baseURL = "    http://api.themoviedb.org/"
    val MoviesEndPoint = baseURL +"/3/discover/movie?api_key="+ BuildConfig.THE_MOVIE_API_KEY

}