package es.afmsoft.moviesapp.movies_list.ui

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import es.afmsoft.moviesapp.movies_list.ui.components.MoviesListItem

@Composable
fun MoviesListScreen() {
    MoviesListItem(title = "Prueba")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MoviesListItem(title = "Prueba")
}