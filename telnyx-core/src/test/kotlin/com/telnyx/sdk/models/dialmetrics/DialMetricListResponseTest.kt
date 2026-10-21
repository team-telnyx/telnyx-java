// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialMetricListResponseTest {

    @Test
    fun create() {
        val dialMetricListResponse =
            DialMetricListResponse.builder()
                .averageDps(23.7778)
                .dials(
                    DialMetricListResponse.Dials.builder()
                        .accepted(85240L)
                        .rejected(
                            DialMetricListResponse.Dials.Rejected.builder()
                                .dailyLimit(0L)
                                .dpsLimit(360L)
                                .hourlyLimit(0L)
                                .build()
                        )
                        .total(85600L)
                        .build()
                )
                .dpsLimit(100L)
                .endTime(OffsetDateTime.parse("2026-09-29T13:00:00.000Z"))
                .peakDps(104.0)
                .recordType(DialMetricListResponse.RecordType.DIAL_METRIC)
                .region("us")
                .startTime(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
                .build()

        assertThat(dialMetricListResponse.averageDps()).contains(23.7778)
        assertThat(dialMetricListResponse.dials())
            .contains(
                DialMetricListResponse.Dials.builder()
                    .accepted(85240L)
                    .rejected(
                        DialMetricListResponse.Dials.Rejected.builder()
                            .dailyLimit(0L)
                            .dpsLimit(360L)
                            .hourlyLimit(0L)
                            .build()
                    )
                    .total(85600L)
                    .build()
            )
        assertThat(dialMetricListResponse.dpsLimit()).contains(100L)
        assertThat(dialMetricListResponse.endTime())
            .contains(OffsetDateTime.parse("2026-09-29T13:00:00.000Z"))
        assertThat(dialMetricListResponse.peakDps()).contains(104.0)
        assertThat(dialMetricListResponse.recordType())
            .contains(DialMetricListResponse.RecordType.DIAL_METRIC)
        assertThat(dialMetricListResponse.region()).contains("us")
        assertThat(dialMetricListResponse.startTime())
            .contains(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dialMetricListResponse =
            DialMetricListResponse.builder()
                .averageDps(23.7778)
                .dials(
                    DialMetricListResponse.Dials.builder()
                        .accepted(85240L)
                        .rejected(
                            DialMetricListResponse.Dials.Rejected.builder()
                                .dailyLimit(0L)
                                .dpsLimit(360L)
                                .hourlyLimit(0L)
                                .build()
                        )
                        .total(85600L)
                        .build()
                )
                .dpsLimit(100L)
                .endTime(OffsetDateTime.parse("2026-09-29T13:00:00.000Z"))
                .peakDps(104.0)
                .recordType(DialMetricListResponse.RecordType.DIAL_METRIC)
                .region("us")
                .startTime(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
                .build()

        val roundtrippedDialMetricListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialMetricListResponse),
                jacksonTypeRef<DialMetricListResponse>(),
            )

        assertThat(roundtrippedDialMetricListResponse).isEqualTo(dialMetricListResponse)
    }
}
