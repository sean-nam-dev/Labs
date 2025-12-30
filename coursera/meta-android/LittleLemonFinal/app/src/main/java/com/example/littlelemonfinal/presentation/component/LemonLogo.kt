package com.example.littlelemonfinal.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.littlelemonfinal.R
import com.example.littlelemonfinal.ui.theme.LittleLemonFinalTheme

@Composable
fun LemonLogo(
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(R.drawable.little_lemon_logo),
        contentDescription = null,
        modifier = modifier.width(200.dp)
            .height(60.dp)
    )
}

@Preview(showBackground = true)
@Composable
private fun LemonLogoPreview() {
    LittleLemonFinalTheme {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 20.dp),
            contentAlignment = Alignment.Center
        ) {
            LemonLogo()
        }
    }
}