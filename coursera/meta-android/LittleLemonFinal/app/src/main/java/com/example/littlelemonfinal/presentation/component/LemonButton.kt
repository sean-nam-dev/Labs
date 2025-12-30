package com.example.littlelemonfinal.presentation.component

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonfinal.ui.theme.LittleLemonFinalTheme

@Composable
fun LemonButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.fillMaxWidth(),
        onClick = onClick,
        shape = RoundedCornerShape(15),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(0xFFf4ce14),
            contentColor = Color(0xFF433907)
        ),
        border = BorderStroke(
            width = 2.dp,
            color = Color(0xFFdda829)
        )
    ) {
        Text(text = text)
    }
}

@Preview
@Composable
private fun LemonButtonPreview() {
    LittleLemonFinalTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            LemonButton(
                modifier = Modifier,
                text = "Register",
                onClick = {

                }
            )
        }
    }
}