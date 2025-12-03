package com.example.practicaprueba.network

import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {

    @POST("/users/register")
    suspend fun registerUser(
        @Body request: CrearUsuarioRequest
    ): Response<UserResponse>
}