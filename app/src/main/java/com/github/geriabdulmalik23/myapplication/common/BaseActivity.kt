package com.github.geriabdulmalik23.myapplication.common

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewbinding.ViewBinding

abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {

    private lateinit var mViewBinding: VB
    protected val viewBinding: VB
        get() = mViewBinding

    /**
     * This function will help to bind view into super class. So you don't need to set content view repeatedly.
     * Giving this function with return value eg: FeatureActivityBinding.inflate(layoutInflater)
     */
    protected abstract fun onViewBinding(): VB

    protected abstract fun onCreated(savedInstanceState: Bundle?)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        if (!::mViewBinding.isInitialized) mViewBinding = onViewBinding()
        setContentView(viewBinding.root)

        onCreated(savedInstanceState)

        if (this is AppObserver) onViewModelObserver()

    }

}