// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingServiceAsync = client.phoneNumbers().messaging()

        val messagingFuture = messagingServiceAsync.retrieve("id")

        val messaging = messagingFuture.get()
        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingServiceAsync = client.phoneNumbers().messaging()

        val messagingFuture =
            messagingServiceAsync.update(
                MessagingUpdateParams.builder()
                    .id("id")
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .build()
            )

        val messaging = messagingFuture.get()
        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val messagingServiceAsync = client.phoneNumbers().messaging()

        val pageFuture = messagingServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
