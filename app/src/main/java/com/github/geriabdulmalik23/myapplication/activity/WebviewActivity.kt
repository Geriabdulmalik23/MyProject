package com.github.geriabdulmalik23.myapplication.activity

import android.os.Bundle
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseActivity
import com.github.geriabdulmalik23.myapplication.databinding.ActivityWebviewBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class WebviewActivity : BaseActivity<ActivityWebviewBinding>(), AppObserver {
    override fun onViewModelObserver() {
    }

    override fun onViewBinding() = ActivityWebviewBinding.inflate(layoutInflater)

    override fun onCreated(savedInstanceState: Bundle?) {
        val intent = intent

        viewBinding.wvContent.settings.javaScriptEnabled = true
        viewBinding.wvContent.settings.useWideViewPort = true
        intent.getStringExtra("url")?.let { viewBinding.wvContent.loadUrl(it) }

    }

}