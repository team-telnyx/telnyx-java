// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.testframework

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class V1ServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrievePersonalities() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val v1ServiceAsync = client.ai().tests().testFramework().v1()

        val responseFuture = v1ServiceAsync.retrievePersonalities()

        val response = responseFuture.get()
        response.forEach { it.validate() }
    }
}
