// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import java.time.format.DateTimeFormatter
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialMetricListParamsTest {

    @Test
    fun create() {
        DialMetricListParams.builder()
            .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .granularity(DialMetricListParams.Granularity.SECOND)
            .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
            .pageAfter("page[after]")
            .pageLimit(1L)
            .sort(DialMetricListParams.Sort.MINUS_START_TIME)
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            DialMetricListParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .granularity(DialMetricListParams.Granularity.SECOND)
                .startTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .pageAfter("page[after]")
                .pageLimit(1L)
                .sort(DialMetricListParams.Sort.MINUS_START_TIME)
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
                    .put("granularity", "second")
                    .put(
                        "start_time",
                        DateTimeFormatter.ISO_OFFSET_DATE_TIME.format(
                            OffsetDateTime.parse("2019-12-27T18:11:19.117Z")
                        ),
                    )
                    .put("page[after]", "page[after]")
                    .put("page[limit]", "1")
                    .put("sort", "-start_time")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            DialMetricListParams.builder()
                .endTime(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .granularity(DialMetricListParams.Granularity.SECOND)
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
                    .put("granularity", "second")
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
