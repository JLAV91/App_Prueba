package com.example.practicaprueba.pages


import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreaCuenta(navController: NavController) {
    Scaffold(
        topBar = {
            TopAppBar(title = { Text("Crear cuenta") })
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(text = "Creacion de cuenta")
            Spacer(modifier = Modifier.height(20.dp))
            Button(onClick = { navController.popBackStack() }) {
                Text("Volver al login")
            }
        }
    }
}