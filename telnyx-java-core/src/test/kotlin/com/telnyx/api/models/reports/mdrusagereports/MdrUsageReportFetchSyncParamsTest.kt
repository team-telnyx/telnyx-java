// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import com.telnyx.api.core.http.QueryParams
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrUsageReportFetchSyncParamsTest {

    @Test
    fun create() {
        MdrUsageReportFetchSyncParams.builder()
            .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
            .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .addProfile("My profile")
            .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .build()
    }

    @Test
    fun queryParams() {
        val params =
            MdrUsageReportFetchSyncParams.builder()
                .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .addProfile("My profile")
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(
                QueryParams.builder()
                    .put("aggregation_type", "NO_AGGREGATION")
                    .put("end_date", "2020-07-01T00:00:00-06:00")
                    .put("profiles", listOf("My profile").joinToString(","))
                    .put("start_date", "2020-07-01T00:00:00-06:00")
                    .build()
            )
    }

    @Test
    fun queryParamsWithoutOptionalFields() {
        val params =
            MdrUsageReportFetchSyncParams.builder()
                .aggregationType(MdrUsageReportFetchSyncParams.AggregationType.NO_AGGREGATION)
                .build()

        val queryParams = params._queryParams()

        assertThat(queryParams)
            .isEqualTo(QueryParams.builder().put("aggregation_type", "NO_AGGREGATION").build())
    }
}
