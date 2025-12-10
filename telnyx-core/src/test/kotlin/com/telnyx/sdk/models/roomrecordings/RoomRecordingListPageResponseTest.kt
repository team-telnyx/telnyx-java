// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingListPageResponseTest {

    @Test
    fun create() {
        val roomRecordingListPageResponse =
            RoomRecordingListPageResponse.builder()
                .addData(
                    RoomRecordingListResponse.builder()
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
                        .status(RoomRecordingListResponse.Status.COMPLETED)
                        .type(RoomRecordingListResponse.Type.AUDIO)
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(roomRecordingListPageResponse.data().getOrNull())
            .containsExactly(
                RoomRecordingListResponse.builder()
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
                    .status(RoomRecordingListResponse.Status.COMPLETED)
                    .type(RoomRecordingListResponse.Type.AUDIO)
                    .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                    .build()
            )
        assertThat(roomRecordingListPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomRecordingListPageResponse =
            RoomRecordingListPageResponse.builder()
                .addData(
                    RoomRecordingListResponse.builder()
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
                        .status(RoomRecordingListResponse.Status.COMPLETED)
                        .type(RoomRecordingListResponse.Type.AUDIO)
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedRoomRecordingListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomRecordingListPageResponse),
                jacksonTypeRef<RoomRecordingListPageResponse>(),
            )

        assertThat(roundtrippedRoomRecordingListPageResponse)
            .isEqualTo(roomRecordingListPageResponse)
    }
}
