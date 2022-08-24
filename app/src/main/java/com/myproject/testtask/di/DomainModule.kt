package com.myproject.testtask.di

import com.myproject.testtask.domain.usecase.FetchInfoAboutRandomNumberUseCase
import com.myproject.testtask.domain.usecase.FetchInfoAboutUserNumberUseCase
import com.myproject.testtask.domain.usecase.GetListInfoFromDbUseCase
import com.myproject.testtask.domain.usecase.SaveInfoInDbUseCase
import org.koin.dsl.module

val domainModule = module {
    factory { FetchInfoAboutUserNumberUseCase(get()) }
    factory { FetchInfoAboutRandomNumberUseCase(get()) }
    //factory { SaveInfoInDbUseCase(get()) }
    //factory { GetListInfoFromDbUseCase(get()) }
}