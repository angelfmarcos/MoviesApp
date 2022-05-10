package es.afmsoft.moviesapp.movies_list.data.remote.dto

data class MoviesList(
    val page: Int,
    val results: List<MoviesListResult>,
    val total_pages: Int,
    val total_results: Int
)