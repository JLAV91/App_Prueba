package com.example.practicaprueba.pages

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
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


@Composable
fun HomePage(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(top = 40.dp),
            /*.background(Color.Blue),*/
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(
            "FinTrack",
            modifier = Modifier
                .background(Color.White)
                .fillMaxWidth()
                ,
            textAlign = TextAlign.Center,
            fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold,
            color = Color.Gray,

        )

        Card(
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 20.dp,
                    end = 20.dp,
                    bottom = 20.dp
                )
                .background(Color.White)
                .weight(1f),
        ) {
            CardConImagen2(
                imagen = painterResource(
                    id = R.drawable.investiga
                ),
                titulo = "Título de la tarjeta",
                descripcion = "Descripción de la tarjeta",
                ultimoTexto = "Texo nuevo",
                modifier = Modifier
                    .padding(2.dp)
            )
            CardConImagen2(
                imagen = painterResource(
                    id = R.drawable.investiga
                ),
                titulo = "Título de la tarjeta",
                descripcion = "Descripción de la tarjeta",
                ultimoTexto = "Texo nuevo",
                modifier = Modifier
                    .padding(2.dp)
            )
            Text(
                text = "hola esta es la app de fin track y necesito llenar " +
                        "con su texto weno, para que se vea más completo y " +
                        "atractivo para los usuarios que ingresen por primera " +
                        "vez, mostrando funcionalidades, beneficios y todo lo " +
                        "que puedan explorar dentro de la aplicación sin perder" +
                        " claridad ni facilidad de uso.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify,



            )
            Text("Card in Home",
                modifier = Modifier
                    .fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.SemiBold
            )

            var countClicks by remember { mutableIntStateOf(0) }

            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                shape = RoundedCornerShape(20.dp),
                onClick = {
                    countClicks++
                }
            ) {
                Text("Clicks $countClicks")
            }
        }
    }
}