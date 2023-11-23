package com.example.kotlin.examenMobiles.framework.main.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kotlin.examenMobiles.data.remote.CovidModel
import com.example.kotlin.examenMobiles.data.repository.CovidRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class MainViewModel @Inject constructor(private val repository: CovidRepository) : ViewModel() {
    private val _covidData = MutableLiveData<List<CovidModel>>()
    val covidData: LiveData<List<CovidModel>> get() = _covidData

    fun fetchData() {
        viewModelScope.launch {
            try {
                _covidData.value = repository.getCovidData()
            } catch (e: Exception) {
                // Manejar errores aquí
            }
        }
    }
}

