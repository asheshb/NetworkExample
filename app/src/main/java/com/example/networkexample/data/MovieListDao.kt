package com.example.networkexample.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query

@Dao
interface MovieListDao{
    @Query("SELECT * FROM movie ORDER BY release_date DESC")
    fun getMovies(): LiveData<List<Movie>>

}