package com.example.practicaprueba.pages

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.runtime.livedata.observeAsState
import com.example.practicaprueba.viewmodel.IndicadoresViewModel
import com.example.practicaprueba.components.IndicadorCard
import androidx.compose.ui.text.style.TextAlign
import com.example.practicaprueba.components.AnimatedCard


@Composable
fun IndicadoresPage(
    viewModel: IndicadoresViewModel = viewModel()
) {
    val state by viewModel.state.observeAsState()

    LaunchedEffect(Unit) {
        viewModel.loadIndicadores()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    )  {

        Text(
            text = "Indicadores Financieros",
            style = MaterialTheme.typography.headlineMedium,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(20.dp))

        if (state == null) {
            CircularProgressIndicator()
            return
        }

        // --- CORRECCIÓN FINAL ---
        // Cambia 'delayMillis' por 'delay' en todas las llamadas.
        AnimatedCard(delay = 0) {
            IndicadorCard("UF", state!!.uf.valor, Color(0xFF5D6DFF))
        }

        AnimatedCard(delay = 150) {
            IndicadorCard("Dólar", state!!.dolar.valor, Color(0xFF4CAF50))
        }

        AnimatedCard(delay = 300) {
            IndicadorCard("Euro", state!!.euro.valor, Color(0xFFFF9800))
        }

    }
}
