package com.example.challengeenam.room

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface FavDao {
    @Query("SELECT * FROM FavNote")
    fun getAllFilmFavorites() : LiveData<List<FavNote>>

    @Insert
    suspend fun insertFilmFavorites(filmFavorites: FavNote)
}