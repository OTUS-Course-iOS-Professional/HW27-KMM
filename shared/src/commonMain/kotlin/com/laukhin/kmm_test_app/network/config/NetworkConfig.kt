package com.laukhin.kmm_test_app.network.config


class NetworkConfig {
    companion object shared{
        val apiUrl = "newsapi.org"
        val apiKey = "6d0957c25e7e40d2b10e008ff19fa03c"

        val header: HashMap<String, String> =  hashMapOf("X-Api-Key" to apiKey)
    }
}