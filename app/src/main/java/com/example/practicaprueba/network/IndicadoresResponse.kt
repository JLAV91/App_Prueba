package com.example.practicaprueba.network

data class IndicadoresResponse(
    val version: String,
    val autor: String,
    val fecha: String,
    val uf: Indicador,
    val dolar: Indicador,
    val euro: Indicador
)

data class Indicador(
    val valor: Double
)
