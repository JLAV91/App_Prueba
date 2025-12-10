package com.example.practicaprueba.pages

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.unit.dp
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.example.practicaprueba.viewmodel.CajaCrearViewModel
import com.example.practicaprueba.network.RetrofitClient
import com.example.practicaprueba.viewmodel.CrearUserViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CreaUser(
    navController: NavController,
    viewModel: CrearUserViewModel = viewModel()
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center
    ) {

        OutlinedTextField(
            value = viewModel.nombre,
            onValueChange = { viewModel.nombre = it },
            label = { Text("Nombre") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.apellido,
            onValueChange = { viewModel.apellido = it },
            label = { Text("Apellido") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.email,
            onValueChange = { viewModel.email = it },
            label = { Text("Correo") },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value = viewModel.password,
            onValueChange = { viewModel.password = it },
            label = { Text("Contraseña") },
            modifier = Modifier.fillMaxWidth(),
            visualTransformation = PasswordVisualTransformation()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                println("BOTÓN PRESIONADO")   // DEBUG 1

                viewModel.registrarUsuario(
                    onSuccess = {
                        println("USUARIO CREADO")  // DEBUG 2
                        navController.popBackStack()
                    },
                    onError = { msg ->
                        println("ERROR REGISTRO: $msg") // DEBUG 3
                    }
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Crear usuario")
        }
    }
}