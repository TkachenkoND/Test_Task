package com.myproject.testtask.presentation.view_model

import androidx.lifecycle.ViewModel
import com.myproject.testtask.domain.usecase.FetchInfoAboutRandomNumberUseCase
import com.myproject.testtask.domain.usecase.FetchInfoAboutUserNumberUseCase
import com.myproject.testtask.domain.usecase.SaveInfoInDbUseCase
import com.myproject.testtask.domain.usecase.GetListInfoFromDbUseCase

class SharedViewModel(
    private val fetchInfoAboutUserNumberUseCase: FetchInfoAboutUserNumberUseCase,
    private val fetchInfoAboutRandomNumberUseCase: FetchInfoAboutRandomNumberUseCase,
    private val saveInfoInDbUseCase: SaveInfoInDbUseCase,
    private val GetListInfoFromDbUseCase: GetListInfoFromDbUseCase
) : ViewModel() {

}