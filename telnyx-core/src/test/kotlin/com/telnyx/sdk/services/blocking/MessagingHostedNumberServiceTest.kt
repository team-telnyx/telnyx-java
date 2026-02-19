// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingHostedNumberService = client.messagingHostedNumbers()

        val messagingHostedNumber = messagingHostedNumberService.delete("id")

        messagingHostedNumber.validate()
    }
}
