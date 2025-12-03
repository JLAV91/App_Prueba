package com.example.practicaprueba.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicaprueba.network.ApiService
import com.example.practicaprueba.network.CrearUsuarioRequest
import com.example.practicaprueba.network.RetrofitClient
import kotlinx.coroutines.launch

class CajaCrearViewModel() : ViewModel() {
    private val apiService = RetrofitClient.apiService


    val nombre = mutableStateOf("")
    val apellido = mutableStateOf("")
    val email = mutableStateOf("")
    val password = mutableStateOf("")

    fun validarDatos(): Boolean {
        return nombre.value.isNotBlank() &&
                apellido.value.isNotBlank() &&
                email.value.contains("@") &&
                password.value.length >= 6
    }

    fun crearUsuario(
        apiService: ApiService,
        onResult: (Boolean, String) -> Unit
    ) {
        if (!validarDatos()) {
            onResult(false, "Todos los campos son obligatorios")
            return
        }

        val request = CrearUsuarioRequest(
            firstName = nombre.value,
            lastName = apellido.value,
            email = email.value,
            password = password.value
        )

        viewModelScope.launch {
            try {
                val response = apiService.registerUser(request)

                if (response.isSuccessful) {
                    onResult(true, "Usuario creado correctamente")
                } else {
                    onResult(false, "Error del servidor: ${response.code()}")
                }

            } catch (e: Exception) {
                onResult(false, "Error de conexión: ${e.message}")
            }
        }
    }
}