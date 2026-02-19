// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.rooms.RoomCreateParams
import com.telnyx.sdk.models.rooms.RoomRetrieveParams
import com.telnyx.sdk.models.rooms.RoomUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class RoomServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomService = client.rooms()

        val room =
            roomService.create(
                RoomCreateParams.builder()
                    .enableRecording(true)
                    .maxParticipants(10L)
                    .uniqueName("My room")
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )

        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomService = client.rooms()

        val room =
            roomService.retrieve(
                RoomRetrieveParams.builder()
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .includeSessions(true)
                    .build()
            )

        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomService = client.rooms()

        val room =
            roomService.update(
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

        room.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomService = client.rooms()

        val page = roomService.list()

        page.response().validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val roomService = client.rooms()

        roomService.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
    }
}
