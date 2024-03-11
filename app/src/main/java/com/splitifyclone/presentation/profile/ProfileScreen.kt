package com.splitifyclone.presentation.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import com.splitifyclone.presentation.profile.composables.Header
import com.splitifyclone.presentation.profile.composables.ProfileItem

class ProfileScreen : Screen {
    @Composable
    override fun Content() {
        Column(
            modifier = Modifier.padding(horizontal = 16.dp)
        ) {
            Header()
            ProfileItem(
                text = "6527364",
                icon = Icons.Default.Home,
                color = Color.White,
                hasIcon = false
            )
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            ProfileItem(
                text = "Share app",
                icon = Icons.Default.Share,
                color = Color.Blue,
                hasIcon = true
            )
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            ProfileItem(
                text = "Rate us",
                icon = Icons.Default.Star,
                color = Color.Yellow,
                hasIcon = true
            )
            Spacer(modifier = Modifier.padding(vertical = 16.dp))
            ProfileItem(
                text = "Logout",
                icon = Icons.Default.ExitToApp,
                color = Color.Red,
                hasIcon = true
            )
        }
    }
}