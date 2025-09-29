// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrUsageReportCreateParamsTest {

    @Test
    fun create() {
        MdrUsageReportCreateParams.builder()
            .aggregationType(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
            .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
            .profiles("My profile")
            .build()
    }

    @Test
    fun body() {
        val params =
            MdrUsageReportCreateParams.builder()
                .aggregationType(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .profiles("My profile")
                .build()

        val body = params._body()

        assertThat(body.aggregationType())
            .isEqualTo(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(body.profiles()).contains("My profile")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            MdrUsageReportCreateParams.builder()
                .aggregationType(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        val body = params._body()

        assertThat(body.aggregationType())
            .isEqualTo(MdrUsageReportCreateParams.AggregationType.NO_AGGREGATION)
        assertThat(body.endDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(body.startDate()).isEqualTo(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
    }
}
