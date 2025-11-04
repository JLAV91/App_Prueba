package com.example.practicaprueba.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.practicaprueba.R
import com.example.practicaprueba.components.CardConImagen
import com.example.practicaprueba.components.CardConImagen2
import com.example.practicaprueba.components.CardSoloImagen
import com.example.practicaprueba.components.Scrolling


@Composable
fun HomePage(modifier: Modifier = Modifier) {
    val sScroll = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp, bottom = 100.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // 🔹 Título principal
        Text(
            "FinTrack",
            modifier = Modifier
                .fillMaxWidth(),
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray,
        )

        // 🔹 Card principal con su contenido
        Card(
            modifier = Modifier
                .padding(20.dp)
                .weight(1f)
        ) {
            // Usamos una Column para agrupar los elementos del Card
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .verticalScroll(sScroll)
                    .padding(16.dp),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {

                CardSoloImagen(
                    imagen = painterResource(id = R.drawable.investiga)
                )

                // Texto largo con título
                Text(
                    text = "Un poco sobre nuestra compañía",
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1E88E5),
                    modifier = Modifier.padding(vertical = 12.dp)
                )

                Text(
                    text = "Hola, esta es la app de FinTrack y necesito llenar " +
                            "con su texto bueno, para que se vea más completo y " +
                            "atractivo para los usuarios que ingresen por primera " +
                            "vez, mostrando funcionalidades, beneficios y todo lo " +
                            "que puedan explorar dentro de la aplicación sin perder " +
                            "claridad ni facilidad de uso."+"Hola, esta es la app de FinTrack y necesito llenar " +
                            "con su texto bueno, para que se vea más completo y " +
                            "atractivo para los usuarios que ingresen por primera " +
                            "vez, mostrando funcionalidades, beneficios y todo lo " +
                            "que puedan explorar dentro de la aplicación sin perder " +
                            "claridad ni facilidad de uso."+"Hola, esta es la app de FinTrack y necesito llenar " +
                            "con su texto bueno, para que se vea más completo y " +
                            "atractivo para los usuarios que ingresen por primera " +
                            "vez, mostrando funcionalidades, beneficios y todo lo " +
                            "que puedan explorar dentro de la aplicación sin perder " +
                            "claridad ni facilidad de uso."+"Hola, esta es la app de FinTrack y necesito llenar " +
                            "con su texto bueno, para que se vea más completo y " +
                            "atractivo para los usuarios que ingresen por primera " +
                            "vez, mostrando funcionalidades, beneficios y todo lo " +
                            "que puedan explorar dentro de la aplicación sin perder " +
                            "claridad ni facilidad de uso."+"Hola, esta es la app de FinTrack y necesito llenar " +
                            "con su texto bueno, para que se vea más completo y " +
                            "atractivo para los usuarios que ingresen por primera " +
                            "vez, mostrando funcionalidades, beneficios y todo lo " +
                            "que puedan explorar dentro de la aplicación sin perder " +
                            "claridad ni facilidad de uso.",
                    textAlign = TextAlign.Justify,
                    fontSize = 16.sp,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(horizontal = 20.dp)
                        .padding(bottom = 20.dp)
                )

                // Texto final y botón
                Text(
                    "Card in Home",
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    fontWeight = FontWeight.SemiBold
                )

                var countClicks by remember { mutableIntStateOf(0) }

                Button(
                    onClick = { countClicks++ },
                    shape = RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(top = 12.dp)
                ) {
                    Text("Clicks $countClicks")
                }
            }
        }
    }
}
