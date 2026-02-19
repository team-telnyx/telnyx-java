// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.storage.migrations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ActionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun stop() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val actionServiceAsync = client.storage().migrations().actions()

        val responseFuture = actionServiceAsync.stop("")

        val response = responseFuture.get()
        response.validate()
    }
}
