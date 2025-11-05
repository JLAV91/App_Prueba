package com.example.practicaprueba.pages

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.Animatable
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicaprueba.R
import com.example.practicaprueba.components.CajaLog


@Composable
fun HomeLog(navController: NavController) {
    var showLogin by remember { mutableStateOf(false) }
    val scale = remember { Animatable(0.5f) }
    val alphaLogo = remember { Animatable(1f) }


    LaunchedEffect(Unit) {
        //  Aparece y crece el logo
        scale.animateTo(
            targetValue = 1.6f,
            animationSpec = tween(1200, easing = FastOutSlowInEasing)
        )

        //  Luego se hace tenue (como fondo)
        alphaLogo.animateTo(
            targetValue = 0.2f,
            animationSpec = tween(1000, easing = LinearOutSlowInEasing)
        )

        // Finalmente muestra el formulario
        showLogin = true
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {
        imgLogo()
        CajaLog(navController = navController)
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo de fondo",
            modifier = Modifier
                .align(Alignment.Center)
                .graphicsLayer(
                    scaleX = scale.value,
                    scaleY = scale.value,
                    alpha = alphaLogo.value
                ),
            contentScale = ContentScale.Fit
        )


        AnimatedVisibility(
            visible = showLogin,
            enter = fadeIn(animationSpec = tween(800))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(horizontal = 32.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {

                Spacer(modifier = Modifier.height(16.dp))


                CajaLog(navController)

            }
        }
    }
}