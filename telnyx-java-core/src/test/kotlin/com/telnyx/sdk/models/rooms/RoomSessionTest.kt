// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.RoomParticipant
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomSessionTest {

    @Test
    fun create() {
        val roomSession =
            RoomSession.builder()
                .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .active(false)
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
                .roomId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .build()

        assertThat(roomSession.id()).contains("7b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(roomSession.active()).contains(false)
        assertThat(roomSession.createdAt())
            .contains(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
        assertThat(roomSession.endedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
        assertThat(roomSession.participants().getOrNull())
            .containsExactly(
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
        assertThat(roomSession.recordType()).contains("room_session")
        assertThat(roomSession.roomId()).contains("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
        assertThat(roomSession.updatedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomSession =
            RoomSession.builder()
                .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .active(false)
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
                .roomId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .build()

        val roundtrippedRoomSession =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomSession),
                jacksonTypeRef<RoomSession>(),
            )

        assertThat(roundtrippedRoomSession).isEqualTo(roomSession)
    }
}
