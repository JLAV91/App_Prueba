package com.example.practicaprueba.components


import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.compose.rememberAsyncImagePainter
import com.example.practicaprueba.viewmodel.CharacterViewModel

@Composable
fun CharacterScreen(modifier: Modifier = Modifier, viewModel: CharacterViewModel = viewModel ()) {
    val characters = viewModel.characters.value // Accedo al valor de State para obtener la lista de personajes
    val errorMessage = viewModel.errorMessage.value // Accedo al valor de State para obtener el mensaje de error

    LaunchedEffect(Unit) {
        viewModel.fetchCharacters()
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Spacer(modifier = Modifier.height(16.dp))
        // Verifica si hay un mensaje de error y lo muestra en la pantalla
        if (errorMessage != null) {
            Text(text = errorMessage) // Muestra el mensaje de error si existe
        } else {
            // Muestra la lista de personajes en un LazyColumn
            LazyColumn {
                items(characters) { character ->
                    val painter = rememberAsyncImagePainter(model = character.image)

                    CardConImagen2(
                        imagen = painter,
                        titulo = character.name,
                        descripcion = "Especie: ${character.species} | Género: ${character.gender}",
                        ultimoTexto = "Origen: ${character.originName}",
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(12.dp))
                }
            }
        }
    }
}