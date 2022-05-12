package com.github.geriabdulmalik23.myapplication.entity

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName

data class CategoryBlogEntity(
    @SerializedName("id")
    val id: Int? = null,
    @SerializedName("slug")
    val slug: String? = null,
    @SerializedName("title")
    val title: String? = null,
    @SerializedName("description")
    val description: String? = null,
    @SerializedName("parent")
    val parent: Int? = null

) {
    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<CategoryBlogEntity>() {

            override fun areContentsTheSame(
                oldItem: CategoryBlogEntity,
                newItem: CategoryBlogEntity
            ) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: CategoryBlogEntity, newItem: CategoryBlogEntity) =
                oldItem == newItem

        }
    }
}