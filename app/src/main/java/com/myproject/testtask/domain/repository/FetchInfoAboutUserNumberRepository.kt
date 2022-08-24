package com.myproject.testtask.domain.repository

interface FetchInfoAboutUserNumberRepository {
    suspend fun fetchInfoAboutNumber(number: Int): String
}