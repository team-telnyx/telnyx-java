// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.alphanumericsenderids.AlphanumericSenderIdCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AlphanumericSenderIdServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val alphanumericSenderIdServiceAsync = client.alphanumericSenderIds()

        val alphanumericSenderIdFuture =
            alphanumericSenderIdServiceAsync.create(
                AlphanumericSenderIdCreateParams.builder()
                    .alphanumericSenderId("MyCompany")
                    .messagingProfileId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .usLongCodeFallback("+15551234567")
                    .build()
            )

        val alphanumericSenderId = alphanumericSenderIdFuture.get()
        alphanumericSenderId.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val alphanumericSenderIdServiceAsync = client.alphanumericSenderIds()

        val alphanumericSenderIdFuture = alphanumericSenderIdServiceAsync.retrieve("id")

        val alphanumericSenderId = alphanumericSenderIdFuture.get()
        alphanumericSenderId.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val alphanumericSenderIdServiceAsync = client.alphanumericSenderIds()

        val pageFuture = alphanumericSenderIdServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val alphanumericSenderIdServiceAsync = client.alphanumericSenderIds()

        val alphanumericSenderIdFuture = alphanumericSenderIdServiceAsync.delete("id")

        val alphanumericSenderId = alphanumericSenderIdFuture.get()
        alphanumericSenderId.validate()
    }
}
