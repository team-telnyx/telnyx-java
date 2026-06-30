// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.reports.cdrusagereports

import com.telnyx.sdk.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CdrUsageReportFetchSyncParamsTest {

    @Test
    fun create() {
        CdrUsageReportFetchSyncParams.builder()
            .aggregationType(CdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
            .productBreakdown(CdrUsageReportFetchSyncParams.ProductBreakdown.NO_BREAKDOWN)
            .addConnection(1234567890123.0)
            .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            CdrUsageReportFetchSyncParams.builder()
                .aggregationType(CdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                .productBreakdown(CdrUsageReportFetchSyncParams.ProductBreakdown.NO_BREAKDOWN)
                .addConnection(1234567890123.0)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("aggregation_type", "NO_AGGREGATION")
                    .put("product_breakdown", "NO_BREAKDOWN")
                    .put("connections", listOf("1234567890123.0").joinToString(","))
                    .put("end_date", "2020-07-01T00:00:00-06:00")
                    .put("start_date", "2020-07-01T00:00:00-06:00")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            CdrUsageReportFetchSyncParams.builder()
                .aggregationType(CdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                .productBreakdown(CdrUsageReportFetchSyncParams.ProductBreakdown.NO_BREAKDOWN)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("aggregation_type", "NO_AGGREGATION")
                    .put("product_breakdown", "NO_BREAKDOWN")
                    .build()
            )
    }
}
