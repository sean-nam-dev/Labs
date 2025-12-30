package com.example.littlelemonfinal.presentation.screen

import androidx.compose.runtime.Composable
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.navigation.NavController
import com.example.littlelemonfinal.navigation.Destination
import com.example.littlelemonfinal.presentation.ui.HomeUIScreen
import com.example.littlelemonfinal.presentation.viewmodel.HomeViewModel

@Composable
fun HomeScreen(
    homeViewModel: HomeViewModel,
    navController: NavController
) {
    val state = homeViewModel.state.collectAsStateWithLifecycle(true)

    HomeUIScreen(
        onProfileClick = {
            navController.navigate(Destination.LogOut)
        },
        isLoading = state.value
    )
}