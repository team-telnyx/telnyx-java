// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.rooms.RoomCreateParams
import com.telnyx.sdk.models.rooms.RoomListParams
import com.telnyx.sdk.models.rooms.RoomRetrieveParams
import com.telnyx.sdk.models.rooms.RoomUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomServiceAsync = client.rooms()

        val roomsFuture =
            roomServiceAsync.list(
                RoomListParams.builder()
                    .filter(
                        RoomListParams.Filter.builder()
                            .dateCreatedAt(
                                RoomListParams.Filter.DateCreatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .dateUpdatedAt(
                                RoomListParams.Filter.DateUpdatedAt.builder()
                                    .eq(LocalDate.parse("2021-04-25"))
                                    .gte(LocalDate.parse("2021-04-25"))
                                    .lte(LocalDate.parse("2021-04-25"))
                                    .build()
                            )
                            .uniqueName("my_video_room")
                            .build()
                    )
                    .includeSessions(true)
                    .page(RoomListParams.Page.builder().number(1L).size(1L).build())
                    .build()
            )

        val rooms = roomsFuture.get()
        rooms.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomServiceAsync = client.rooms()

        val future = roomServiceAsync.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")

        val response = future.get()
    }
}
