// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomParticipantTest {

    @Test
    fun create() {
        val roomParticipant =
            RoomParticipant.builder()
                .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .context("Alice")
                .joinedAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                .leftAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .recordType("room_participant")
                .sessionId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .build()

        assertThat(roomParticipant.id()).contains("7b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(roomParticipant.context()).contains("Alice")
        assertThat(roomParticipant.joinedAt())
            .contains(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
        assertThat(roomParticipant.leftAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
        assertThat(roomParticipant.recordType()).contains("room_participant")
        assertThat(roomParticipant.sessionId()).contains("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
        assertThat(roomParticipant.updatedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomParticipant =
            RoomParticipant.builder()
                .id("7b61621f-62e0-4aad-ab11-9fd19e272e73")
                .context("Alice")
                .joinedAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                .leftAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .recordType("room_participant")
                .sessionId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                .build()

        val roundtrippedRoomParticipant =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomParticipant),
                jacksonTypeRef<RoomParticipant>(),
            )

        assertThat(roundtrippedRoomParticipant).isEqualTo(roomParticipant)
    }
}
