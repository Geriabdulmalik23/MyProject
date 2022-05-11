package com.github.geriabdulmalik23.myapplication.entity

import androidx.recyclerview.widget.DiffUtil

data class ResponseEntity(

    val status: String? = null,
    val count: Int? = null,
    val count_total: Int? = null,
    val pages: Int? = null,
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