// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.tunnels

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun rotateToken() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.tunnels().actions()

        val response = actionService.rotateToken("62d438d2-8a51-4c5e-9d0c-1f6b2a7e4c39")

        response.validate()
    }
}
