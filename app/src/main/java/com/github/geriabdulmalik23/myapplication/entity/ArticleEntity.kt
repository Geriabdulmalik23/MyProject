package com.github.geriabdulmalik23.myapplication.entity

import androidx.recyclerview.widget.DiffUtil

data class ArticleEntity(
    val id: Int? = null,
    val name: String? = null,
    val imageNew: String? = null,
    val label: String? = null
) {
    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<ArticleEntity>() {

            override fun areContentsTheSame(oldItem: ArticleEntity, newItem: ArticleEntity) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: ArticleEntity, newItem: ArticleEntity) =
                oldItem == newItem

        }
    }
}