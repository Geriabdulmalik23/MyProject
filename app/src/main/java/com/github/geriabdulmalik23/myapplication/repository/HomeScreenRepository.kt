package com.github.geriabdulmalik23.myapplication.repository

import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity
import com.github.geriabdulmalik23.myapplication.entity.ResponseEntity
import com.github.geriabdulmalik23.myapplication.remote.RecentPostDataSorce

class HomeScreenRepository {
    fun getListArticle(): List<ResponseEntity> {
        return RecentPostDataSorce.getRecentPost().toList()
    }
}