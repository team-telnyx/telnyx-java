// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.cdrusagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.JsonValue
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CdrUsageReportFetchSyncResponseTest {

    @Test
    fun create() {
        val cdrUsageReportFetchSyncResponse =
            CdrUsageReportFetchSyncResponse.builder()
                .data(
                    CdrUsageReportFetchSyncResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(
                            CdrUsageReportFetchSyncResponse.Data.AggregationType.NO_AGGREGATION
                        )
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .productBreakdown(
                            CdrUsageReportFetchSyncResponse.Data.ProductBreakdown.NO_BREAKDOWN
                        )
                        .recordType("cdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            CdrUsageReportFetchSyncResponse.Data.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(CdrUsageReportFetchSyncResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        assertThat(cdrUsageReportFetchSyncResponse.data())
            .contains(
                CdrUsageReportFetchSyncResponse.Data.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(
                        CdrUsageReportFetchSyncResponse.Data.AggregationType.NO_AGGREGATION
                    )
                    .addConnection(0L)
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .productBreakdown(
                        CdrUsageReportFetchSyncResponse.Data.ProductBreakdown.NO_BREAKDOWN
                    )
                    .recordType("cdr_usage_report")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .result(
                        CdrUsageReportFetchSyncResponse.Data.Result.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .status(CdrUsageReportFetchSyncResponse.Data.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cdrUsageReportFetchSyncResponse =
            CdrUsageReportFetchSyncResponse.builder()
                .data(
                    CdrUsageReportFetchSyncResponse.Data.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(
                            CdrUsageReportFetchSyncResponse.Data.AggregationType.NO_AGGREGATION
                        )
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .productBreakdown(
                            CdrUsageReportFetchSyncResponse.Data.ProductBreakdown.NO_BREAKDOWN
                        )
                        .recordType("cdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            CdrUsageReportFetchSyncResponse.Data.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(CdrUsageReportFetchSyncResponse.Data.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .build()

        val roundtrippedCdrUsageReportFetchSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cdrUsageReportFetchSyncResponse),
                jacksonTypeRef<CdrUsageReportFetchSyncResponse>(),
            )

        assertThat(roundtrippedCdrUsageReportFetchSyncResponse)
            .isEqualTo(cdrUsageReportFetchSyncResponse)
    }
}
