package com.github.geriabdulmalik23.myapplication.common

data class AppResponse<T>(
    val code: String? = null,
    val data: T? = null
)