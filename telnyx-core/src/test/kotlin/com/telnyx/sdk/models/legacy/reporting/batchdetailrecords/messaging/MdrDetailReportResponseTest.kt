// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.messaging

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.Filter
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MdrDetailReportResponseTest {

    @Test
    fun create() {
        val mdrDetailReportResponse =
            MdrDetailReportResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addConnection(0L)
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .addDirection(MdrDetailReportResponse.Direction.INBOUND)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .addFilter(
                    Filter.builder()
                        .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                        .cld("+13129457420")
                        .cldFilter(Filter.CldFilter.CONTAINS)
                        .cli("+13129457420")
                        .cliFilter(Filter.CliFilter.CONTAINS)
                        .filterType(Filter.FilterType.AND)
                        .tagsList("tag1")
                        .build()
                )
                .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                .recordType("mdr_report")
                .addRecordType(MdrDetailReportResponse.RecordType.INCOMPLETE)
                .reportName("report_name_8hvb45Gu")
                .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .status(MdrDetailReportResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        assertThat(mdrDetailReportResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(mdrDetailReportResponse.connections().getOrNull()).containsExactly(0L)
        assertThat(mdrDetailReportResponse.createdAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrDetailReportResponse.directions().getOrNull())
            .containsExactly(MdrDetailReportResponse.Direction.INBOUND)
        assertThat(mdrDetailReportResponse.endDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrDetailReportResponse.filters().getOrNull())
            .containsExactly(
                Filter.builder()
                    .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                    .cld("+13129457420")
                    .cldFilter(Filter.CldFilter.CONTAINS)
                    .cli("+13129457420")
                    .cliFilter(Filter.CliFilter.CONTAINS)
                    .filterType(Filter.FilterType.AND)
                    .tagsList("tag1")
                    .build()
            )
        assertThat(mdrDetailReportResponse.profiles().getOrNull())
            .containsExactly(
                "3fa85f64-5717-4562-b3fc-2c963f66afa6",
                "7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f",
            )
        assertThat(mdrDetailReportResponse.recordType()).contains("mdr_report")
        assertThat(mdrDetailReportResponse.recordTypes().getOrNull())
            .containsExactly(MdrDetailReportResponse.RecordType.INCOMPLETE)
        assertThat(mdrDetailReportResponse.reportName()).contains("report_name_8hvb45Gu")
        assertThat(mdrDetailReportResponse.reportUrl())
            .contains("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
        assertThat(mdrDetailReportResponse.startDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(mdrDetailReportResponse.status())
            .contains(MdrDetailReportResponse.Status.PENDING)
        assertThat(mdrDetailReportResponse.updatedAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val mdrDetailReportResponse =
            MdrDetailReportResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addConnection(0L)
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .addDirection(MdrDetailReportResponse.Direction.INBOUND)
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .addFilter(
                    Filter.builder()
                        .billingGroup("adfaa016-f921-4b6c-97bb-e4c1dad231c5")
                        .cld("+13129457420")
                        .cldFilter(Filter.CldFilter.CONTAINS)
                        .cli("+13129457420")
                        .cliFilter(Filter.CliFilter.CONTAINS)
                        .filterType(Filter.FilterType.AND)
                        .tagsList("tag1")
                        .build()
                )
                .addProfile("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                .addProfile("7d4e3f8a-9b2c-4e1d-8f5a-1a2b3c4d5e6f")
                .recordType("mdr_report")
                .addRecordType(MdrDetailReportResponse.RecordType.INCOMPLETE)
                .reportName("report_name_8hvb45Gu")
                .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .status(MdrDetailReportResponse.Status.PENDING)
                .updatedAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .build()

        val roundtrippedMdrDetailReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(mdrDetailReportResponse),
                jacksonTypeRef<MdrDetailReportResponse>(),
            )

        assertThat(roundtrippedMdrDetailReportResponse).isEqualTo(mdrDetailReportResponse)
    }
}
