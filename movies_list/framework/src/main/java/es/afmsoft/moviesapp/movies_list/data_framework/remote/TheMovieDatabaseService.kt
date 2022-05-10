package es.afmsoft.moviesapp.movies_list.data_framework.remote

import es.afmsoft.moviesapp.movies_list.data.remote.dto.MoviesList
import retrofit2.http.GET

interface TheMovieDatabaseService {

    @GET("/movie/popular?api_key=8979fea4ecc57850778fa624133234d8&language=en-US")
    suspend fun getPopularMovies() : MoviesList

    companion object {
        const val BASE_URL = "https://api.themoviedb.org/3/"
    }
}