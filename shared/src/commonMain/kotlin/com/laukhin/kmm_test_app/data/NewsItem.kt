package com.laukhin.kmm_test_app.data


@kotlinx.serialization.Serializable
data class NewsItem(
    val author: String?,
    val title: String?,
    val descriprion: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?
)

