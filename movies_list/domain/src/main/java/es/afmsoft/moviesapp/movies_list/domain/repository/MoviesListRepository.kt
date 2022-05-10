package es.afmsoft.moviesapp.movies_list.domain.repository

import es.afmsoft.moviesapp.movies_list.domain.model.Movie as MovieDomain

interface MoviesListRepository {
    suspend fun getPopularMovies() : Result<List<MovieDomain>>
}