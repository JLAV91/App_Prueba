package com.example.practicaprueba.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.practicaprueba.ItemsNav
import com.example.practicaprueba.pages.HomePage
import com.example.practicaprueba.pages.HomeLog
import com.example.practicaprueba.pages.NotificationsPage
import com.example.practicaprueba.pages.SettingsPage


@Composable
fun NavBar() {
    val navItemsLis = listOf(
        ItemsNav("Inicio", Icons.Default.Home),
        ItemsNav("Configuración", Icons.Default.Settings),
        ItemsNav("Notificaciones", Icons.Default.Notifications)
    )

    var selectedIndex by remember { mutableIntStateOf(0) }

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        bottomBar = {
            NavigationBar {
                navItemsLis.forEachIndexed { index, nav ->
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
            1 -> SettingsPage()
            2 -> NotificationsPage()
        }
    }
}