package com.example.practicaprueba.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicaprueba.components.Contacto
import com.example.practicaprueba.components.imgLogo

@Composable
fun NotificationsPage(navController: NavController, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(horizontal = 16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Logo en la parte superior
        Spacer(modifier = Modifier.height(40.dp))
        imgLogo()

        // Espacio arriba que empuja el formulario al centro
        Spacer(modifier = Modifier.weight(1f))

        Contacto(navController = navController)

        // Espacio abajo
        Spacer(modifier = Modifier.weight(1f))
    }
}