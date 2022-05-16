package com.github.geriabdulmalik23.myapplication.fragment

import android.os.Bundle
import android.view.ViewGroup
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseFragment
import com.github.geriabdulmalik23.myapplication.databinding.BarayaFragmentBinding

class BarayaFragment : BaseFragment<BarayaFragmentBinding>(), AppObserver {
    override fun onViewModelObserver() {

    }

    override fun onBinding(container: ViewGroup?): BarayaFragmentBinding {
        return BarayaFragmentBinding.inflate(layoutInflater)
    }

    override fun onCreated(savedInstanceState: Bundle?) {

    }


}