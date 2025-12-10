package com.example.practicaprueba

import com.example.practicaprueba.utils.ValidationUtils
import org.junit.Test
import org.assertj.core.api.Assertions.assertThat

class ValidationUtilsTest {

    @Test
    fun `email vacio retorna mensaje de error`() {
        val resultado = ValidationUtils.validarEmail("")
        assertThat(resultado).isEqualTo("El correo no puede estar vacío")
    }

    @Test
    fun `email con formato invalido retorna mensaje de error`() {
        val resultado = ValidationUtils.validarEmail("victor@x")
        assertThat(resultado).isEqualTo("Ingrese un correo válido")
    }

    @Test
    fun `email valido retorna null`() {
        val resultado = ValidationUtils.validarEmail("victor@example.com")
        assertThat(resultado).isNull()
    }

    @Test
    fun `password vacia retorna mensaje de error`() {
        val resultado = ValidationUtils.validarPassword("")
        assertThat(resultado).isEqualTo("La contraseña no puede estar vacía")
    }

    @Test
    fun `password corta retorna error`() {
        val resultado = ValidationUtils.validarPassword("12345")
        assertThat(resultado).isEqualTo("Debe tener al menos 6 caracteres")
    }

    @Test
    fun `password valida retorna null`() {
        val resultado = ValidationUtils.validarPassword("123456")
        assertThat(resultado).isNull()
    }

    @Test
    fun `tests manuales de correos para buscar fallas`() {
        val pruebas = listOf(
            "vito@" to "Ingrese un correo válido",
            "vito@dominio" to "Ingrese un correo válido",
            "vito@dominio.c" to "Ingrese un correo válido",
            "vito@@dominio.com" to "Ingrese un correo válido",
            " " to "El correo no puede estar vacío",
            "victor@example.com" to null // válido
        )

        pruebas.forEach { (input, esperado) ->
            val resultado = ValidationUtils.validarEmail(input)

            assertThat(resultado)
                .`as`("Probando correo: '$input'")
                .isEqualTo(esperado)
        }
    }

}


