// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingDeleteBulkResponseTest {

    @Test
    fun create() {
        val roomRecordingDeleteBulkResponse =
            RoomRecordingDeleteBulkResponse.builder()
                .data(RoomRecordingDeleteBulkResponse.Data.builder().roomRecordings(5L).build())
                .build()

        assertThat(roomRecordingDeleteBulkResponse.data())
            .contains(RoomRecordingDeleteBulkResponse.Data.builder().roomRecordings(5L).build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val roomRecordingDeleteBulkResponse =
            RoomRecordingDeleteBulkResponse.builder()
                .data(RoomRecordingDeleteBulkResponse.Data.builder().roomRecordings(5L).build())
                .build()

        val roundtrippedRoomRecordingDeleteBulkResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(roomRecordingDeleteBulkResponse),
                jacksonTypeRef<RoomRecordingDeleteBulkResponse>(),
            )

        assertThat(roundtrippedRoomRecordingDeleteBulkResponse)
            .isEqualTo(roomRecordingDeleteBulkResponse)
    }
}
