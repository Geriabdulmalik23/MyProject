package com.github.geriabdulmalik23.myapplication.common

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewbinding.ViewBinding

abstract class BaseFragment<VB : ViewBinding, T> : Fragment() {

    private lateinit var mViewBinding: VB

    protected open val binding: VB
        get() = mViewBinding

    protected abstract fun onBinding(container: ViewGroup?): VB

    protected abstract fun onCreated(savedInstanceState: Bundle?)

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mViewBinding = onBinding(container)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        onCreated(savedInstanceState)

        if (this is AppObserver) onViewModelObserver()

    }

}