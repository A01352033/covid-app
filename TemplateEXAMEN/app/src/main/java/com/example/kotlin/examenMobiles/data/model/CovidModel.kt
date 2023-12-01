package com.example.kotlin.examenMobiles.model

import com.example.kotlin.examenMobiles.data.model.Cases

data class CovidModel(
    val country: String,
    val region: String,
    val cases: Cases
)
