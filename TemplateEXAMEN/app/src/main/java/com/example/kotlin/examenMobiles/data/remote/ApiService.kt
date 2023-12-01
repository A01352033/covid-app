package com.example.kotlin.examenMobiles.remote

import com.example.kotlin.examenMobiles.model.CovidModel
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {
    @GET("covid19")
    suspend fun getCovidData(@Header("X-Api-Key") apiKey: String): List<CovidModel>
}
