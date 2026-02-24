// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.storage.migrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val actionService = client.storage().migrations().actions()

        val response = actionService.stop("")

        response.validate()
    }
}
