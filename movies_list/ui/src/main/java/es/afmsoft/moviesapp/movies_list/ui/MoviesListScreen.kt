package es.afmsoft.moviesapp.movies_list.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.GridCells
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyVerticalGrid
import androidx.compose.foundation.lazy.items
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import coil.annotation.ExperimentalCoilApi
import es.afmsoft.moviesapp.core.core_ui.theme.MoviesAppTheme
import es.afmsoft.moviesapp.movies_list.ui.components.MoviesListItem

@ExperimentalFoundationApi
@ExperimentalCoilApi
@Composable
fun MoviesListScreen() {

    val viewModel: MoviesListViewModel = hiltViewModel()
    val state = viewModel.state

    LazyVerticalGrid(
        cells = GridCells.Adaptive(150.dp),
        contentPadding = PaddingValues(4.dp),
        modifier = Modifier.fillMaxSize()) {
        items (state.items) { item ->
            MoviesListItem(item = item)
        }
    }
}

@ExperimentalFoundationApi
@ExperimentalCoilApi
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

    MoviesAppTheme {
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background
        ) {
            MoviesListScreen();
        }
    }
}