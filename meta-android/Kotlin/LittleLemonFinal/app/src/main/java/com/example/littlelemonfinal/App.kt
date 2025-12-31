package com.example.littlelemonfinal

import android.app.Application
import com.example.littlelemonfinal.di.dataModule
import com.example.littlelemonfinal.di.domainModule
import com.example.littlelemonfinal.di.uiModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {
    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
            modules(domainModule, dataModule, uiModule)
        }
    }
}