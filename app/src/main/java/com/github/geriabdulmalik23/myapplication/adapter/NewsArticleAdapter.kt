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
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity

class NewsArticleAdapter(private val listener: (ResponseEntity?) -> Unit) :
    AppAdapter<ListArticleBinding, ResponseEntity, NewsArticleAdapter.ViewHolder>(ResponseEntity.DIFF_UTIL) {

    override fun onBinding(parent: ViewGroup): ListArticleBinding {
        return ListArticleBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun onViewHolder(view: View) = ViewHolder(view)

    inner class ViewHolder(view: View) : AppViewHolder<ResponseEntity>(view) {

        override fun bindItem(item: ResponseEntity?, position: Int) {
            binding.apply {
//                tvTitle.text = item?.n
//                tvLable.text = item?.label
                rlPrimary.setOnClickListener { listener(item) }

            }
        }

    }

}