package com.radchecko.geka.taptapproject.ui.screens

sealed class Screen(val route: String) {
    object Splash : Screen(route = "splash_screen")
    object Home : Screen(route = "detail_screen")
}