package com.example.kotlin.examenMobiles.framework.main.di

import com.example.kotlin.examenMobiles.data.remote.ApiService
import com.example.kotlin.examenMobiles.data.repository.CovidRepository
import com.example.kotlin.examenMobiles.data.repository.CovidRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideCovidRepository(apiService: ApiService): CovidRepository {
        return CovidRepositoryImpl(apiService)
    }
}
