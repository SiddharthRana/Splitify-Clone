package com.splitifyclone.presentation.monthly_expense_tracker.composables

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.splitifyclone.presentation.common.CustomCard
import com.splitifyclone.presentation.history.HistoryScreen

@Composable
fun MonthlyExpenseTracker() {
    val navigator = LocalNavigator.currentOrThrow
    Row {
        CustomCard(
            modifier = Modifier
                .weight(0.5f)
                .height(200.dp),
            onClickHandle = { }
        ) {
            Text(
                text = "This Month",
                fontWeight = FontWeight.Light,
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            Text(
                text = "800",
                fontWeight = FontWeight.SemiBold,
                fontSize = 24.sp,
                color = Color.Black
            )
        }
        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
        CustomCard(
            modifier = Modifier
                .weight(0.5f)
                .height(200.dp),
            onClickHandle = { navigator.push(HistoryScreen()) }
        ) {
            Text(
                text = "Past Prices",
                fontWeight = FontWeight.Normal,
                fontSize = 20.sp,
                color = Color.Black
            )
        }
    }
}