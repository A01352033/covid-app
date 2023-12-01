package com.example.kotlin.examenMobiles.repository

import com.example.kotlin.examenMobiles.model.CovidModel
import com.example.kotlin.examenMobiles.remote.ApiClient
import com.example.kotlin.examenMobiles.remote.ApiService

class CovidRepository(private val apiService: ApiService) {
    suspend fun getCovidData(apiKey: String): List<CovidModel> {
        return ApiClient.apiService.getCovidData(apiKey)
    }
}
