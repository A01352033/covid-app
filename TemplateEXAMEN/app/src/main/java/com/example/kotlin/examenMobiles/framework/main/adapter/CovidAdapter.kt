package com.example.kotlin.examenMobiles.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotlin.examenMobiles.databinding.ItemCovidBinding
import com.example.kotlin.examenMobiles.model.CovidModel

class CovidAdapter(private val data: List<CovidModel>) : RecyclerView.Adapter<CovidAdapter.CovidViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CovidViewHolder {
        val binding = ItemCovidBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return CovidViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CovidViewHolder, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemCount(): Int = data.size

    class CovidViewHolder(private val binding: ItemCovidBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(covidModel: CovidModel) {
            binding.textViewCountry.text = covidModel.country
            binding.textViewRegion.text = covidModel.region
            binding.textViewTotal.text = covidModel.cases.total.toString()
            binding.textViewNew.text = covidModel.cases.new.toString()
        }
    }
}
