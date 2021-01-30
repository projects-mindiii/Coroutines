package com.coroutines.remote

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object MyRetrofit {
    private const val BASE_URL = "https://jsonplaceholder.typicode.com/"

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
    }

    fun apis(): ApiService {
        return getRetrofit().create(ApiService::class.java)
    }
}