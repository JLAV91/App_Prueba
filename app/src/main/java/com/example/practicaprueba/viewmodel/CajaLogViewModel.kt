package com.example.practicaprueba.viewmodel

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.example.practicaprueba.utils.ValidationUtils

class CajaLogViewModel : ViewModel() {

    var username = mutableStateOf("")
    var password = mutableStateOf("")

    var usernameError = mutableStateOf<String?>(null)
    var passwordError = mutableStateOf<String?>(null)

    fun onUsernameChange(value: String) {
        username.value = value
        usernameError.value = null
    }

    fun onPasswordChange(value: String) {
        password.value = value
        passwordError.value = null
    }

    fun validarCampos(): Boolean {
        usernameError.value = ValidationUtils.validarEmail(username.value)
        passwordError.value = ValidationUtils.validarPassword(password.value)

        return usernameError.value == null && passwordError.value == null
    }
}
