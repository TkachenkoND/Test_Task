package com.myproject.testtask.domain.usecase

import com.myproject.testtask.domain.repository.FetchInfoAboutUserNumberRepository

class FetchInfoAboutUserNumberUseCase(private val repository: FetchInfoAboutUserNumberRepository) {
    suspend fun execute(number: Int) = repository.fetchInfoAboutNumber(number)
}