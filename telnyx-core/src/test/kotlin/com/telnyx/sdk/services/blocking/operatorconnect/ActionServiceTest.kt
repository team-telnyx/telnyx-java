// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.operatorconnect

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun refresh() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.operatorConnect().actions()

        val response = actionService.refresh()

        response.validate()
    }
}
