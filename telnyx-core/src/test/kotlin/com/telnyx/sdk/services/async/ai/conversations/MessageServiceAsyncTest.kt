// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.conversations

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessageServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messageServiceAsync = client.ai().conversations().messages()

        val messagesFuture = messageServiceAsync.list("conversation_id")

        val messages = messagesFuture.get()
        messages.validate()
    }
}
