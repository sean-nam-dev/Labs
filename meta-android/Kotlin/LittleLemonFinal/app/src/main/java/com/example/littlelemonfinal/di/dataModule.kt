package com.example.littlelemonfinal.di

import android.content.Context
import android.content.SharedPreferences
import com.example.littlelemonfinal.data.remote.Api
import com.example.littlelemonfinal.data.repository.NetworkRepositoryImpl
import com.example.littlelemonfinal.data.repository.SharedPrefsRepositoryImpl
import com.example.littlelemonfinal.domain.repository.NetworkRepository
import com.example.littlelemonfinal.domain.repository.SharedPrefsRepository
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val dataModule = module {

    single<Api> {
        Api()
    }

    single<SharedPreferences> {
        androidContext().getSharedPreferences(
            "shared_prefs",
            Context.MODE_PRIVATE
        )
    }

    single<SharedPrefsRepository> {
        SharedPrefsRepositoryImpl(
            sharedPrefs = get()
        )
    }

    single<NetworkRepository> {
        NetworkRepositoryImpl(
            api = get()
        )
    }
}