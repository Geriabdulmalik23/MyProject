package com.github.geriabdulmalik23.myapplication.entity

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName

data class ArticleEntity(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("url")
    val url: String? = null,
    @SerializedName("excerpt")
    val excerpt: String? = null,
    @SerializedName("content")
    val content: String? = null
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