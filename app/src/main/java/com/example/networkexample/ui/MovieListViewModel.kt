package com.example.networkexample.ui

import android.app.Application
import androidx.lifecycle.*
import com.example.networkexample.data.Movie
import com.example.networkexample.data.MovieListRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class MovieListViewModel(application: Application): AndroidViewModel(application){
    private val repo: MovieListRepository =
        MovieListRepository(application)

    val movies: LiveData<List<Movie>> = repo.getMovies()

    fun fetchFromNetwork(){
        viewModelScope.launch {
            withContext(Dispatchers.IO){
                repo.fetchFromNetwork()
            }

        }
    }
}