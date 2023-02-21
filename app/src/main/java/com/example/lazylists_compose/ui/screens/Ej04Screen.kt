package com.example.lazylists_compose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Ej04Screen() {

    val itemsList = (0..20).toList()

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        Modifier
            .padding(5.dp)
            .background(Color.Magenta),
        contentPadding = PaddingValues(10.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp),
    ) {
        items(itemsList) {
            Text(
                "Elemento $it",
                Modifier
                    .background(Color.Blue)
                    .padding(vertical = 15.dp, horizontal = 5.dp)
            )
        }


    }
}



