package com.example.practicaprueba.network

import com.google.gson.annotations.SerializedName

data class CrearUsuarioRequest(
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name") val lastName: String,
    val email: String,
    val password: String
)