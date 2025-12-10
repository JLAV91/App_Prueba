package com.example.practicaprueba.components

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun IndicadorCard(
    nombre: String,
    valor: Double,
    color: Color
) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp),
        colors = CardDefaults.cardColors(
            containerColor = color.copy(alpha = 0.15f)
        )
    ) {
        Row(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column {
                Text(
                    text = nombre,
                    style = MaterialTheme.typography.titleMedium,
                    color = color
                )
                Spacer(modifier = Modifier.height(4.dp))
                Text(
                    text = "$valor",
                    style = MaterialTheme.typography.headlineSmall
                )
            }
        }
    }
}
