package com.github.geriabdulmalik23.myapplication.repository

import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity
import com.github.geriabdulmalik23.myapplication.remote.HomeFragmentDataSource

class HomeScreenRepository {
    fun getListArticle(): List<ArticleEntity> {
        return HomeFragmentDataSource.getArticle().toList()
    }
}