package com.example.kotlin.examenMobiles.framework.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenMobiles.R
import com.example.kotlin.examenMobiles.data.remote.CovidModel

class CovidAdapter(private val covidData: List<CovidModel>) : RecyclerView.Adapter<CovidAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.activity_main, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val currentItem = covidData[position]
        holder.bind(currentItem)
    }

    override fun getItemCount(): Int {
        return covidData.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        // Puedes acceder a los elementos de la vista y establecer los datos aquí

        fun bind(covidModel: CovidModel) {
            // Implementa la lógica para establecer los datos en la vista
        }
    }
}
