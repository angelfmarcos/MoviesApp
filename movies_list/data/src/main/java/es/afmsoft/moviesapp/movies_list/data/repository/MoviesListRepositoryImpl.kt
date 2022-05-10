package es.afmsoft.moviesapp.movies_list.data.repository

import es.afmsoft.moviesapp.movies_list.data.remote.TheMovieDbDataSource
import es.afmsoft.moviesapp.movies_list.domain.model.Movie
import es.afmsoft.moviesapp.movies_list.domain.repository.MoviesListRepository

class MoviesListRepositoryImpl(
    val remoteDatasource : TheMovieDbDataSource
): MoviesListRepository {

    override suspend fun getPopularMovies(): Result<List<Movie>> {
        //TODO
        //return Result.failure(Exception("Sin implementar"))
        return Result.success(listOf(
            Movie("", 1, "Pelicula1"),
            Movie("", 1, "Pelicula2"),
            Movie("", 1, "Pelicula3"),
            Movie("", 1, "Pelicula4"),
            Movie("", 1, "Pelicula5"),
            Movie("", 1, "Pelicula6"),
            Movie("", 1, "Pelicula7"),
            Movie("", 1, "Pelicula8"),
            Movie("", 1, "Pelicula9"),
            Movie("", 1, "Pelicula10"),
        ))
    }
}