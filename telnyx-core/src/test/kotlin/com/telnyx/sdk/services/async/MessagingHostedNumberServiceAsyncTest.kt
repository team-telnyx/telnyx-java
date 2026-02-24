// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberServiceAsync = client.messagingHostedNumbers()

        val messagingHostedNumberFuture = messagingHostedNumberServiceAsync.retrieve("id")

        val messagingHostedNumber = messagingHostedNumberFuture.get()
        messagingHostedNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberServiceAsync = client.messagingHostedNumbers()

        val messagingHostedNumberFuture =
            messagingHostedNumberServiceAsync.update(
                MessagingHostedNumberUpdateParams.builder()
                    .id("id")
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .addTag("string")
                    .build()
            )

        val messagingHostedNumber = messagingHostedNumberFuture.get()
        messagingHostedNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingHostedNumberServiceAsync = client.messagingHostedNumbers()

        val pageFuture = messagingHostedNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

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
