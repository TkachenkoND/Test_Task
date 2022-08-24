package com.myproject.testtask.di

import androidx.room.Room
import com.myproject.testtask.data.database.MyDataBase
import org.koin.dsl.module

private const val DB_NAME = "DataBase.db"

val dbModule = module {

    single {
        Room.databaseBuilder(get(), MyDataBase::class.java, DB_NAME)
            .fallbackToDestructiveMigration()
            .build()
    }

    factory { get<MyDataBase>().getMyDao() }
}