package com.github.geriabdulmalik23.myapplication.fragment

import android.os.Bundle
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseFragment
import com.github.geriabdulmalik23.myapplication.databinding.BlogFragmentBinding
import com.github.geriabdulmalik23.myapplication.viewmodel.BlogViewModel

class BlogFragment : BaseFragment<BlogFragmentBinding>(), AppObserver {

    val viewModel: BlogViewModel by viewModels()
    private lateinit var mBinding: BlogFragmentBinding
    override val binding: BlogFragmentBinding
        get() = super.binding

    companion object {
        fun newInstance() = BlogFragment()
    }

    override fun onViewModelObserver() {

    }

    override fun onBinding(container: ViewGroup?): BlogFragmentBinding {
        return BlogFragmentBinding.inflate(layoutInflater)
    }

    override fun onCreated(savedInstanceState: Bundle?) {

    }

}