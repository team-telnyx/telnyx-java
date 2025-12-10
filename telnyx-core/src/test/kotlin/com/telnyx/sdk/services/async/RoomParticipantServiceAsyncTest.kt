// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomParticipantServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomParticipantServiceAsync = client.roomParticipants()

        val roomParticipantFuture =
            roomParticipantServiceAsync.retrieve("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val roomParticipant = roomParticipantFuture.get()
        roomParticipant.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomParticipantServiceAsync = client.roomParticipants()

        val pageFuture = roomParticipantServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }
}
