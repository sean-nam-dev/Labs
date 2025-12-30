package com.example.littlelemonfinal.presentation.component

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.SuggestionChipDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CategoryBlock() {
    val tagList = listOf("Starters", "Mains", "Desserts", "Drinks", "Soups")
    val context = LocalContext.current

    Column(
        modifier = Modifier.fillMaxWidth()
            .padding(
                horizontal = 10.dp,
                vertical = 25.dp
            ),
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            text = "ORDER FOR DELIVERY!",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        LazyRow(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.spacedBy(15.dp)
        ) {
            items(tagList) { tag ->
                SuggestionChip(
                    onClick = {
                        Toast.makeText(context, tag, Toast.LENGTH_SHORT).show()
                    },
                    label = {
                        Text(tag, fontWeight = FontWeight.Bold)
                    },
                    colors = SuggestionChipDefaults.suggestionChipColors(
                        containerColor = Color(0xFFedefee),
                        labelColor = Color(0xFF4d625b)
                    ),
                    border = BorderStroke(
                        width = 0.dp,
                        color = Color(0xFFedefee)
                    )
                )
            }
        }
    }
}