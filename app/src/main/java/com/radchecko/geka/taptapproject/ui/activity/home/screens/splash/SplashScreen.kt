package com.radchecko.geka.taptapproject.ui.activity.home.screens.splash

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.radchecko.geka.taptapproject.ui.activity.home.screens.Screen

@Composable
fun SplashScreen(navController: NavController) {
    Column(Modifier.fillMaxSize()) {
        Text(
            text = "Splash screen",
            modifier = Modifier.clickable {
                navController.navigate(route = Screen.Home.route)
            })
    }
}


@Preview(showBackground = true)
@Composable
fun SplashScreenPreview() {
    SplashScreen(navController = rememberNavController())
}