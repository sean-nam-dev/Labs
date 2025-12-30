package com.example.littlelemonfinal.presentation.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun Title(modifier: Modifier = Modifier) {
    Text(
        modifier = modifier,
        text = "Personal information",
        fontWeight = FontWeight.SemiBold,
        fontSize = 20.sp
    )
}