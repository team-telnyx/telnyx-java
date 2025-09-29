// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.sessions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.RoomParticipant
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import com.telnyx.api.models.rooms.RoomSession
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SessionList0ResponseTest {

    @Test
    fun create() {
        val sessionList0Response =
            SessionList0Response.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(sessionList0Response.data().getOrNull())
            .containsExactly(
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
        assertThat(sessionList0Response.meta())
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
        val sessionList0Response =
            SessionList0Response.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedSessionList0Response =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sessionList0Response),
                jacksonTypeRef<SessionList0Response>(),
            )

        assertThat(roundtrippedSessionList0Response).isEqualTo(sessionList0Response)
    }
}
