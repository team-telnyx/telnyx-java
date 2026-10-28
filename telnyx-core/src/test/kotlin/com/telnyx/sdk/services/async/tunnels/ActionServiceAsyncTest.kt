// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.tunnels

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateToken() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.tunnels().actions()

        val responseFuture = actionServiceAsync.rotateToken("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")

        val response = responseFuture.get()
        response.validate()
    }
}
