package com.example.littlelemonfinal.di

import com.example.littlelemonfinal.presentation.viewmodel.HomeViewModel
import com.example.littlelemonfinal.presentation.viewmodel.LogoutViewModel
import com.example.littlelemonfinal.presentation.viewmodel.MainViewModel
import com.example.littlelemonfinal.presentation.viewmodel.RegisterViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val uiModule = module {

    viewModel<MainViewModel> {
        MainViewModel(
            readStartDestinationUsecase = get()
        )
    }

    viewModel<RegisterViewModel> {
        RegisterViewModel(
            writeStartDestinationUsecase = get(),
            writePersonalInfoUsecase = get(),
        )
    }

    viewModel<LogoutViewModel> {
        LogoutViewModel(
            readPersonalInfoUsecase = get(),
            writePersonalInfoUsecase = get(),
            writeStartDestinationUsecase = get()
        )
    }

    viewModel<HomeViewModel> {
        HomeViewModel(
            networkFetchUsecase = get()
        )
    }
}