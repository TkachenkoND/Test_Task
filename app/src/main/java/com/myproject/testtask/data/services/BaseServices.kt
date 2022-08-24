package com.myproject.testtask.data.services

import retrofit2.http.GET
import retrofit2.http.Path

interface BaseServices {
    @GET("{number}")
    suspend fun fetchInfoAboutNumber(@Path("number") number: Int): String
}