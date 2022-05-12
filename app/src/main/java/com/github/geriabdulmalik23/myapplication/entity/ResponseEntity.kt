package com.github.geriabdulmalik23.myapplication.entity

import androidx.recyclerview.widget.DiffUtil
import com.google.gson.annotations.SerializedName

data class ResponseEntity(
    @SerializedName("status")
    val status: String? = null,
    @SerializedName("count")
    val count: Int? = null,
    @SerializedName("count_total")
    val count_total: Int? = null,
    @SerializedName("pages")
    val pages: Int? = null,
    @SerializedName("posts")
    val posts: List<ArticleEntity>? = null
) {
    companion object {
        val DIFF_UTIL = object : DiffUtil.ItemCallback<ResponseEntity>() {

            override fun areContentsTheSame(oldItem: ResponseEntity, newItem: ResponseEntity) =
                oldItem == newItem

            override fun areItemsTheSame(oldItem: ResponseEntity, newItem: ResponseEntity) =
                oldItem == newItem

        }
    }
}