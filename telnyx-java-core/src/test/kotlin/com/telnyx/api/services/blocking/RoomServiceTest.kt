// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.services.blocking

import com.telnyx.api.TestServerExtension
import com.telnyx.api.client.okhttp.TelnyxOkHttpClient
import com.telnyx.api.models.rooms.RoomCreateParams
import com.telnyx.api.models.rooms.RoomListParams
import com.telnyx.api.models.rooms.RoomRetrieveParams
import com.telnyx.api.models.rooms.RoomUpdateParams
import java.time.LocalDate
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class RoomServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
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
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomService = client.rooms()

        val rooms =
            roomService.list(
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

        rooms.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun delete() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val roomService = client.rooms()

        roomService.delete("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
    }
}
