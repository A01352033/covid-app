package com.example.kotlin.examenMobiles.framework.main.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.examenMobiles.repository.CovidRepository
import com.example.kotlin.examenMobiles.viewmodel.CovidViewModel

class CovidViewModelFactory(private val repository: CovidRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(CovidViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return CovidViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}
