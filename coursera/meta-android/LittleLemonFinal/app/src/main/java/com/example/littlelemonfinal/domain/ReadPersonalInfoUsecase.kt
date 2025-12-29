package com.example.littlelemonfinal.domain

class ReadPersonalInfoUsecase(
    private val sharedPrefsRepository: SharedPrefsRepository
) {
    fun invoke() = Triple(
        sharedPrefsRepository.read(FIRST_NAME),
        sharedPrefsRepository.read(LAST_NAME),
        sharedPrefsRepository.read(EMAIL)
    )

    companion object {
        const val FIRST_NAME = "first_name"
        const val LAST_NAME = "last_name"
        const val EMAIL = "email_name"
    }
}