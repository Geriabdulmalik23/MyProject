package com.github.geriabdulmalik23.myapplication.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.github.geriabdulmalik23.myapplication.databinding.HomeFragmentBinding
import com.github.geriabdulmalik23.myapplication.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.activity.viewModels;
import androidx.fragment.app.viewModels

@AndroidEntryPoint
class HomeFragment : Fragment() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    val viewModel: HomeViewModel by viewModels()

    private lateinit var mBinding: HomeFragmentBinding
    val binding: HomeFragmentBinding
        get() = mBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        mBinding = HomeFragmentBinding.inflate(inflater, container, false)
        val view = binding.root

        viewModel.getArticle()
        viewModel.article.observe(viewLifecycleOwner) {
            binding.tvTextArticle.text = it
        }
        return view
    }

}