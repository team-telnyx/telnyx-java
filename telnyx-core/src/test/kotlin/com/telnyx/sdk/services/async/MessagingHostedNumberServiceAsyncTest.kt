// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberServiceAsync = client.messagingHostedNumbers()

        val messagingHostedNumberFuture = messagingHostedNumberServiceAsync.delete("id")

        val messagingHostedNumber = messagingHostedNumberFuture.get()
        messagingHostedNumber.validate()
    }
}
