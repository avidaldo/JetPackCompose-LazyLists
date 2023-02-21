package com.example.lazylists_compose.ui.navigation

sealed class Screens(val route: String){
    object MainScreen: Screens("initial_screen")
    object Ejemplo01: Screens("ej01")
    object Ejemplo02: Screens("ej02")
    object Ejemplo03: Screens("ej03")
    object Ejemplo04: Screens("ej04")
    object Ejemplo05: Screens("ej05")

}
