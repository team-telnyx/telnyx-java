// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.detailrecords

import com.telnyx.api.core.http.QueryParams
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
            .page(DetailRecordListParams.Page.builder().number(1).size(1).build())
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
                .page(DetailRecordListParams.Page.builder().number(1).size(1).build())
                .addSort("string")
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("filter[record_type]", "ai-voice-assistant")
                    .put("filter[date_range]", "yesterday")
                    .put("page[number]", "1")
                    .put("page[size]", "1")
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
