package com.github.geriabdulmalik23.myapplication.common

import com.github.geriabdulmalik23.myapplication.databinding.ActivitySplashScreenBinding

interface AppObserver {
    fun onViewModelObserver()
    fun onViewBinding(): ActivitySplashScreenBinding
}