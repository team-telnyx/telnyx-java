// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking.phonenumbers

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.phonenumbers.messaging.MessagingListParams
import com.telnyx.api.models.phonenumbers.messaging.MessagingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class MessagingServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingService = client.phoneNumbers().messaging()

        val messaging = messagingService.retrieve("id")

        messaging.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val messagingService = client.phoneNumbers().messaging()

        val messagings =
            messagingService.list(
                MessagingListParams.builder()
                    .page(MessagingListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        messagings.validate()
    }
}
