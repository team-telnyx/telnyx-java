// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingListResponseTest {

    @Test
    fun create() {
        val roomRecordingListResponse =
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

        assertThat(roomRecordingListResponse.id()).contains("6b61621f-62e0-4aad-ab11-9fd19e272e73")
        assertThat(roomRecordingListResponse.codec()).contains("opus")
        assertThat(roomRecordingListResponse.completedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:25:55.962200Z"))
        assertThat(roomRecordingListResponse.createdAt())
            .contains(OffsetDateTime.parse("2021-04-16T09:46:20.954863Z"))
        assertThat(roomRecordingListResponse.downloadUrl()).contains("https://www.example.com")
        assertThat(roomRecordingListResponse.durationSecs()).contains(3660L)
        assertThat(roomRecordingListResponse.endedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
        assertThat(roomRecordingListResponse.participantId())
            .contains("9b61621f-5fe4-4aad-ab11-9fd19e272e73")
        assertThat(roomRecordingListResponse.recordType()).contains("room_session")
        assertThat(roomRecordingListResponse.roomId())
            .contains("7b61621f-5fe4-4aad-ab11-9fd19e272e73")
        assertThat(roomRecordingListResponse.sessionId())
            .contains("8b61621f-5fe4-4aad-ab11-9fd19e272e73")
        assertThat(roomRecordingListResponse.sizeMb()).contains(5.6f)
        assertThat(roomRecordingListResponse.startedAt())
            .contains(OffsetDateTime.parse("2021-04-16T09:24:55.962200Z"))
        assertThat(roomRecordingListResponse.status())
            .contains(RoomRecordingListResponse.Status.COMPLETED)
        assertThat(roomRecordingListResponse.type()).contains(RoomRecordingListResponse.Type.AUDIO)
        assertThat(roomRecordingListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2021-04-16T10:24:55.962200Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomRecordingListResponse =
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

        val roundtrippedRoomRecordingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomRecordingListResponse),
                jacksonTypeRef<RoomRecordingListResponse>(),
            )

        assertThat(roundtrippedRoomRecordingListResponse).isEqualTo(roomRecordingListResponse)
    }
}
