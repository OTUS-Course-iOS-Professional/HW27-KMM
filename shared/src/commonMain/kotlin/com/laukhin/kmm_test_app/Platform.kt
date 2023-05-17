package com.laukhin.kmm_test_app

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform