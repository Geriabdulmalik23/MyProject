package com.github.geriabdulmalik23.myapplication.di

import com.github.geriabdulmalik23.myapplication.remote.Services.RecentPostService
import com.github.geriabdulmalik23.myapplication.repository.HomeScreenRepository
import com.github.geriabdulmalik23.myapplication.repository.SplashScreenRepository
import com.github.geriabdulmalik23.myapplication.viewmodel.HomeViewModel
import com.github.geriabdulmalik23.myapplication.viewmodel.SplashScreenViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun splashScreenRepository() = SplashScreenRepository()

    @Provides
    fun homeScreenRepository() = HomeScreenRepository()

    @Provides
    fun restClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://blog.tasikcode.xyz/")
            .build()
    }

    @Provides
    fun recentPostService(retrofit: Retrofit): RecentPostService =
        retrofit.create(RecentPostService::class.java)


}