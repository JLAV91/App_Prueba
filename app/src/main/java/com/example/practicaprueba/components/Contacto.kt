package com.example.practicaprueba.components

import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext // 👈 importa esto
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun Contacto(navController: NavController) {
    val context = LocalContext.current
    var nombre by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var mensagge by remember { mutableStateOf("") }

    Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
                .padding(0.dp)
                .background(Color.White),


            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TextField(
                value = nombre,
                onValueChange = { nombre = it },
                label = { Text("Nombre") },
                singleLine = true
            )

            Spacer(modifier = Modifier.height(10.dp))

            TextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Correo") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = Modifier.height(20.dp))

            TextField(
                value = mensagge,
                onValueChange = { mensagge = it },
                label = { Text("Mensaje") },
                singleLine = true,
                visualTransformation = PasswordVisualTransformation(),
                modifier = Modifier
                    .height(30.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))


            Button(onClick = {
                Toast.makeText(
                    context,
                    "Mensaje enviado",
                    Toast.LENGTH_SHORT
                ).show()
            }) {
                Text("Enviar mensaje")
            }
        }
    }
}
