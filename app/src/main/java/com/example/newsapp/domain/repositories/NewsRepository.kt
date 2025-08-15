package com.example.newsapp.domain.repositories

import com.example.newsapp.domain.model.Article
import com.example.newsapp.util.Resource

interface NewsRepository {
    suspend fun getTopHeadlines(
        category: String
    ): Resource<List<Article>>

    suspend fun searchForNews(
        query: String
    ): Resource<List<Article>>
}