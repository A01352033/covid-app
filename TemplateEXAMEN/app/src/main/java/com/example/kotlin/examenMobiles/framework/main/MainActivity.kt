package com.example.kotlin.examenMobiles.framework.main

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.kotlin.examenMobiles.R
import com.example.kotlin.examenMobiles.framework.main.adapter.CovidAdapter
import com.example.kotlin.examenMobiles.framework.main.viewmodel.CovidViewModel
import com.example.kotlin.examenMobiles.framework.main.viewmodel.MainViewModel


class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: CovidViewModel
    private lateinit var adapter: CovidAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this).get(CovidViewModel::class.java)

        // Configura el RecyclerView y el adaptador

        // Obtiene la instancia del ViewModel

        // Observa los cambios en LiveData y actualiza el RecyclerView

    }
}