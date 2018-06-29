package com.mahmoud.mohammed.movieapp.base

import com.mahmoud.mohammed.movieapp.activities.ShowingMoviesList.data.Models.MovieModel

interface Callbacks{
    interface BaseNetworkCallbacks<OnSuccessReturnType> {
        fun onSuccess(result: OnSuccessReturnType)
        fun onError(err: String)
    }
    interface GetMoviesCallbacks : BaseNetworkCallbacks<MovieModel>
}
