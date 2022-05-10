package es.afmsoft.moviesapp.movies_list.data.remote

import es.afmsoft.moviesapp.movies_list.data.remote.dto.MoviesList

interface TheMovieDbDataSource {

    suspend fun getPopularMovies() : Result<MoviesList>
}