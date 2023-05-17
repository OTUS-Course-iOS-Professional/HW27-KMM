package com.laukhin.kmm_test_app

import com.laukhin.kmm_test_app.network.http.NetworkClient
import com.laukhin.kmm_test_app.service.NewsService

object DI {
    val httpClient: NetworkClient by lazy {
        NetworkClient()
    }

    val newsService: NewsService by lazy {
        NewsService(httpClient)
    }
}