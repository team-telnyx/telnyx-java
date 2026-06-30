// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.mobilephonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class MessagingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.mobilePhoneNumbers().messaging()

        val messaging = messagingService.retrieve("id")

        messaging.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val messagingService = client.mobilePhoneNumbers().messaging()

        val page = messagingService.list()

        page.response().validate()
    }
}
