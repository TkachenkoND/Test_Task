package com.myproject.testtask.di

import com.myproject.testtask.data.repository_impl.FetchInfoAboutRandomNumberRepositoryImpl
import com.myproject.testtask.data.repository_impl.FetchInfoAboutUserNumberRepositoryImpl
import com.myproject.testtask.domain.repository.DataBaseRepository
import com.myproject.testtask.domain.repository.FetchInfoAboutRandomNumberRepository
import com.myproject.testtask.domain.repository.FetchInfoAboutUserNumberRepository
import org.koin.dsl.module

val dataModule = module {
    single<FetchInfoAboutUserNumberRepository> { FetchInfoAboutUserNumberRepositoryImpl(get()) }
    single<FetchInfoAboutRandomNumberRepository> { FetchInfoAboutRandomNumberRepositoryImpl(get()) }
    //single<DataBaseRepository> { DataBaseRepositoryImpl(get()) }
}