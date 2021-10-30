package com.debanshu777.wearcomposeTicTacToe.feature.feature_BaseScreen.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.wear.compose.material.Button
import androidx.wear.compose.material.Text
import com.debanshu777.wearcomposeTicTacToe.common.Screen

@Composable
fun BaseScreen(
    navController: NavController,
){
    Column (
        modifier = Modifier
            .fillMaxSize()
            .clip(RoundedCornerShape(bottomEnd = 30.dp, bottomStart = 30.dp)),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(text = "Base Screen")
        Button(onClick = { navController.navigate(Screen.GameScreen.route) }) {
            Text(text = "Game Screen")
        }
    }
}