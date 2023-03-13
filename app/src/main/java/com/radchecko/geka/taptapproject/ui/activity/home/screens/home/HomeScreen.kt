package com.radchecko.geka.taptapproject.ui.activity.home.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController) {
    Column(Modifier.fillMaxSize()) {
        Text(text = "Home screen")
    }
}