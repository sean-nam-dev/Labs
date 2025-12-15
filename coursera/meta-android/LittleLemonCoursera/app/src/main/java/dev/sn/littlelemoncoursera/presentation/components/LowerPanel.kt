package dev.sn.littlelemoncoursera.presentation.components

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import dev.sn.littlelemoncoursera.R
import dev.sn.littlelemoncoursera.domain.Dish
import dev.sn.littlelemoncoursera.util.Temp

@Composable
fun LowerPanel(
    isLoading: Boolean,
    dishList: List<Dish>,
    onMenuDishAction: (Int) -> Unit
) {
    LazyColumn(
        modifier = Modifier.fillMaxWidth(),
        contentPadding = PaddingValues(5.dp)
    ) {
        if (isLoading) {
            item {
                LinearProgressIndicator(modifier = Modifier.fillMaxWidth())
            }
        } else {
            itemsIndexed(dishList) { index, dish ->
                MenuDish(
                    dish = dish,
                    onClick = {
                        onMenuDishAction(index)
                    }
                )
            }
        }
    }
}