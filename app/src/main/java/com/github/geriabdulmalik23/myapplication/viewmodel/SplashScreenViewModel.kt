package com.github.geriabdulmalik23.myapplication.viewmodel

import android.app.Activity
import android.content.Intent
import android.os.CountDownTimer
import com.github.geriabdulmalik23.myapplication.BuildConfig
import com.github.geriabdulmalik23.myapplication.repository.SplashScreenRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

class SplashScreenViewModel @Inject constructor(private val splashScreenRepository: SplashScreenRepository) {

    fun getVersion(): String? {
        return BuildConfig.VERSION_NAME
    }


    fun startTimer(intent: Intent, activity: Activity) {
        val timer = object : CountDownTimer(3000, 1000) {
            override fun onFinish() {
                activity.startActivity(intent)
                activity.finish()
            }

            override fun onTick(p0: Long) {

            }
        }
        timer.start()
    }

}