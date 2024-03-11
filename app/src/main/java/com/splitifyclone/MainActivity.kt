package com.splitifyclone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import cafe.adriel.voyager.navigator.Navigator
import cafe.adriel.voyager.transitions.SlideTransition
import com.splitifyclone.presentation.monthly_expense_tracker.MonthlyExpenseTrackerScreen
import com.splitifyclone.ui.theme.SplitifyCloneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SplitifyCloneTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color.White
                ) {
                    Navigator(MonthlyExpenseTrackerScreen()) { navigator ->
                        SlideTransition(navigator)
                    }
                }
            }
        }
    }
}