package com.github.geriabdulmalik23.myapplication.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import com.github.geriabdulmalik23.myapplication.common.AppAdapter
import com.github.geriabdulmalik23.myapplication.common.AppViewHolder
import com.github.geriabdulmalik23.myapplication.databinding.ListCategoryBlogBinding
import com.github.geriabdulmalik23.myapplication.entity.CategoryBlogEntity

class CategoryBlogAdapter(private val listener: (CategoryBlogEntity) -> Unit) :
    AppAdapter<ListCategoryBlogBinding, CategoryBlogEntity, CategoryBlogAdapter.viewHolder>(
        CategoryBlogEntity.DIFF_UTIL
    ) {
    override fun onBinding(parent: ViewGroup): ListCategoryBlogBinding {
        return ListCategoryBlogBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    }

    override fun onViewHolder(view: View) = viewHolder(view)

    inner class viewHolder(view: View) : AppViewHolder<CategoryBlogEntity>(view) {
        override fun bindItem(item: CategoryBlogEntity?, position: Int) {

        }

    }
}