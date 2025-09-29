// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrUsageReportFetchSyncResponseTest {

    @Test
    fun create() {
        val mdrUsageReportFetchSyncResponse =
            MdrUsageReportFetchSyncResponse.builder()
                .data(
                    MdrUsageReport.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(MdrUsageReport.AggregationType.NO_AGGREGATION)
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .profiles("My profile")
                        .recordType("mdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .addResult(
                            MdrUsageReport.Result.builder()
                                .carrierPassthroughFee("0")
                                .connection("all")
                                .cost("0")
                                .currency("USD")
                                .delivered("0")
                                .direction("outbound")
                                .messageType("SMS")
                                .parts("0")
                                .product("outbound")
                                .profileId("All")
                                .received("0")
                                .sent("0")
                                .tags("All")
                                .tnType("TF")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MdrUsageReport.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        assertThat(mdrUsageReportFetchSyncResponse.data())
            .contains(
                MdrUsageReport.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(MdrUsageReport.AggregationType.NO_AGGREGATION)
                    .addConnection(0L)
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .profiles("My profile")
                    .recordType("mdr_usage_report")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .addResult(
                        MdrUsageReport.Result.builder()
                            .carrierPassthroughFee("0")
                            .connection("all")
                            .cost("0")
                            .currency("USD")
                            .delivered("0")
                            .direction("outbound")
                            .messageType("SMS")
                            .parts("0")
                            .product("outbound")
                            .profileId("All")
                            .received("0")
                            .sent("0")
                            .tags("All")
                            .tnType("TF")
                            .build()
                    )
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .status(MdrUsageReport.Status.PENDING)
                    .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mdrUsageReportFetchSyncResponse =
            MdrUsageReportFetchSyncResponse.builder()
                .data(
                    MdrUsageReport.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(MdrUsageReport.AggregationType.NO_AGGREGATION)
                        .addConnection(0L)
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .profiles("My profile")
                        .recordType("mdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .addResult(
                            MdrUsageReport.Result.builder()
                                .carrierPassthroughFee("0")
                                .connection("all")
                                .cost("0")
                                .currency("USD")
                                .delivered("0")
                                .direction("outbound")
                                .messageType("SMS")
                                .parts("0")
                                .product("outbound")
                                .profileId("All")
                                .received("0")
                                .sent("0")
                                .tags("All")
                                .tnType("TF")
                                .build()
                        )
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(MdrUsageReport.Status.PENDING)
                        .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .build()
                )
                .build()

        val roundtrippedMdrUsageReportFetchSyncResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mdrUsageReportFetchSyncResponse),
                jacksonTypeRef<MdrUsageReportFetchSyncResponse>(),
            )

        assertThat(roundtrippedMdrUsageReportFetchSyncResponse)
            .isEqualTo(mdrUsageReportFetchSyncResponse)
    }
}
