package com.example.kotlin.examenMobiles.framework.main

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlin.examenMobiles.adapter.CovidAdapter
import com.example.kotlin.examenMobiles.databinding.ActivityMainBinding
import com.example.kotlin.examenMobiles.framework.main.viewmodel.CovidViewModelFactory
import com.example.kotlin.examenMobiles.remote.ApiClient
import com.example.kotlin.examenMobiles.repository.CovidRepository
import com.example.kotlin.examenMobiles.viewmodel.CovidViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    // Se inicializa CovidRepository aquí para pasarlo a la factory del ViewModel.
    private val covidRepository by lazy {
        CovidRepository(ApiClient.apiService)
    }

    // Se utiliza la factory para crear el ViewModel.
    private val viewModel: CovidViewModel by viewModels { CovidViewModelFactory(covidRepository) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Observa los cambios en los datos y actualiza el RecyclerView.
        viewModel.getCovidData("CSDIDgXzDPuhOKT4UVazNg==RnOE3zQ3UjSBaxDl").observe(this, { covidDataList ->
            val adapter = CovidAdapter(covidDataList)
            binding.recyclerView.adapter = adapter
        })
    }
}
