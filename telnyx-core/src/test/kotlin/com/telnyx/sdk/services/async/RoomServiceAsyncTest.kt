// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.rooms.RoomCreateParams
import com.telnyx.sdk.models.rooms.RoomRetrieveParams
import com.telnyx.sdk.models.rooms.RoomUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoomServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val roomServiceAsync = client.rooms()

        val roomFuture =
            roomServiceAsync.create(
                RoomCreateParams.builder()
                    .enableRecording(true)
                    .maxParticipants(10L)
                    .uniqueName("My room")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val room = roomFuture.get()
        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val roomServiceAsync = client.rooms()

        val roomFuture =
            roomServiceAsync.retrieve(
                RoomRetrieveParams.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .includeSessions(true)
                    .build()
            )

        val room = roomFuture.get()
        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val roomServiceAsync = client.rooms()

        val roomFuture =
            roomServiceAsync.update(
                RoomUpdateParams.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .enableRecording(true)
                    .maxParticipants(10L)
                    .uniqueName("My room")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        val room = roomFuture.get()
        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val roomServiceAsync = client.rooms()

        val pageFuture = roomServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val roomServiceAsync = client.rooms()

        val future = roomServiceAsync.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val response = future.get()
    }
}
