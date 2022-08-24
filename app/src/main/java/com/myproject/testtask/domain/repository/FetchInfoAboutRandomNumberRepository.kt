package com.myproject.testtask.domain.repository

interface FetchInfoAboutRandomNumberRepository {
    suspend fun fetchInfoAboutRandomNumber(): String
}