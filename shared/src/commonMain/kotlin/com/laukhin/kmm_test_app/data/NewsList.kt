package com.laukhin.kmm_test_app.data

@kotlinx.serialization.Serializable
data class NewsList(
    val articles: List<NewsItem>?
)