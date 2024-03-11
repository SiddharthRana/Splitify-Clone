package com.splitifyclone.presentation.monthly_expense_tracker.composables

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.splitifyclone.util.Constants.listOfFriends

@Composable
fun FriendsList() {
    Column {
        listOfFriends.forEach { friend ->
            Text(
                text = "${friend.name}: ${friend.moneySpent}",
                fontWeight = FontWeight.Normal,
                fontSize = 18.sp,
                color = Color.Blue,
            )
            Spacer(modifier = Modifier.padding(vertical = 8.dp))
        }
    }
}