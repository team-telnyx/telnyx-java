// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.phonenumbers.messaging.MessagingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.phoneNumbers().messaging()

        val messaging = messagingService.retrieve("id")

        messaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.phoneNumbers().messaging()

        val messaging =
            messagingService.update(
                MessagingUpdateParams.builder()
                    .id("id")
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .build()
            )

        messaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.phoneNumbers().messaging()

        val page = messagingService.list()

        page.response().validate()
    }
}
