package com.github.geriabdulmalik23.myapplication.di

import com.github.geriabdulmalik23.myapplication.remote.Services.RecentPostService
import com.github.geriabdulmalik23.myapplication.repository.SplashScreenRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@InstallIn(SingletonComponent::class)
@Module
object AppModule {
    @Provides
    fun splashScreenRepository() = SplashScreenRepository()

    @Provides
    fun restClient(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://blog.tasikcode.xyz/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    @Provides
    fun recentPostService(retrofit: Retrofit): RecentPostService =
        retrofit.create(RecentPostService::class.java)


}