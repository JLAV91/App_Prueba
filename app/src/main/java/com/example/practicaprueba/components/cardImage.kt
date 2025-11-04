package com.example.practicaprueba.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun CardSoloImagen(
    imagen: Painter,
    modifier: Modifier = Modifier
) {
    Card (
        modifier = modifier
            .fillMaxWidth()
            .padding(8.dp),
        colors = CardDefaults.cardColors(
            containerColor = Color.Transparent // sin fondo
        ),
        elevation = CardDefaults.cardElevation(0.dp), // sin sombra
        shape = RoundedCornerShape(0.dp) // sin bordes redondeados
    ) {
        Image(
            painter = imagen,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(201.dp),
            contentScale = ContentScale.Crop // recorta y llena el espacio
        )
    }
}
