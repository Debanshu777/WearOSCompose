package com.debanshu777.wearcomposeTicTacToe.common

sealed class Screen(val route: String){
    object BaseScreen: Screen("base_screen")
    object GameScreen: Screen("game_screen")
}
