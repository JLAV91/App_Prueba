package com.example.practicaprueba.pages


import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.practicaprueba.components.CajaLog
import com.example.practicaprueba.components.imgLogo

@Composable
fun HomeLog(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(18.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        imgLogo()

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
