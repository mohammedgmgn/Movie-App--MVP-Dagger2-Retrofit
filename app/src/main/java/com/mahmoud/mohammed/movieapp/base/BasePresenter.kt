package com.mahmoud.mohammed.movieapp.base

interface BasePresenter<tView> {
    fun setView(view: tView)
    fun removeView()
}