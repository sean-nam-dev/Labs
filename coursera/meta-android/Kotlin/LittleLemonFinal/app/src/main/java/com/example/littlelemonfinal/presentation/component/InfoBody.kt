package com.example.littlelemonfinal.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonfinal.R

@Composable
fun InfoBody(
    searchText: String,
    onSearchText: (String) -> Unit
) {
    Column(
        modifier = Modifier.fillMaxWidth()
            .background(Color(0xFF495e57))
            .padding(10.dp)
    ) {
        Text(
            text = "Little Lemon",
            fontSize = 50.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color(0xFFf4ce14)
        )
        Row(
            modifier = Modifier.fillMaxWidth()
                .height(130.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(modifier = Modifier.weight(0.65f)) {
                Text(
                    text = "Chicago",
                    fontSize = 30.sp,
                    color = Color.White
                )
                Text(
                    text = "We are a family owned Mediterranean restaurant, focused on traditional recipes served with a modern twist.",
                    fontSize = 15.sp,
                    color = Color.White,
                    modifier = Modifier.padding(top = 20.dp),
                    lineHeight = 18.sp
                )
            }
            Image(
                modifier = Modifier.weight(0.35f)
                    .clip(RoundedCornerShape(10))
                    .aspectRatio(1f),
                painter = painterResource(R.drawable.stock_img),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
        }
        TextField(
            value = searchText,
            onValueChange = onSearchText,
            modifier = Modifier.fillMaxWidth()
                .padding(
                    top = 15.dp,
                    bottom = 5.dp
                ),
            placeholder = {
                Text("Enter search phrase")
            },
            leadingIcon = {
                Icon(
                    imageVector = Icons.Rounded.Search,
                    contentDescription = null
                )
            }
        )
    }
}