package com.example.practicaprueba.components

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.practicaprueba.pages.CreaUser
import com.example.practicaprueba.pages.HomeLog
import com.example.practicaprueba.pages.RecuPass


@Composable
fun AppNavigation(navController : NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "HomeLog"
    ) {
        composable("HomeLog") {
            HomeLog(navController)

        }
        composable("main") {
            NavBar()
        }
        composable("recuperar") {
            RecuPass(navController)
        }

        composable("login") {
            CajaLog(navController = navController)
        }

        composable("crear") {
            CreaUser(navController = navController)
        }
    }
}




