package com.github.geriabdulmalik23.myapplication.common

import com.google.gson.annotations.SerializedName

sealed class AppResult<T> {
    data class OnSuccess<T>(val data: T?, val code: Int? = null) : AppResult<T>()

    data class OnFailure<T>(
        @SerializedName("data")
        val data: T? = null,
        @SerializedName("code")
        val code: Int? = null,
        @SerializedName("message")
        val message: String? = null
    ) : AppResult<T>()

    data class OnError<T>(val throwable: Throwable?) : AppResult<T>()
}