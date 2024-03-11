package com.splitifyclone.presentation.monthly_expense_tracker.composables

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.splitifyclone.presentation.common.CustomCard

@Composable
fun FooterButtons() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        CustomCard(
            modifier = Modifier
                .width(200.dp)
                .height(50.dp), onClickHandle = { }
        ) {
            Text(text = "Show Expenses")
        }
        Spacer(modifier = Modifier.padding(horizontal = 8.dp))
        OutlinedButton(
            onClick = { /*TODO*/ },
            modifier = Modifier.size(50.dp),
            shape = CircleShape,
            border = BorderStroke(1.dp, Color.Blue),
            colors = ButtonDefaults.outlinedButtonColors(contentColor = Color.Blue),
            contentPadding = PaddingValues(0.dp),
        ) {
            Icon(
                Icons.Default.Add,
                contentDescription = "content description",
                tint = Color.Blue
            )
        }
    }
}