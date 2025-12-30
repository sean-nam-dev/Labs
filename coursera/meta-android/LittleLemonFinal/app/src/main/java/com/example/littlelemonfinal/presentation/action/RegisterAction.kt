package com.example.littlelemonfinal.presentation.action

interface RegisterAction {
    fun changeStartNavigation()

    fun savePersonalInfo(data: Triple<String, String, String>)
}