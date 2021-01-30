package com.coroutines.remote

import com.coroutines.models.User
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {

    @GET(Endpoints.USER)
    suspend fun getUser(@Path("id") id: Int): Response<User>
}