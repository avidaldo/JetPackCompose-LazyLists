package com.example.lazylists_compose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


// https://www.youtube.com/watch?v=1ANt65eoNhQ&t=4s

@Composable
fun Ej01Screen() {

    val itemsList = (0..5).toList()
    val itemsIndexedList = listOf("A", "B", "C")

    LazyColumn {
        items(itemsList) {
            Text("Elemento de la lista: $it", Modifier.background(Color.Blue).padding(25.dp))
        }

        item {
            Text("Un solo elemento", Modifier.background(Color.Green).padding(25.dp))
        }

        itemsIndexed(itemsIndexedList) { index, item ->
            val color = if (index % 2 == 0) Color.Cyan else Color.Gray // (1)
            Text(
                "Elemento de la lista indexada con índice $index: $item",
                Modifier
                    .background(color)
                    .padding(25.dp)
            )
        }
    }
}


/**
 * (1) Definimos un color de fondo distinto para elementos pares e impares.
 */
