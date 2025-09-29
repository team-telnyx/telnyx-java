// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomrecordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingListResponseTest {

    @Test
    fun create() {
        val roomRecordingListResponse =
            RoomRecordingListResponse.builder()
                .addData(
                    RoomRecordingListResponse.Data.builder()
                        .id("6b61621f-62e0-4aad-ab11-9fd19e272e73")
                        .codec("opus")
                        .completedAt(OffsetDateTime.parse("2021-04-16T10:25:55.962200Z"))
                        .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                        .downloadUrl("https://www.example.com")
                        .durationSecs(3660L)
                        .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .participantId("9b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .recordType("room_session")
                        .roomId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .sessionId("8b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .sizeMb(5.6f)
                        .startedAt(OffsetDateTime.parse("2021-04-16T09:24:55.962200Z"))
                        .status(RoomRecordingListResponse.Data.Status.COMPLETED)
                        .type(RoomRecordingListResponse.Data.Type.AUDIO)
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

        assertThat(roomRecordingListResponse.data().getOrNull())
            .containsExactly(
                RoomRecordingListResponse.Data.builder()
                    .id("6b61621f-62e0-4aad-ab11-9fd19e272e73")
                    .codec("opus")
                    .completedAt(OffsetDateTime.parse("2021-04-16T10:25:55.962200Z"))
                    .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                    .downloadUrl("https://www.example.com")
                    .durationSecs(3660L)
                    .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                    .participantId("9b61621f-5fe4-4aad-ab11-9fd19e272e73")
                    .recordType("room_session")
                    .roomId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                    .sessionId("8b61621f-5fe4-4aad-ab11-9fd19e272e73")
                    .sizeMb(5.6f)
                    .startedAt(OffsetDateTime.parse("2021-04-16T09:24:55.962200Z"))
                    .status(RoomRecordingListResponse.Data.Status.COMPLETED)
                    .type(RoomRecordingListResponse.Data.Type.AUDIO)
                    .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                    .build()
            )
        assertThat(roomRecordingListResponse.meta())
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
        val roomRecordingListResponse =
            RoomRecordingListResponse.builder()
                .addData(
                    RoomRecordingListResponse.Data.builder()
                        .id("6b61621f-62e0-4aad-ab11-9fd19e272e73")
                        .codec("opus")
                        .completedAt(OffsetDateTime.parse("2021-04-16T10:25:55.962200Z"))
                        .createdAt(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
                        .downloadUrl("https://www.example.com")
                        .durationSecs(3660L)
                        .endedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .participantId("9b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .recordType("room_session")
                        .roomId("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .sessionId("8b61621f-5fe4-4aad-ab11-9fd19e272e73")
                        .sizeMb(5.6f)
                        .startedAt(OffsetDateTime.parse("2021-04-16T09:24:55.962200Z"))
                        .status(RoomRecordingListResponse.Data.Status.COMPLETED)
                        .type(RoomRecordingListResponse.Data.Type.AUDIO)
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

        val roundtrippedRoomRecordingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomRecordingListResponse),
                jacksonTypeRef<RoomRecordingListResponse>(),
            )

        assertThat(roundtrippedRoomRecordingListResponse).isEqualTo(roomRecordingListResponse)
    }
}
