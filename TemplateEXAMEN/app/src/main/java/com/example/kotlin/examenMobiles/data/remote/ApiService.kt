package com.example.kotlin.examenMobiles.data.remote

import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("covid19")
    suspend fun getCovidData(@Header("X-Api-Key") apiKey: String): List<CovidModel>
}


