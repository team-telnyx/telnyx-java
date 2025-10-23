// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.roomrecordings

import com.telnyx.sdk.core.http.QueryParams
import java.time.LocalDate
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RoomRecordingDeleteBulkParamsTest {

    @Test
    fun create() {
        RoomRecordingDeleteBulkParams.builder()
            .filter(
                RoomRecordingDeleteBulkParams.Filter.builder()
                    .dateEndedAt(
                        RoomRecordingDeleteBulkParams.Filter.DateEndedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .dateStartedAt(
                        RoomRecordingDeleteBulkParams.Filter.DateStartedAt.builder()
                            .eq(LocalDate.parse("2021-04-25"))
                            .gte(LocalDate.parse("2021-04-25"))
                            .lte(LocalDate.parse("2021-04-25"))
                            .build()
                    )
                    .durationSecs(20L)
                    .participantId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .status("completed")
                    .type("audio")
                    .build()
            )
            .page(RoomRecordingDeleteBulkParams.Page.builder().number(1L).size(1L).build())
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RoomRecordingDeleteBulkParams.builder()
                .filter(
                    RoomRecordingDeleteBulkParams.Filter.builder()
                        .dateEndedAt(
                            RoomRecordingDeleteBulkParams.Filter.DateEndedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .dateStartedAt(
                            RoomRecordingDeleteBulkParams.Filter.DateStartedAt.builder()
                                .eq(LocalDate.parse("2021-04-25"))
                                .gte(LocalDate.parse("2021-04-25"))
                                .lte(LocalDate.parse("2021-04-25"))
                                .build()
                        )
                        .durationSecs(20L)
                        .participantId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .roomId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .sessionId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .status("completed")
                        .type("audio")
                        .build()
                )
                .page(RoomRecordingDeleteBulkParams.Page.builder().number(1L).size(1L).build())
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[date_ended_at][eq]", "2021-04-25")
                    .put("filter[date_ended_at][gte]", "2021-04-25")
                    .put("filter[date_ended_at][lte]", "2021-04-25")
                    .put("filter[date_started_at][eq]", "2021-04-25")
                    .put("filter[date_started_at][gte]", "2021-04-25")
                    .put("filter[date_started_at][lte]", "2021-04-25")
                    .put("filter[duration_secs]", "20")
                    .put("filter[participant_id]", "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .put("filter[room_id]", "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .put("filter[session_id]", "0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .put("filter[status]", "completed")
                    .put("filter[type]", "audio")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RoomRecordingDeleteBulkParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
