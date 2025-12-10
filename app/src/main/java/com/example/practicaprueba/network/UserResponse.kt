package com.example.practicaprueba.network

import com.google.gson.annotations.SerializedName


data class UserResponse(
    val id: Int,
    @SerializedName("first_name") val firstName: String,
    @SerializedName("last_name")  val lastName: String,
    val email: String,
    val role: String
)
