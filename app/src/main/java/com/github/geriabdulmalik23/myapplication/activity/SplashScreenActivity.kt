package com.github.geriabdulmalik23.myapplication.activity

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.github.geriabdulmalik23.myapplication.databinding.ActivitySplashScreenBinding
import com.github.geriabdulmalik23.myapplication.viewmodel.SplashScreenViewModel
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashScreenActivity : AppCompatActivity() {
    @Inject
    lateinit var mViewModel: SplashScreenViewModel

    private lateinit var mBinding: ActivitySplashScreenBinding
    val binding: ActivitySplashScreenBinding
        get() = mBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = ActivitySplashScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvVersion.text = mViewModel.getVersion().toString()

        mViewModel.startTimer(Intent(this,MainActivity::class.java),this)
    }
}