package es.afmsoft.moviesapp.movies_list.ui

import android.util.Log
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import es.afmsoft.moviesapp.movies_list.domain.repository.MoviesListRepository
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MoviesListViewModel @Inject constructor (
    private val moviesRepository : MoviesListRepository
): ViewModel() {

    var state by mutableStateOf(MoviesListState(items = emptyList()))
          private set

    private var getPopularMovies: Job? = null

    init {
        viewModelScope.launch {

            moviesRepository.getPopularMovies()
                .onFailure { Log.d("MOVIES", "RECUPERACION FALLIDA") }
                .onSuccess { state = state.copy(items = it.map { movie ->
                        MoviesListItemState(movie.title)
                    })
                }
        }
    }
//
//    private val _uiEvent : Channel<UiEvent>()
//            val uiEvent = _uiEvent.receiveAsFlow()
//
//    fun onEvent(event: ) {
//
//    }
}