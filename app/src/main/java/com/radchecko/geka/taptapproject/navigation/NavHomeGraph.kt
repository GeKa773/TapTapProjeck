package com.radchecko.geka.taptapproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.radchecko.geka.taptapproject.ui.activity.home.screens.Screen
import com.radchecko.geka.taptapproject.ui.activity.home.screens.home.HomeScreen
import com.radchecko.geka.taptapproject.ui.activity.home.screens.splash.SplashScreen

@Composable
fun SetupNavHomeGraph(navHostController: NavHostController) {
    NavHost(navController = navHostController, startDestination = Screen.Splash.route) {

        composable(route = Screen.Splash.route) {
            SplashScreen(navHostController)
        }

        composable(route = Screen.Home.route) {
            HomeScreen(navHostController)
        }
    }
}