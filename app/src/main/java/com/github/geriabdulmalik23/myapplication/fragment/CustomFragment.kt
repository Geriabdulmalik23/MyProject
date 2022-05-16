package com.github.geriabdulmalik23.myapplication.fragment

import android.os.Bundle
import android.view.ViewGroup
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.github.geriabdulmalik23.myapplication.R
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseFragment
import com.github.geriabdulmalik23.myapplication.databinding.FragmentCustomBinding


class CustomFragment : BaseFragment<FragmentCustomBinding>(), AppObserver {
    override fun onViewModelObserver() {

    }

    override fun onBinding(container: ViewGroup?): FragmentCustomBinding {
        return FragmentCustomBinding.inflate(layoutInflater, container, false)
    }

    override fun onCreated(savedInstanceState: Bundle?) {

        val navHostFragment = childFragmentManager.findFragmentById(R.id.f_main) as NavHostFragment
        binding.mBottomNav.setupWithNavController(navHostFragment.navController)


    }


}