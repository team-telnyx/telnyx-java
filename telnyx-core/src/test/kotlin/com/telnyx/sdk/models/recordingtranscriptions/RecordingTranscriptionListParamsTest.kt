// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.recordingtranscriptions

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingTranscriptionListParamsTest {

    @Test
    fun create() {
        RecordingTranscriptionListParams.builder()
            .filter(
                RecordingTranscriptionListParams.Filter.builder()
                    .createdAt(
                        RecordingTranscriptionListParams.Filter.CreatedAt.builder()
                            .gte("2019-03-29T11:10:00Z")
                            .lte("2019-03-29T11:10:00Z")
                            .build()
                    )
                    .recordingId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            RecordingTranscriptionListParams.builder()
                .filter(
                    RecordingTranscriptionListParams.Filter.builder()
                        .createdAt(
                            RecordingTranscriptionListParams.Filter.CreatedAt.builder()
                                .gte("2019-03-29T11:10:00Z")
                                .lte("2019-03-29T11:10:00Z")
                                .build()
                        )
                        .recordingId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[created_at][gte]", "2019-03-29T11:10:00Z")
                    .put("filter[created_at][lte]", "2019-03-29T11:10:00Z")
                    .put("filter[recording_id]", "428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = RecordingTranscriptionListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
