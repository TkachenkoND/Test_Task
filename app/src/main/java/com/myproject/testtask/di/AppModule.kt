package com.myproject.testtask.di

import com.myproject.testtask.presentation.view_model.SharedViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel { SharedViewModel(get(), get(), get(), get()) }
}