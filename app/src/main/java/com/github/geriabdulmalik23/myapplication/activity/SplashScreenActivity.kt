package com.github.geriabdulmalik23.myapplication.activity

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.CountDownTimer
import androidx.activity.viewModels
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseActivity
import com.github.geriabdulmalik23.myapplication.databinding.ActivitySplashScreenBinding
import com.github.geriabdulmalik23.myapplication.viewmodel.SplashScreenViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashScreenActivity : BaseActivity<ActivitySplashScreenBinding>(), AppObserver {

    private val mViewModel by viewModels<SplashScreenViewModel>()
    private lateinit var mBinding: ActivitySplashScreenBinding

    val binding: ActivitySplashScreenBinding
        get() = mBinding

    override fun onViewModelObserver() {

    }

    override fun onViewBinding(): ActivitySplashScreenBinding {
        return ActivitySplashScreenBinding.inflate(layoutInflater)
    }

    override fun onCreated(savedInstanceState: Bundle?) {
        startTimer(Intent(this, MainActivity::class.java), this)
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