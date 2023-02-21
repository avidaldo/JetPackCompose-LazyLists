package com.example.lazylists_compose.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Ej02Screen() {

    val itemsList = (0..5).toList()
    val itemsIndexedList = listOf("A", "B", "C")

    LazyRow(
        Modifier
            .padding(5.dp)
            .background(Color.Magenta), // padding fijo que rodea el elemento
        contentPadding = PaddingValues(5.dp) // padding solo en los bordes, al hacer scroll desaparece
    ) {
        items(itemsList) {
            Text(
                "Elemento de la lista: $it",
                Modifier
                    .background(Color.Blue)
                    .padding(5.dp)
            )
        }

        item {
            Text(
                "Un solo elemento",
                Modifier
                    .background(Color.Green)
                    .padding(5.dp)
            )
        }

        itemsIndexed(itemsIndexedList) { index, item ->
            Text(
                "Elemento de la lista indexada con índice $index: $item",
                Modifier
                    .background(if (index % 2 == 0) Color.Cyan else Color.Gray)
                    .padding(5.dp)
            )
        }
    }
}



