package com.example.practicaprueba.network

import retrofit2.http.GET

interface IndicadoresApi {
    @GET("api")
    suspend fun getIndicadores(): IndicadoresResponse
}
