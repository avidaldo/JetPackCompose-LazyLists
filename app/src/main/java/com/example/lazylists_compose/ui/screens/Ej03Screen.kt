package com.example.lazylists_compose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Ej03Screen() {

    val itemsList = (0..5).toList()

    LazyRow(
        Modifier
            .padding(5.dp)
            .background(Color.Magenta),
        contentPadding = PaddingValues(10.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp) // separación entre los elementos
    ) {
        items(itemsList) {
            Text(
                "Elemento $it",
                Modifier
                    .background(Color.Blue)
                    .padding(5.dp)
            )
        }


    }
}



