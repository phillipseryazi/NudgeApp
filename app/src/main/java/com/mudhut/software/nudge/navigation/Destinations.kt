package com.mudhut.software.nudge.navigation

sealed class Destinations(val route: String) {
    object RegistrationScreen : Destinations("registration_screen")
    object LoginScreen : Destinations("login_screen")
}
