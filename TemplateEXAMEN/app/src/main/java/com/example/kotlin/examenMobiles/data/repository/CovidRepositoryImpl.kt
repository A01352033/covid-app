package com.example.kotlin.examenMobiles.data.repository

import com.example.kotlin.examenMobiles.data.remote.ApiService
import com.example.kotlin.examenMobiles.data.remote.CovidModel
import java.io.IOException

class CovidRepositoryImpl(private val apiService: ApiService) : CovidRepository {

    override suspend fun getCovidData(): List<CovidModel> {
        try {
            return apiService.getCovidData("CSDIDgXzDPuhOKT4UVazNg==RnOE3zQ3UjSBaxDl")
        } catch (e: IOException) {
            // Manejar problemas de red
            throw CovidRepositoryException("Error de red. Por favor, verifica tu conexión a internet.", e)
        } catch (e: Exception) {
            // Manejar otros errores inesperados
            throw CovidRepositoryException("Ocurrió un error inesperado.", e)
        }
    }
}

class CovidRepositoryException(message: String, cause: Throwable? = null) : Exception(message, cause)
