package com.github.geriabdulmalik23.myapplication.di

import com.github.geriabdulmalik23.myapplication.repository.HomeScreenRepository
import com.github.geriabdulmalik23.myapplication.repository.SplashScreenRepository
import com.github.geriabdulmalik23.myapplication.viewmodel.HomeViewModel
import com.github.geriabdulmalik23.myapplication.viewmodel.SplashScreenViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun splashScreenRepository() = SplashScreenRepository()

    @Provides
    fun homeScreenRepository() = HomeScreenRepository()


}