package com.example.littlelemonfinal.domain.usecase

import com.example.littlelemonfinal.domain.repository.SharedPrefsRepository
import com.example.littlelemonfinal.domain.Util

class ReadStartDestinationUsecase(
    private val sharedPrefsRepository: SharedPrefsRepository
) {
    operator fun invoke() = sharedPrefsRepository.read(Util.START_DESTINATION)
}