package com.github.geriabdulmalik23.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.github.geriabdulmalik23.myapplication.common.AppAdapter
import com.github.geriabdulmalik23.myapplication.common.AppObserver
import com.github.geriabdulmalik23.myapplication.common.AppViewHolder
import com.github.geriabdulmalik23.myapplication.databinding.ListEventsBinding
import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity

class EventsAdapter(private val listener: (ArticleEntity) -> Unit) :
    AppAdapter<ListEventsBinding, ArticleEntity, EventsAdapter.viewHolder>(ArticleEntity.DIFF_UTIL) {
    override fun onBinding(parent: ViewGroup): ListEventsBinding {
        return ListEventsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun onViewHolder(view: View) = viewHolder(view)

    inner class viewHolder(view: View) : AppViewHolder<ArticleEntity>(view) {
        override fun bindItem(item: ArticleEntity?, position: Int) {

        }

    }
}