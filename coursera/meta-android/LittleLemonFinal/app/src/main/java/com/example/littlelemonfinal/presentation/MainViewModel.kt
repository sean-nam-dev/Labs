package com.example.littlelemonfinal.presentation

import android.util.Log
import androidx.lifecycle.ViewModel
import com.example.littlelemonfinal.domain.ReadStartDestinationUsecase

class MainViewModel(
    private val readStartDestinationUsecase: ReadStartDestinationUsecase
) : ViewModel() {

    fun getStartDestination(): String = readStartDestinationUsecase.invoke()

    fun test() {

    }
}

