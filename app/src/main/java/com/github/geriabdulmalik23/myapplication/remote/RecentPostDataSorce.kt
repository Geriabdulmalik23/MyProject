package com.github.geriabdulmalik23.myapplication.remote

import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity

object RecentPostDataSorce {
    fun getRecentPost() = arrayListOf<ResponseEntity>().apply {
        add(
            ResponseEntity(
                status = "OK",
                count = 3,
                count_total = 3,
                pages = 33,
            )
        )
        add(
            ResponseEntity(
                status = "OK",
                count = 3,
                count_total = 3,
                pages = 33,
            )
        )
        add(
            ResponseEntity(
                status = "OK",
                count = 3,
                count_total = 3,
                pages = 33,
            )
        )
        add(
            ResponseEntity(
                status = "OK",
                count = 3,
                count_total = 3,
                pages = 33,
            )
        )

    }

}