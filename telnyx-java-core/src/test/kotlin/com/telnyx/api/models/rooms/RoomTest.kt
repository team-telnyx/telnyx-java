// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.RoomParticipant
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomTest {

    @Test
    fun create() {
        val room =
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

        assertThat(room.id()).contains("7b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(room.activeSessionId()).contains("7b61621f-62e0-4aad-ab11-9fd19e272e74")
        assertThat(room.createdAt()).contains(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
        assertThat(room.enableRecording()).contains(true)
        assertThat(room.maxParticipants()).contains(50L)
        assertThat(room.recordType()).contains("room")
        assertThat(room.sessions().getOrNull())
            .containsExactly(
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
        assertThat(room.uniqueName()).contains("My Room")
        assertThat(room.updatedAt()).contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
        assertThat(room.webhookEventFailoverUrl()).contains("https://failover.example.com")
        assertThat(room.webhookEventUrl()).contains("https://www.example.com")
        assertThat(room.webhookTimeoutSecs()).contains(25L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val room =
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

        val roundtrippedRoom =
            jsonMapper.readValue(jsonMapper.writeValueAsString(room), jacksonTypeRef<Room>())

        assertThat(roundtrippedRoom).isEqualTo(room)
    }
}
