package com.vw.movies.services.repositories

import com.vw.movies.services.dataModels.movie.Movie
import com.vw.movies.services.networkServices.NetworkService
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val networkService: NetworkService) {
    suspend fun getList(): Response<Movie> {
        return networkService.getList()
    }
}