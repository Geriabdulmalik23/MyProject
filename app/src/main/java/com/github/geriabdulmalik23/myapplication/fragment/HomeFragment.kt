package com.github.geriabdulmalik23.myapplication.fragment

import android.os.Bundle
import android.util.Log
import android.view.ViewGroup
import com.github.geriabdulmalik23.myapplication.databinding.HomeFragmentBinding
import com.github.geriabdulmalik23.myapplication.viewmodel.HomeViewModel
import dagger.hilt.android.AndroidEntryPoint
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.github.geriabdulmalik23.myapplication.adapter.EventsAdapter
import com.github.geriabdulmalik23.myapplication.adapter.NewsArticleAdapter
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.BaseFragment

@AndroidEntryPoint
class HomeFragment : BaseFragment<HomeFragmentBinding, AppObserver>() {

    companion object {
        fun newInstance() = HomeFragment()
    }

    val viewModel: HomeViewModel by viewModels()
    private lateinit var adapterNewArticle: NewsArticleAdapter
    private lateinit var adapterNewEvent: EventsAdapter

    override fun onBinding(container: ViewGroup?): HomeFragmentBinding {
        return HomeFragmentBinding.inflate(layoutInflater)
    }

    override fun onCreated(savedInstanceState: Bundle?) {
        adapterNewArticle = NewsArticleAdapter {

        }

        adapterNewEvent = EventsAdapter {

        }
        binding.rvNews.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)

        binding.rvEvents.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false)

        viewModel.list.observe(viewLifecycleOwner) {
            adapterNewArticle.submitList(it.toList())
            adapterNewEvent.submitList(it.toList())
        }
        viewModel.list.observe(viewLifecycleOwner) {
            Log.d("testlogna", it.toString())
        }
        binding.rvNews.adapter = adapterNewArticle
        binding.rvEvents.adapter = adapterNewEvent

    }

}