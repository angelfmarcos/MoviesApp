package es.afmsoft.moviesapp.movies_list.data_framework.datasource

import es.afmsoft.moviesapp.movies_list.data.remote.TheMovieDbDataSource
import es.afmsoft.moviesapp.movies_list.data.remote.dto.MoviesList
import es.afmsoft.moviesapp.movies_list.data_framework.remote.TheMovieDatabaseService

class TheMovieDbDataSourceImpl(
    val service : TheMovieDatabaseService
) : TheMovieDbDataSource {

    override suspend fun getPopularMovies(): Result<MoviesList> {
        TODO("Not yet implemented")
    }
}