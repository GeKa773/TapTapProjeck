package com.radchecko.geka.taptapproject.ui.activity.games.taptap

import androidx.annotation.FloatRange
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.radchecko.geka.taptapproject.ui.activity.games.taptap.data.TapButtonData

@Composable
fun TapButton(tapButtonData: TapButtonData, onClick: (TapButtonData) -> Unit) {
    Button(
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp),
        shape = RoundedCornerShape(4.dp),
        onClick = { onClick.invoke(tapButtonData) },
    ) { Unit }
}

