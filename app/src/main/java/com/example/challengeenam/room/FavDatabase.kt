package com.example.challengeenam.room

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [FavNote::class],
    version = 2
)

abstract class FavDatabase : RoomDatabase() {

    abstract fun favoritDao() : FavDao
}