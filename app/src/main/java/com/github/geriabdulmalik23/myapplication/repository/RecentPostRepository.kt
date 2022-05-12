package com.github.geriabdulmalik23.myapplication.repository

import com.github.geriabdulmalik23.myapplication.common.AppResult
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity
import com.github.geriabdulmalik23.myapplication.extencion.connection
import com.github.geriabdulmalik23.myapplication.remote.Services.RecentPostService
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class RecentPostRepository @Inject constructor(private val mRecentPostService: RecentPostService) {

    suspend fun getRecent(): AppResult<ResponseEntity> = connection {
        val response = mRecentPostService.getRecentPosts()
        if (response.isSuccessful)
            AppResult.OnSuccess(response.body())
        else
            AppResult.OnFailure()
    }

    fun getEvent() = arrayListOf<ResponseEntity>().apply {
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