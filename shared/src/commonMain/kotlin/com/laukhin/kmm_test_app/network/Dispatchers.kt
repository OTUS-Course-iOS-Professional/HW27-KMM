package com.laukhin.kmm_test_app.network

import kotlinx.coroutines.CoroutineDispatcher

expect val uiDispatcher: CoroutineDispatcher
expect val ioDispatcher: CoroutineDispatcher