package com.example.kotlin.examenMobiles.framework.main.di

import com.example.kotlin.examenMobiles.data.remote.ApiService
import com.example.kotlin.examenMobiles.data.remote.ApiManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class NetworkModule {

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return ApiManager.createApiService()
    }
}
