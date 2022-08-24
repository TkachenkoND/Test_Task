package com.myproject.testtask.data.services

import retrofit2.http.GET

interface RandomServices {
    @GET("random/math")
    suspend fun fetchInfoAboutRandomNumber(): String
}