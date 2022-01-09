package com.example.ktorsample.data

import retrofit2.http.GET


interface RabbitsApi {

    @GET("/rabbit")
    suspend fun getRandomRabbit(): Rabbit

    companion object {
        const val BASE_URL = "http://192.168.29.129:8080"
    }
}