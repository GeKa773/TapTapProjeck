package com.radchecko.geka.taptapproject.ui.activity.games.taptap.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.radchecko.geka.taptapproject.ui.activity.games.taptap.TapButton
import com.radchecko.geka.taptapproject.ui.activity.games.taptap.data.TapButtonData

@Composable
fun TapTapScreen() {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.Gray),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {

        repeat(5) { first ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceAround
            ) {
                repeat(5) { second ->
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .weight(1f,true ),
                    ) {
                        TapButton(tapButtonData = TapButtonData(Pair(first, second), true), onClick = {

                        })
                    }
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TapTapPreview() {
    TapTapScreen()
}