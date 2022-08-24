package com.myproject.testtask.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.myproject.testtask.data.database.dao.MyDao
import com.myproject.testtask.data.database.entity.InfoEntity

@Database(entities = [InfoEntity::class], version = 1)
abstract class MyDataBase: RoomDatabase() {
    abstract fun getMyDao(): MyDao
}