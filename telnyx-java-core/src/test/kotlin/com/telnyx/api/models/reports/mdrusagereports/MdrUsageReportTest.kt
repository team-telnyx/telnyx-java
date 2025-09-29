// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.reports.mdrusagereports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrUsageReportTest {

    @Test
    fun create() {
        val mdrUsageReport =
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

        assertThat(mdrUsageReport.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(mdrUsageReport.aggregationType())
            .contains(MdrUsageReport.AggregationType.NO_AGGREGATION)
        assertThat(mdrUsageReport.connections().getOrNull()).containsExactly(0L)
        assertThat(mdrUsageReport.createdAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrUsageReport.endDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrUsageReport.profiles()).contains("My profile")
        assertThat(mdrUsageReport.recordType()).contains("mdr_usage_report")
        assertThat(mdrUsageReport.reportUrl())
            .contains("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
        assertThat(mdrUsageReport.result().getOrNull())
            .containsExactly(
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
        assertThat(mdrUsageReport.startDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrUsageReport.status()).contains(MdrUsageReport.Status.PENDING)
        assertThat(mdrUsageReport.updatedAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mdrUsageReport =
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

        val roundtrippedMdrUsageReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mdrUsageReport),
                jacksonTypeRef<MdrUsageReport>(),
            )

        assertThat(roundtrippedMdrUsageReport).isEqualTo(mdrUsageReport)
    }
}
