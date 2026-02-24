package com.telnyx.sdk

internal object TestServerExtension {
    val BASE_URL = System.getenv("TEST_API_BASE_URL") ?: "http://localhost:4010"
}
