// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SttDetailReportResponseTest {

    @Test
    fun create() {
        val sttDetailReportResponse =
            SttDetailReportResponse.builder()
                .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .recordType("speech_to_text_report")
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .status(SttDetailReportResponse.Status.PENDING)
                .build()

        assertThat(sttDetailReportResponse.id()).contains("ab76c3b6-80cd-11eb-9439-0242ac130002")
        assertThat(sttDetailReportResponse.createdAt())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(sttDetailReportResponse.downloadLink())
            .contains("https://portal-cdrs-usage.s3.amazonaws.com")
        assertThat(sttDetailReportResponse.endDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(sttDetailReportResponse.recordType()).contains("speech_to_text_report")
        assertThat(sttDetailReportResponse.startDate())
            .contains(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
        assertThat(sttDetailReportResponse.status())
            .contains(SttDetailReportResponse.Status.PENDING)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val sttDetailReportResponse =
            SttDetailReportResponse.builder()
                .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .recordType("speech_to_text_report")
                .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                .status(SttDetailReportResponse.Status.PENDING)
                .build()

        val roundtrippedSttDetailReportResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(sttDetailReportResponse),
                jacksonTypeRef<SttDetailReportResponse>(),
            )

        assertThat(roundtrippedSttDetailReportResponse).isEqualTo(sttDetailReportResponse)
    }
}
