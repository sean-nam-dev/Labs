package dev.sn.littlelemoncoursera

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import dev.sn.littlelemoncoursera.navigation.DefaultNavigator
import dev.sn.littlelemoncoursera.navigation.NavigationAction
import dev.sn.littlelemoncoursera.navigation.Navigator
import dev.sn.littlelemoncoursera.presentation.NavHostFrame
import dev.sn.littlelemoncoursera.presentation.components.TopAppBar
import dev.sn.littlelemoncoursera.ui.theme.LittleLemonCourseraTheme
import dev.sn.littlelemoncoursera.ui.theme.White
import dev.sn.littlelemoncoursera.util.ObserveAsEvents

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val navHostController = rememberNavController()
            val navigator = DefaultNavigator()

            ObserveAsEvents(
                navigator.navigationActions
            ) { action ->
                when (action) {
                    is NavigationAction.Navigate -> {
                        navHostController.navigate(route = action.destination) {
                            action.navOptions(this)
                        }
                    }
                    is NavigationAction.NavigateUp -> {
                        navHostController.navigateUp()
                    }
                }
            }

            LittleLemonCourseraTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar()
                    },
                    content = { paddingValues ->
                        NavHostFrame(
                            modifier = Modifier.padding(paddingValues),
                            navHostController = navHostController,
                            navigator = navigator
                        )
                    }
                )
            }
        }
    }
}