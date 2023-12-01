package com.example.kotlin.examenMobiles.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.kotlin.examenMobiles.repository.CovidRepository
import kotlinx.coroutines.Dispatchers

class CovidViewModel(private val repository: CovidRepository) : ViewModel() {

    fun getCovidData(apiKey: String) = liveData(Dispatchers.IO) {
        try {
            val data = repository.getCovidData(apiKey)
            if (data != null) {
                emit(data)
            } else {
                // Handle null data scenario, maybe emit an error state or a specific error message
            }
        } catch (e: Exception) {
            // Handle exception, maybe emit an error state or a specific error message
        }
    }
}

