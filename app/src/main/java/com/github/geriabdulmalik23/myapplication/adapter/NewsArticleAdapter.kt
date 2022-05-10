package com.github.geriabdulmalik23.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.github.geriabdulmalik23.myapplication.common.AppAdapter
import com.github.geriabdulmalik23.myapplication.common.AppViewHolder
import com.github.geriabdulmalik23.myapplication.databinding.ListArticleBinding
import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity

class NewsArticleAdapter(private val listener: (ArticleEntity?) -> Unit) :
    AppAdapter<ListArticleBinding, ArticleEntity, NewsArticleAdapter.ViewHolder>(ArticleEntity.DIFF_UTIL) {

    override fun onBinding(parent: ViewGroup): ListArticleBinding {
        return ListArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun onViewHolder(view: View) = ViewHolder(view)

    inner class ViewHolder(view: View) : AppViewHolder<ArticleEntity>(view) {

        override fun bindItem(item: ArticleEntity?, position: Int) {
            binding.apply {
                tvTitle.text = item?.name
                tvLable.text = item?.label
                rlPrimary.setOnClickListener { listener(item) }

            }
        }

    }

}