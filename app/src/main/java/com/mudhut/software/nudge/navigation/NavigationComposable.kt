package com.mudhut.software.nudge.navigation

import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mudhut.software.nudge.authentication.screens.LoginScreen
import com.mudhut.software.nudge.authentication.screens.RegistrationScreen

@Composable
fun NavigationComposable() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Destinations.RegistrationScreen.route
    ) {
        composable(route = Destinations.RegistrationScreen.route) {
            RegistrationScreen(
                navController = navController,
                viewModel = viewModel()
            )
        }

        composable(route = Destinations.LoginScreen.route) {
            LoginScreen(
                navController = navController,
                viewModel = viewModel()
            )
        }
    }
}

