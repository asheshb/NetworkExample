package com.example.networkexample.data

import android.app.Application
import androidx.lifecycle.LiveData
import com.example.networkexample.data.network.TmdbService

class MovieListRepository(context: Application){
    private val movieListDao: MovieListDao = MovieDatabase.getDatabase(context).movieListDao()
    private val tmdbService by lazy { TmdbService.getInstance()}

    fun getMovies(): LiveData<List<Movie>> {
        return movieListDao.getMovies()
    }
}