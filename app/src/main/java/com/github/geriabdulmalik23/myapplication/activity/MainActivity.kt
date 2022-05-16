package com.github.geriabdulmalik23.myapplication.activity

import android.os.Bundle
import androidx.navigation.Navigation
import com.github.geriabdulmalik23.myapplication.R
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseActivity
import com.github.geriabdulmalik23.myapplication.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : BaseActivity<ActivityMainBinding>(), AppObserver {

    override fun onViewModelObserver() {

    }

    override fun onViewBinding(): ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)

    override fun onCreated(savedInstanceState: Bundle?) {

    }
}
