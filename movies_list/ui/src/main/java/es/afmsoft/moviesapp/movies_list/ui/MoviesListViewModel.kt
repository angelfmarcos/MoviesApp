package es.afmsoft.moviesapp.movies_list.ui

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel

//@HiltViewModel
class MoviesListViewModel : ViewModel() {

    var state by mutableStateOf(MoviesListState(items = listOf(
        MoviesListItemState(name = "Pelicula 1"),
        MoviesListItemState(name = "Pelicula 2"),
        MoviesListItemState(name = "Pelicula 4"),
        MoviesListItemState(name = "Pelicula 5"),
        MoviesListItemState(name = "Pelicula 6"),
        MoviesListItemState(name = "Pelicula 7"),
        MoviesListItemState(name = "Pelicula 8"),
        MoviesListItemState(name = "Pelicula 9"),
        MoviesListItemState(name = "Pelicula 10"))))
          private set

//
//    private val _uiEvent : Channel<UiEvent>()
//            val uiEvent = _uiEvent.receiveAsFlow()
//
//    fun onEvent(event: ) {
//
//    }
}