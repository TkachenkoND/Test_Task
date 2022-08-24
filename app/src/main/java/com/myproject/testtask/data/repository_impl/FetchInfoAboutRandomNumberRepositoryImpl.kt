package com.myproject.testtask.data.repository_impl

import com.myproject.testtask.data.services.RandomServices
import com.myproject.testtask.domain.repository.FetchInfoAboutRandomNumberRepository

class FetchInfoAboutRandomNumberRepositoryImpl(private val service: RandomServices) :
    FetchInfoAboutRandomNumberRepository {
    override suspend fun fetchInfoAboutRandomNumber() = service.fetchInfoAboutRandomNumber()
}