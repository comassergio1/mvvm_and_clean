package com.example.mvvm_and_clean.data.remote

import com.example.mvvm_and_clean.data.remote.response.ResponseDto
import retrofit2.http.GET

interface RandomUserApi {

    @GET("/api/")
    suspend fun fetchRandomUser(): ResponseDto
}