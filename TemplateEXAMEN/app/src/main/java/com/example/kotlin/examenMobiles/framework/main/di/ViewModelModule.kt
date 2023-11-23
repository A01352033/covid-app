package com.example.kotlin.examenMobiles.framework.main.di

import com.example.kotlin.examenMobiles.data.repository.CovidRepository
import com.example.kotlin.examenMobiles.framework.main.viewmodel.MainViewModel
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class ViewModelModule {

    @Provides
    @Singleton
    fun provideMainViewModel(repository: CovidRepository): MainViewModel {
        return MainViewModel(repository)
    }
}
