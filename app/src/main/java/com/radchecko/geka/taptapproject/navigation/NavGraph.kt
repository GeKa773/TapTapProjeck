package com.radchecko.geka.taptapproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavGraph
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.radchecko.geka.taptapproject.ui.screens.Screen
import com.radchecko.geka.taptapproject.ui.screens.home.HomeScreen
import com.radchecko.geka.taptapproject.ui.screens.splash.SplashScreen

@Composable
fun SetupNavGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {

        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController)
        }

        composable(route = Screen.Home.route) {
            HomeScreen(navHostController)
        }
    }
}