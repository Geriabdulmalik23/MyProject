package com.github.geriabdulmalik23.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel
import com.github.geriabdulmalik23.myapplication.BuildConfig
import com.github.geriabdulmalik23.myapplication.repository.SplashScreenRepository
import javax.inject.Inject

class SplashScreenViewModel @Inject constructor(private val splashScreenRepository: SplashScreenRepository) :
    ViewModel() {

    fun getVersion(): String? {
        return BuildConfig.VERSION_NAME
    }



}