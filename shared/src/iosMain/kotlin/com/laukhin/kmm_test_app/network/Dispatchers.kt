package com.laukhin.kmm_test_app.network

import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers


actual val uiDispatcher: CoroutineDispatcher = Dispatchers.Main
actual  val ioDispatcher: CoroutineDispatcher = Dispatchers.Default