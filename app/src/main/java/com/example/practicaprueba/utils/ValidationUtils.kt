package com.example.practicaprueba.utils

object ValidationUtils {

    private val emailRegex = Regex("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$")

    fun validarEmail(email: String): String? {
        return when {
            email.isBlank() -> "El correo no puede estar vacío"
            !emailRegex.matches(email) -> "Ingrese un correo válido"
            else -> null
        }
    }

    fun validarPassword(password: String): String? {
        return when {
            password.isBlank() -> "La contraseña no puede estar vacía"
            password.length < 6 -> "Debe tener al menos 6 caracteres"
            else -> null
        }
    }
}
