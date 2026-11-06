// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dialmetrics

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DialMetricListPageResponseTest {

    @Test
    fun create() {
        val dialMetricListPageResponse =
            DialMetricListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    DialMetricListPageResponse.Meta.builder()
                        .cursors(
                            DialMetricListPageResponse.Meta.Cursors.builder()
                                .after("MTc5MDY4NjgwMDpldQ")
                                .before("MTc5MDY4MzIwMDp1cw")
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2026-09-29T14:00:00.000Z"))
                        .granularity(DialMetricListPageResponse.Meta.Granularity.HOUR)
                        .next(
                            "/v2/dial_metrics?end_time=2026-09-29T14%3A00%3A00.000Z&granularity=hour&page%5Bafter%5D=MTc5MDY4NjgwMDpldQ&page%5Blimit%5D=2&sort=-start_time&start_time=2026-09-29T12%3A00%3A00.000Z"
                        )
                        .sort(DialMetricListPageResponse.Meta.Sort.MINUS_START_TIME)
                        .startTime(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
                        .build()
                )
                .build()

        assertThat(dialMetricListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(dialMetricListPageResponse.meta())
            .contains(
                DialMetricListPageResponse.Meta.builder()
                    .cursors(
                        DialMetricListPageResponse.Meta.Cursors.builder()
                            .after("MTc5MDY4NjgwMDpldQ")
                            .before("MTc5MDY4MzIwMDp1cw")
                            .build()
                    )
                    .endTime(OffsetDateTime.parse("2026-09-29T14:00:00.000Z"))
                    .granularity(DialMetricListPageResponse.Meta.Granularity.HOUR)
                    .next(
                        "/v2/dial_metrics?end_time=2026-09-29T14%3A00%3A00.000Z&granularity=hour&page%5Bafter%5D=MTc5MDY4NjgwMDpldQ&page%5Blimit%5D=2&sort=-start_time&start_time=2026-09-29T12%3A00%3A00.000Z"
                    )
                    .sort(DialMetricListPageResponse.Meta.Sort.MINUS_START_TIME)
                    .startTime(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dialMetricListPageResponse =
            DialMetricListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    DialMetricListPageResponse.Meta.builder()
                        .cursors(
                            DialMetricListPageResponse.Meta.Cursors.builder()
                                .after("MTc5MDY4NjgwMDpldQ")
                                .before("MTc5MDY4MzIwMDp1cw")
                                .build()
                        )
                        .endTime(OffsetDateTime.parse("2026-09-29T14:00:00.000Z"))
                        .granularity(DialMetricListPageResponse.Meta.Granularity.HOUR)
                        .next(
                            "/v2/dial_metrics?end_time=2026-09-29T14%3A00%3A00.000Z&granularity=hour&page%5Bafter%5D=MTc5MDY4NjgwMDpldQ&page%5Blimit%5D=2&sort=-start_time&start_time=2026-09-29T12%3A00%3A00.000Z"
                        )
                        .sort(DialMetricListPageResponse.Meta.Sort.MINUS_START_TIME)
                        .startTime(OffsetDateTime.parse("2026-09-29T12:00:00.000Z"))
                        .build()
                )
                .build()

        val roundtrippedDialMetricListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dialMetricListPageResponse),
                jacksonTypeRef<DialMetricListPageResponse>(),
            )

        assertThat(roundtrippedDialMetricListPageResponse).isEqualTo(dialMetricListPageResponse)
    }
}
