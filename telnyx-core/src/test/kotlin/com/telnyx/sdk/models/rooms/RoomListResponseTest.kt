// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomListResponseTest {

    @Test
    fun create() {
        val roomListResponse =
            RoomListResponse.builder()
                .addData(
                    Room.builder()
                        .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                        .activeSessionId("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                        .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                        .enableRecording(true)
                        .maxParticipants(50L)
                        .recordType("room")
                        .addSession(
                            RoomSession.builder()
                                .id("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                                .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                .addParticipant(
                                    RoomParticipant.builder()
                                        .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                                        .context("Alice")
                                        .joinedAt(
                                            OffsetDateTime.parse("2021-04-16T09:46:20.954863Z")
                                        )
                                        .leftAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                        .recordType("room_participant")
                                        .sessionId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                                        .updatedAt(
                                            OffsetDateTime.parse("2021-04-16T10:24:55.962200Z")
                                        )
                                        .build()
                                )
                                .recordType("room_session")
                                .roomId("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                .build()
                        )
                        .uniqueName("My Room")
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://www.example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(roomListResponse.data().getOrNull())
            .containsExactly(
                Room.builder()
                    .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                    .activeSessionId("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                    .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                    .enableRecording(true)
                    .maxParticipants(50L)
                    .recordType("room")
                    .addSession(
                        RoomSession.builder()
                            .id("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                            .active(true)
                            .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                            .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                            .addParticipant(
                                RoomParticipant.builder()
                                    .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                                    .context("Alice")
                                    .joinedAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                                    .leftAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                    .recordType("room_participant")
                                    .sessionId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                                    .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                    .build()
                            )
                            .recordType("room_session")
                            .roomId("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                            .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                            .build()
                    )
                    .uniqueName("My Room")
                    .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                    .webhookEventFailoverUrl("https://failover.example.com")
                    .webhookEventUrl("https://www.example.com")
                    .webhookTimeoutSecs(25L)
                    .build()
            )
        assertThat(roomListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomListResponse =
            RoomListResponse.builder()
                .addData(
                    Room.builder()
                        .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                        .activeSessionId("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                        .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                        .enableRecording(true)
                        .maxParticipants(50L)
                        .recordType("room")
                        .addSession(
                            RoomSession.builder()
                                .id("7b61621f-62e0-4aad-ab11-9fd19e272e74")
                                .active(true)
                                .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                                .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                .addParticipant(
                                    RoomParticipant.builder()
                                        .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                                        .context("Alice")
                                        .joinedAt(
                                            OffsetDateTime.parse("2021-04-16T09:46:20.954863Z")
                                        )
                                        .leftAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                        .recordType("room_participant")
                                        .sessionId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                                        .updatedAt(
                                            OffsetDateTime.parse("2021-04-16T10:24:55.962200Z")
                                        )
                                        .build()
                                )
                                .recordType("room_session")
                                .roomId("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                                .build()
                        )
                        .uniqueName("My Room")
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .webhookEventFailoverUrl("https://failover.example.com")
                        .webhookEventUrl("https://www.example.com")
                        .webhookTimeoutSecs(25L)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRoomListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomListResponse),
                jacksonTypeRef<RoomListResponse>(),
            )

        assertThat(roundtrippedRoomListResponse).isEqualTo(roomListResponse)
    }
}
