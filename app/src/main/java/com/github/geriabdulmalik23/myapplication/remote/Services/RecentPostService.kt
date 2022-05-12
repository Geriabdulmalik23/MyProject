package com.github.geriabdulmalik23.myapplication.remote.Services

import com.github.geriabdulmalik23.myapplication.common.AppResponse
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity
import retrofit2.Response
import retrofit2.http.GET

interface RecentPostService {

    @GET("api/get_recent_posts/?count=5")
    suspend fun getRecentPosts(): Response<ResponseEntity>


}