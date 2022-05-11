package com.github.geriabdulmalik23.myapplication.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity
import com.github.geriabdulmalik23.myapplication.extencion.addOnResultListener
import com.github.geriabdulmalik23.myapplication.repository.HomeScreenRepository
import com.github.geriabdulmalik23.myapplication.repository.RecentPostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val recentPostRepository: RecentPostRepository) :
    ViewModel() {

    private val _listArticle by lazy { MutableLiveData<List<ResponseEntity>>() }
    val list: MutableLiveData<List<ResponseEntity>>
        get() {
            viewModelScope.launch {
                recentPostRepository.getRecent().addOnResultListener(
                    onSuccess = {

                    },
                    onError = {

                    },
                    onFailure = { _, _ ->

                    }
                )
            }
            return _listArticle
        }


}