// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.detailrecords

import com.telnyx.sdk.core.http.QueryParams
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailRecordListParamsTest {

    @Test
    fun create() {
        DetailRecordListParams.builder()
            .filter(
                DetailRecordListParams.Filter.builder()
                    .recordType(DetailRecordListParams.Filter.RecordType.AI_VOICE_ASSISTANT)
                    .dateRange(DetailRecordListParams.Filter.DateRange.YESTERDAY)
                    .build()
            )
            .pageNumber(0L)
            .pageSize(0L)
            .addSort("string")
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DetailRecordListParams.builder()
                .filter(
                    DetailRecordListParams.Filter.builder()
                        .recordType(DetailRecordListParams.Filter.RecordType.AI_VOICE_ASSISTANT)
                        .dateRange(DetailRecordListParams.Filter.DateRange.YESTERDAY)
                        .build()
                )
                .pageNumber(0L)
                .pageSize(0L)
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[record_type]", "ai-voice-assistant")
                    .put("filter[date_range]", "yesterday")
                    .put("page[number]", "0")
                    .put("page[size]", "0")
                    .put("sort", listOf("string").joinToString(","))
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params = DetailRecordListParams.builder().build()

        val queryParams = params._queryParams()

        assertThat(queryParams).isEqualTo(QueryParams.builder().build())
    }
}
