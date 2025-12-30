package com.example.littlelemonfinal.presentation.screen

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import com.example.littlelemonfinal.navigation.Destination
import com.example.littlelemonfinal.presentation.ui.RegisterUIScreen
import com.example.littlelemonfinal.presentation.viewmodel.RegisterViewModel

@Composable
fun RegisterScreen(
    viewModel: RegisterViewModel,
    navController: NavHostController
) {
    RegisterUIScreen(
        onRegisterClickAction = { data ->
            viewModel.changeStartNavigation()
            viewModel.savePersonalInfo(data)
            navController.navigate(Destination.Home)
        }
    )
}