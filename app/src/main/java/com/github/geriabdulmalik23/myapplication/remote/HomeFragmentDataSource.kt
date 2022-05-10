package com.github.geriabdulmalik23.myapplication.remote

import com.github.geriabdulmalik23.myapplication.entity.ArticleEntity

object HomeFragmentDataSource {

    fun getArticle() = arrayListOf<ArticleEntity>().apply {
        add(ArticleEntity(id = 1, name = "Lorem Ipsum Dolor Sit Amet",label = "Programming"))
        add(ArticleEntity(id = 2, name = "Lorem Ipsum Dolor Sit Amet",label = "Coding"))
        add(ArticleEntity(id = 3, name = "Lorem Ipsum Dolor Sit Amet",label = "Tutorial"))
    }
}