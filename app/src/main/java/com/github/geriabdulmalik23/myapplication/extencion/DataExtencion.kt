package com.github.geriabdulmalik23.myapplication.extencion

import com.github.geriabdulmalik23.myapplication.common.AppResult

inline fun <T> connection(run: () -> AppResult<T>): AppResult<T> =
    try {
        run()
    } catch (e: Throwable) {

        AppResult.OnError(e)
    }

inline fun <reified T> AppResult<T>.addOnResultListener(
    onSuccess: (data: T?) -> Unit,
    onFailure: (data: T?, code: Int?) -> Unit,
    onError: (throwable: Throwable?) -> Unit
) {

    when (this) {
        is AppResult.OnSuccess -> onSuccess(this.data)
        is AppResult.OnFailure -> onFailure(this.data, this.code)
        is AppResult.OnError -> onError(this.throwable)
    }

}