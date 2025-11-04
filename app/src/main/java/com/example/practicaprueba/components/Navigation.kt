package com.example.practicaprueba.components

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.practicaprueba.pages.HomeLog
import com.example.practicaprueba.pages.HomePage
import com.example.practicaprueba.pages.NotificationsPage
import com.example.practicaprueba.pages.SettingsPage
import com.example.practicaprueba.components.NavBar

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
    }
}