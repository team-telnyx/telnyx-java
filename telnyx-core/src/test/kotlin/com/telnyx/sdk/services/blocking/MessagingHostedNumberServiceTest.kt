// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.messaginghostednumbers.MessagingHostedNumberUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingHostedNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingHostedNumberService = client.messagingHostedNumbers()

        val messagingHostedNumber = messagingHostedNumberService.retrieve("id")

        messagingHostedNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingHostedNumberService = client.messagingHostedNumbers()

        val messagingHostedNumber =
            messagingHostedNumberService.update(
                MessagingHostedNumberUpdateParams.builder()
                    .id("id")
                    .messagingProduct("P2P")
                    .messagingProfileId("dd50eba1-a0c0-4563-9925-b25e842a7cb6")
                    .addTag("string")
                    .build()
            )

        messagingHostedNumber.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingHostedNumberService = client.messagingHostedNumbers()

        val page = messagingHostedNumberService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingHostedNumberService = client.messagingHostedNumbers()

        val messagingHostedNumber = messagingHostedNumberService.delete("id")

        messagingHostedNumber.validate()
    }
}
