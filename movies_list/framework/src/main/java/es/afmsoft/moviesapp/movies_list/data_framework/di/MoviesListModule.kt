package es.afmsoft.moviesapp.movies_list.data_framework.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import es.afmsoft.moviesapp.movies_list.data.remote.TheMovieDbDataSource
import es.afmsoft.moviesapp.movies_list.data.repository.MoviesListRepositoryImpl
import es.afmsoft.moviesapp.movies_list.data_framework.datasource.TheMovieDbDataSourceImpl
import es.afmsoft.moviesapp.movies_list.data_framework.remote.TheMovieDatabaseService
import es.afmsoft.moviesapp.movies_list.domain.repository.MoviesListRepository
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesListModule {

    @Provides
    @Singleton
    fun provideTheMovieDatabaseService(): TheMovieDatabaseService {
        return Retrofit.Builder()
            .baseUrl(TheMovieDatabaseService.BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create()
    }

    @Provides
    @Singleton
    fun providesTheMovieDbDataSource(
        service: TheMovieDatabaseService
    ) : TheMovieDbDataSource {
        return TheMovieDbDataSourceImpl(service)
    }

    @Provides
    @Singleton
    fun providesMoviesListRepository(
        remoteDatasource : TheMovieDbDataSource
    ) : MoviesListRepository {
        return MoviesListRepositoryImpl(remoteDatasource)
    }

//    @Provides
//    @Singleton
//    fun provideTrackerRepository(
//        api: The,
//        db: TrackerDatabase
//    ): TrackerRepository {
//        return TrackerRepositoryImpl(
//            dao = db.dao,
//            api = api
//        )
//    }
}