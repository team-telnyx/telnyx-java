// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomparticipants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.RoomParticipant
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomParticipantListResponseTest {

    @Test
    fun create() {
        val roomParticipantListResponse =
            RoomParticipantListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(roomParticipantListResponse.data().getOrNull())
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
        assertThat(roomParticipantListResponse.meta())
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
        val roomParticipantListResponse =
            RoomParticipantListResponse.builder()
                .addData(
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
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRoomParticipantListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomParticipantListResponse),
                jacksonTypeRef<RoomParticipantListResponse>(),
            )

        assertThat(roundtrippedRoomParticipantListResponse).isEqualTo(roomParticipantListResponse)
    }
}
