package com.example.challengeenam.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.challengeenam.room.FavDao
import com.example.challengeenam.room.FavNote
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FavoritViewModel @Inject constructor(private val favoriteDAO: FavDao): ViewModel( ){

    //insert favorite movie
    suspend fun insertFavoriteMovie( favorite: FavNote) = favoriteDAO.insertFilmFavorites(favorite)

    fun insertMovie(id:Int,title:String,date:String,image:String){
        viewModelScope.launch {
            val movie = FavNote(id,title,date,image)
            favoriteDAO.insertFilmFavorites(movie)
        }
    }
    fun getFavoriteMovie() = favoriteDAO.getAllFilmFavorites()

}