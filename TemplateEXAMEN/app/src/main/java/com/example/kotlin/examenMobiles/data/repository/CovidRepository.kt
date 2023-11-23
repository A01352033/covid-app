package com.example.kotlin.examenMobiles.data.repository

import com.example.kotlin.examenMobiles.data.remote.ApiService
import com.example.kotlin.examenMobiles.data.remote.CovidModel

class CovidRepository(private val apiService: ApiService) {
    suspend fun getCovidData(apiKey: String): List<CovidModel> {
        return apiService.getCovidData(apiKey)
    }
}


