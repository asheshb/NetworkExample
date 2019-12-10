package com.example.networkexample.ui

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import com.example.networkexample.data.Movie
import com.example.networkexample.data.MovieListRepository


class MovieListViewModel(application: Application): AndroidViewModel(application){
    private val repo: MovieListRepository =
        MovieListRepository(application)

    val movies: LiveData<List<Movie>> = repo.getMovies()
}