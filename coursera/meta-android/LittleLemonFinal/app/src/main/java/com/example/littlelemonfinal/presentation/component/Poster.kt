package com.example.littlelemonfinal.presentation.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonfinal.ui.theme.LittleLemonFinalTheme

@Composable
fun Poster(modifier: Modifier = Modifier) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(100.dp)
            .background(color = Color(0xFF485e57)),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = "Let's get to know you",
            fontSize = 25.sp,
            color = Color.White
        )
    }
}

@Preview
@Composable
private fun PosterPreview() {
    LittleLemonFinalTheme {
        Poster()
    }
}