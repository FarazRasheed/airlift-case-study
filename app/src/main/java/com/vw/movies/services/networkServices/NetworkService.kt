package com.vw.movies.services.networkServices

import com.vw.movies.services.dataModels.movie.Movie
import retrofit2.Response
import retrofit2.http.*

interface NetworkService {
    @Headers("Content-Type: application/json")
    @GET("showcase.json")
    suspend fun getList(): Response<Movie>
}