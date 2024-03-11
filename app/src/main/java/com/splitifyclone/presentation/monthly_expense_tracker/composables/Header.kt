package com.splitifyclone.presentation.monthly_expense_tracker.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import com.splitifyclone.presentation.profile.ProfileScreen

@Composable
fun Header() {
    val navigator = LocalNavigator.currentOrThrow
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        IconButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(24.dp)
        ) {
            Icon(imageVector = Icons.Default.Home, contentDescription = "")
        }
        IconButton(
            onClick = {
                navigator.push(
                    ProfileScreen()
                )
            },
            modifier = Modifier.size(24.dp)
        ) {
            Icon(imageVector = Icons.Default.Menu, contentDescription = "")
        }
    }
}