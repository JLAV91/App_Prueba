package com.example.practicaprueba.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.practicaprueba.ItemsNav
import com.example.practicaprueba.pages.HomePage
import com.example.practicaprueba.pages.IndicadoresPage
import com.example.practicaprueba.pages.SettingsPage
import com.example.practicaprueba.pages.NotificationsPage

@Composable
fun NavBar() {
    val navController = rememberNavController()
    val navItemsList = listOf(
        ItemsNav("Inicio", Icons.Default.Home),
        ItemsNav("Indicadores", Icons.Default.Settings),
        ItemsNav("Contacto", Icons.Default.Notifications)
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemsList.forEachIndexed { index, nav ->
                    NavigationBarItem(
                        selected = selectedIndex == index,
                        onClick = { selectedIndex = index },
                        icon = { Icon(imageVector = nav.icon, contentDescription = nav.label) },
                        label = { Text(nav.label) }
                    )
                }
            }
        }
    ) { innerPadding ->
        when (selectedIndex) {
            0 -> HomePage()
            1 -> IndicadoresPage()
            2 -> NotificationsPage(navController = navController)
        }
    }
}
