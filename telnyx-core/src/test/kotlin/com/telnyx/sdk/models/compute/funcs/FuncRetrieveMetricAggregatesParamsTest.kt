// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.compute.funcs

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FuncRetrieveMetricAggregatesParamsTest {

    @Test
    fun create() {
        FuncRetrieveMetricAggregatesParams.builder()
            .id("id")
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .filterEdgeSite("filter[edge_site]")
            .filterNamespace("filter[namespace]")
            .pageNumber(0L)
            .pageSize(1L)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            FuncRetrieveMetricAggregatesParams.builder()
                .id("id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun queryParams() {
        val params =
            FuncRetrieveMetricAggregatesParams.builder()
                .id("id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .filterEdgeSite("filter[edge_site]")
                .filterNamespace("filter[namespace]")
                .pageNumber(0L)
                .pageSize(1L)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "end_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put(
                        "start_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("filter[edge_site]", "filter[edge_site]")
                    .put("filter[namespace]", "filter[namespace]")
                    .put("page[number]", "0")
                    .put("page[size]", "1")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            FuncRetrieveMetricAggregatesParams.builder()
                .id("id")
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put(
                        "end_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put(
                        "start_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .build()
            )
    }
}
