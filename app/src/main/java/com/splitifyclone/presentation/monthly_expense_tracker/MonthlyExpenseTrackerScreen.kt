package com.splitifyclone.presentation.monthly_expense_tracker

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cafe.adriel.voyager.core.screen.Screen
import com.splitifyclone.presentation.monthly_expense_tracker.composables.FooterButtons
import com.splitifyclone.presentation.monthly_expense_tracker.composables.FriendsList
import com.splitifyclone.presentation.monthly_expense_tracker.composables.Header
import com.splitifyclone.presentation.monthly_expense_tracker.composables.MonthlyExpenseTracker

class MonthlyExpenseTrackerScreen : Screen {

    @Composable
    override fun Content() {
        LazyColumn(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            item {
                Header()
                Text(
                    text = "Monthly Expense Tracker",
                    color = Color.Blue,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Medium
                )
                Spacer(modifier = Modifier.padding(vertical = 8.dp))
                MonthlyExpenseTracker()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
                Text(
                    text = "Spent By:",
                    color = Color.Black,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Normal,
                )
                Spacer(modifier = Modifier.padding(vertical = 8.dp))
                FriendsList()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
                FooterButtons()
                Spacer(modifier = Modifier.padding(vertical = 16.dp))
            }
        }
    }
}