package com.example.practicaprueba.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.practicaprueba.network.CrearUsuarioRequest
import com.example.practicaprueba.network.RetrofitClient
import kotlinx.coroutines.launch
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue

class CrearUserViewModel : ViewModel() {

    private val apiService = RetrofitClient.apiService

    var nombre by mutableStateOf("")
    var apellido by mutableStateOf("")
    var email by mutableStateOf("")
    var password by mutableStateOf("")

    fun registrarUsuario(onSuccess: () -> Unit, onError: (String) -> Unit) {
        viewModelScope.launch {
            try {
                val request = CrearUsuarioRequest(
                    firstName = nombre,
                    lastName = apellido,
                    email = email,
                    password = password
                )

                val response = apiService.registerUser(request)

                if (response.isSuccessful) {
                    onSuccess()
                } else {
                    onError("Error ${response.code()}: ${response.message()}")
                }
            } catch (e: Exception) {
                onError("Error de conexión: ${e.message}")
            }
        }
    }
}