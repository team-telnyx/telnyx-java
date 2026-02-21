// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val alphanumericSenderIdService = client.alphanumericSenderIds()

        val alphanumericSenderId =
            alphanumericSenderIdService.create(
                AlphanumericSenderIdCreateParams.builder()
                    .alphanumericSenderId("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .usLongCodeFallback("+15551234567")
                    .build()
            )

        alphanumericSenderId.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val alphanumericSenderIdService = client.alphanumericSenderIds()

        val alphanumericSenderId = alphanumericSenderIdService.retrieve("id")

        alphanumericSenderId.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val alphanumericSenderIdService = client.alphanumericSenderIds()

        val page = alphanumericSenderIdService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val alphanumericSenderIdService = client.alphanumericSenderIds()

        val alphanumericSenderId = alphanumericSenderIdService.delete("id")

        alphanumericSenderId.validate()
    }
}
