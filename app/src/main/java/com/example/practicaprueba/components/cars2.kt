package com.example.practicaprueba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.unit.dp

/**
 * Card con imagen a la izquierda, título y texto a la derecha.
 */
@Composable
fun CardConImagen2(
    imagen: Painter,
    titulo: String,
    descripcion: String,
    ultimoTexto: String,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        elevation = CardDefaults.cardElevation(4.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = imagen,
                contentDescription = null,
                modifier = Modifier.size(120.dp) // ajusta el tamaño a tu gusto
            )

            Spacer(modifier = Modifier.width(16.dp)) // separación entre imagen y texto

            Column(
                verticalArrangement = Arrangement.Center,
            ) {
                Text(text = titulo)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = descripcion)
                Spacer(modifier = Modifier.height(4.dp))
                Text(text = ultimoTexto)
            }
        }
    }
}