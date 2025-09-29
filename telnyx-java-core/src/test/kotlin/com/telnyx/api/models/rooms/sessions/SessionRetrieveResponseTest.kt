// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.RoomParticipant
import com.telnyx.api.models.rooms.RoomSession
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionRetrieveResponseTest {

    @Test
    fun create() {
        val sessionRetrieveResponse =
            SessionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        assertThat(sessionRetrieveResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sessionRetrieveResponse =
            SessionRetrieveResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedSessionRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionRetrieveResponse),
                jacksonTypeRef<SessionRetrieveResponse>(),
            )

        assertThat(roundtrippedSessionRetrieveResponse).isEqualTo(sessionRetrieveResponse)
    }
}
