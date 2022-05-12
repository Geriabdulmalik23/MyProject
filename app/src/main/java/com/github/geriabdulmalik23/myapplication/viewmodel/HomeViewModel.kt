package com.github.geriabdulmalik23.myapplication.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity
import com.github.geriabdulmalik23.myapplication.extencion.addOnResultListener
import com.github.geriabdulmalik23.myapplication.repository.RecentPostRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val recentPostRepository: RecentPostRepository) :
    ViewModel() {

    private val _listArticle by lazy { MutableLiveData<ResponseEntity>() }
    val list: MutableLiveData<ResponseEntity>
        get() {
            viewModelScope.launch {
                recentPostRepository.getRecent().addOnResultListener(
                    onSuccess = {
                        _listArticle.postValue(it)
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