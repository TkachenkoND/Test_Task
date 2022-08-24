package com.myproject.testtask.domain.usecase

import com.myproject.testtask.domain.repository.FetchInfoAboutRandomNumberRepository

class FetchInfoAboutRandomNumberUseCase(private val repository: FetchInfoAboutRandomNumberRepository) {
    suspend fun execute() = repository.fetchInfoAboutRandomNumber()
}