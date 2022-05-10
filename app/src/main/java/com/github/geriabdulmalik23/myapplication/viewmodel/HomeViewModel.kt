package com.github.geriabdulmalik23.myapplication.viewmodel

import android.util.Log
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity
import com.github.geriabdulmalik23.myapplication.repository.HomeScreenRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val homeScreenRepository: HomeScreenRepository) : ViewModel() {

    private val _newsArticle by lazy { MutableLiveData<String>() }
    val article: LiveData<String>
        get() = _newsArticle

    private val _listArticle by lazy { MutableLiveData<List<ArticleEntity>>() }
    val list: LiveData<List<ArticleEntity>>
        get() {
            viewModelScope.launch {
                _listArticle.postValue(homeScreenRepository.getListArticle())
            }
            return _listArticle
        }

}