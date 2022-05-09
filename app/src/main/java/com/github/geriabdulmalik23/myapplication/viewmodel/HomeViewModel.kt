package com.github.geriabdulmalik23.myapplication.viewmodel

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    init {
        Log.d("testlog","siip")
    }
    override fun onCleared() {
        super.onCleared()
        Log.d("testlog","Oke")
    }
}