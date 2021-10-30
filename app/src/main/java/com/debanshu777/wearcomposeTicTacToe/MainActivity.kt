package com.debanshu777.wearcomposeTicTacToe

import android.os.Bundle
import android.view.Surface
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.wear.compose.material.*
import androidx.wear.compose.navigation.SwipeDismissableNavHost
import androidx.wear.compose.navigation.composable
import androidx.wear.compose.navigation.rememberSwipeDismissableNavController
import com.debanshu777.wearcomposeTicTacToe.common.Screen
import com.debanshu777.wearcomposeTicTacToe.feature.feature_BaseScreen.presentation.BaseScreen
import com.debanshu777.wearcomposeTicTacToe.feature.feature_GameScreen.presentation.GameScreen
import com.debanshu777.wearcomposeTicTacToe.ui.theme.WearAppTheme


/**
 * Simple "Hello, World" app meant as a starting point for a new project using Compose for Wear OS.
 *
 * Displays only a centered [Text] composable, and the actual text varies based on the shape of the
 * device (round vs. square/rectangular).
 *
 * If you plan to have multiple screens, use the Wear version of Compose Navigation. You can carry
 * over your knowledge from mobile and it supports the swipe-to-dismiss gesture (Wear OS's
 * back action). For more information, go here:
 * https://developer.android.com/reference/kotlin/androidx/wear/compose/navigation/package-summary
 */
class MainActivity : ComponentActivity() {
    @ExperimentalWearMaterialApi
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            WearAppTheme {
                Scaffold(
                   timeText = { TimeText()}
                ){
                    val navHostController = rememberSwipeDismissableNavController()
                    SwipeDismissableNavHost(
                        navController = navHostController,
                        startDestination = Screen.BaseScreen.route
                    ){
                        composable(Screen.BaseScreen.route){
                            BaseScreen(navController = navHostController)
                        }
                        composable(Screen.GameScreen.route){
                            GameScreen()
                        }
                    }
                }
            }
        }
    }
}