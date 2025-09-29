// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.roomrecordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingRetrieveResponseTest {

    @Test
    fun create() {
        val roomRecordingRetrieveResponse =
            RoomRecordingRetrieveResponse.builder()
                .data(
                    RoomRecordingRetrieveResponse.Data.builder()
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
                        .status(RoomRecordingRetrieveResponse.Data.Status.COMPLETED)
                        .type(RoomRecordingRetrieveResponse.Data.Type.AUDIO)
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .build()
                )
                .build()

        assertThat(roomRecordingRetrieveResponse.data())
            .contains(
                RoomRecordingRetrieveResponse.Data.builder()
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
                    .status(RoomRecordingRetrieveResponse.Data.Status.COMPLETED)
                    .type(RoomRecordingRetrieveResponse.Data.Type.AUDIO)
                    .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomRecordingRetrieveResponse =
            RoomRecordingRetrieveResponse.builder()
                .data(
                    RoomRecordingRetrieveResponse.Data.builder()
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
                        .status(RoomRecordingRetrieveResponse.Data.Status.COMPLETED)
                        .type(RoomRecordingRetrieveResponse.Data.Type.AUDIO)
                        .updatedAt(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
                        .build()
                )
                .build()

        val roundtrippedRoomRecordingRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomRecordingRetrieveResponse),
                jacksonTypeRef<RoomRecordingRetrieveResponse>(),
            )

        assertThat(roundtrippedRoomRecordingRetrieveResponse)
            .isEqualTo(roomRecordingRetrieveResponse)
    }
}
