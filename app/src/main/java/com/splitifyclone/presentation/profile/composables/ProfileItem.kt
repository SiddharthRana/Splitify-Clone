package com.splitifyclone.presentation.profile.composables

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.splitifyclone.presentation.common.CustomCard

@Composable
fun ProfileItem(
    text: String,
    hasIcon: Boolean = false,
    icon: ImageVector,
    color: Color,
) {
    CustomCard(
        modifier = Modifier
            .height(100.dp),
        onClickHandle = { }
    ) {
        if (!hasIcon) {
            Text(
                text = "YOUR BATCH CODE",
                fontWeight = FontWeight.Light,
                fontSize = 16.sp,
                color = Color.Gray
            )
            Spacer(modifier = Modifier.padding(vertical = 12.dp))
            Text(
                text = text,
                fontWeight = FontWeight.SemiBold,
                fontSize = 18.sp,
                color = Color.Gray
            )
        } else {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = icon, contentDescription = "", tint = color)
                Text(
                    text = text,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 18.sp,
                    color = Color.Gray,
                    modifier = Modifier.padding(16.dp, 0.dp, 0.dp, 0.dp)
                )
            }
        }
    }
}