package com.myproject.testtask.data.repository_impl

import com.myproject.testtask.data.services.BaseServices
import com.myproject.testtask.domain.repository.FetchInfoAboutUserNumberRepository

class FetchInfoAboutUserNumberRepositoryImpl(private val service: BaseServices) :
    FetchInfoAboutUserNumberRepository {
    override suspend fun fetchInfoAboutNumber(number: Int) = service.fetchInfoAboutNumber(number)
}