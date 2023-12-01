package com.example.kotlin.examenMobiles.remote

import com.example.kotlin.examenMobiles.model.CovidModel
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface ApiService {
    @GET("covid19")
    suspend fun getCovidData(@Header("X-Api-Key") apiKey: String, @Query("date") date: String): List<CovidModel>
}
