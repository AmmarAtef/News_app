package com.example.newsapp.data.network

import com.example.newsapp.domain.model.NewsResponse
import retrofit2.http.GET
import retrofit2.http.Query


interface NewsApiService {

    // https://newsapi.org/v2/top-headlines?country=us&page=1&apiKey=API_KEY
    @GET("top-headlines")
    suspend fun getBreakingNews(
        @Query("category") category: String,
        @Query("country") country: String = "us",
        @Query("apiKey") apiKey: String = "82d4f3dd9276471ab7dfa1898fdc6a7d"
    ) : NewsResponse

    @GET("everything")
    suspend fun searchForNews(
        @Query("q") query: String,
        @Query("apiKey") apiKey: String = "82d4f3dd9276471ab7dfa1898fdc6a7d"
    ) : NewsResponse
}