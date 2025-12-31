package com.example.littlelemonfinal.di

import com.example.littlelemonfinal.domain.usecase.NetworkFetchUsecase
import com.example.littlelemonfinal.domain.usecase.ReadPersonalInfoUsecase
import com.example.littlelemonfinal.domain.usecase.ReadStartDestinationUsecase
import com.example.littlelemonfinal.domain.usecase.WritePersonalInfoUsecase
import com.example.littlelemonfinal.domain.usecase.WriteStartDestinationUsecase
import org.koin.dsl.module

val domainModule = module {

    factory<ReadStartDestinationUsecase> {
        ReadStartDestinationUsecase(
            sharedPrefsRepository = get()
        )
    }

    factory<WriteStartDestinationUsecase> {
        WriteStartDestinationUsecase(
            sharedPrefsRepository = get()
        )
    }

    factory<ReadPersonalInfoUsecase> {
        ReadPersonalInfoUsecase(
            sharedPrefsRepository = get()
        )
    }

    factory<WritePersonalInfoUsecase> {
        WritePersonalInfoUsecase(
            sharedPrefsRepository = get()
        )
    }

    factory<NetworkFetchUsecase> {
        NetworkFetchUsecase(
            networkRepository = get()
        )
    }
}