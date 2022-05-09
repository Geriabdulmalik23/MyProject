package com.github.geriabdulmalik23.myapplication.remote

import com.github.geriabdulmalik23.myapplication.entity.SplashScreenEntity

object SplashScreenRemoteDataSource {
    fun getVersion() = SplashScreenEntity(version = 1, versionCode = "1.0.0", isUpdate = 0)
}