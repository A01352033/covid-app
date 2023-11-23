package com.example.kotlin.examenMobiles.framework.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.examenMobiles.framework.main.viewmodel.CovidModel
import com.example.kotlin.examenMobiles.data.remote.ApiManager
import com.example.kotlin.examenMobiles.data.repository.CovidRepository
import kotlinx.coroutines.launch
import java.io.IOException

class CovidViewModel : ViewModel() {

    private val _covidData = MutableLiveData<List<CovidModel>>()
    val covidData: LiveData<List<CovidModel>> get() = _covidData

    private val _error = MutableLiveData<String>()
    val error: LiveData<String> get() = _error

    fun fetchData() {
        viewModelScope.launch {
            try {
                val apiService = ApiManager.createApiService()
                val repository = CovidRepository(apiService)
                repository.getCovidData("CSDIDgXzDPuhOKT4UVazNg==RnOE3zQ3UjSBaxDl")
                    .also { _covidData.value = it }
            } catch (e: IOException) {
                _error.value = "Error de red. Por favor, verifica tu conexión a internet."
            } catch (e: Exception) {
                _error.value = "Ocurrió un error inesperado."
            }
        }
    }
}

