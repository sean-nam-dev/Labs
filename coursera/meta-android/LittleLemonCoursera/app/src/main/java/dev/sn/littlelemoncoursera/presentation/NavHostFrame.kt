package dev.sn.littlelemoncoursera.presentation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.MutableCreationExtras
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navigation
import androidx.navigation.toRoute
import dev.sn.littlelemoncoursera.data.DishRepositoryImpl
import dev.sn.littlelemoncoursera.navigation.Destination
import dev.sn.littlelemoncoursera.navigation.Navigator
import dev.sn.littlelemoncoursera.presentation.screen.DetailScreen
import dev.sn.littlelemoncoursera.presentation.screen.HomeScreen
import dev.sn.littlelemoncoursera.presentation.viewmodel.HomeViewModel
import dev.sn.littlelemoncoursera.util.getHomeViewModel

@Composable
fun NavHostFrame(
    modifier: Modifier = Modifier,
    navHostController: NavHostController,
    navigator: Navigator
) {
    NavHost(
        modifier = modifier,
        navController = navHostController,
        startDestination = navigator.startDestination
    ) {
        navigation<Destination.HomeGraph>(
            startDestination = Destination.HomeScreen
        ) {
            composable<Destination.HomeScreen> { backStackEntry ->
                val viewModel: HomeViewModel = getHomeViewModel(
                    backStackEntry,
                    navigator
                )

                HomeScreen(viewModel)
            }
            composable<Destination.DetailScreen> {
                val args = it.toRoute<Destination.DetailScreen>()
                val viewModel: HomeViewModel = getHomeViewModel(
                    navHostController.previousBackStackEntry,
                    navigator
                )

                DetailScreen(viewModel, args.id)
            }
        }
    }
}