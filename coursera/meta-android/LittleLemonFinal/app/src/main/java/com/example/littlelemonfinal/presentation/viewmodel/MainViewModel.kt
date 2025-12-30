package com.example.littlelemonfinal.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.example.littlelemonfinal.domain.ReadStartDestinationUsecase

class MainViewModel(
    private val readStartDestinationUsecase: ReadStartDestinationUsecase
) : ViewModel() {

    fun getStartDestination(): String = readStartDestinationUsecase.invoke()
}