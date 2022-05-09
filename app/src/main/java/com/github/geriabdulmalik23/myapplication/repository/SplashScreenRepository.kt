package com.github.geriabdulmalik23.myapplication.repository

import com.github.geriabdulmalik23.myapplication.entity.SplashScreenEntity
import com.github.geriabdulmalik23.myapplication.remote.SplashScreenRemoteDataSource

class SplashScreenRepository {
    fun getVersion(): List<SplashScreenEntity> {
        return listOf(SplashScreenRemoteDataSource.getVersion())
    }
}