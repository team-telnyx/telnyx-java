// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.wireless.detailrecordsreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DetailRecordsReportRetrieveResponseTest {

    @Test
    fun create() {
        val detailRecordsReportRetrieveResponse =
            DetailRecordsReportRetrieveResponse.builder()
                .data(
                    WdrReport.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .endTime("2018-02-02T22:25:27.521Z")
                        .recordType("detail_records_report")
                        .reportUrl("http://example.com")
                        .startTime("2018-02-02T22:25:27.521Z")
                        .status(WdrReport.Status.PENDING)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(detailRecordsReportRetrieveResponse.data())
            .contains(
                WdrReport.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .endTime("2018-02-02T22:25:27.521Z")
                    .recordType("detail_records_report")
                    .reportUrl("http://example.com")
                    .startTime("2018-02-02T22:25:27.521Z")
                    .status(WdrReport.Status.PENDING)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val detailRecordsReportRetrieveResponse =
            DetailRecordsReportRetrieveResponse.builder()
                .data(
                    WdrReport.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .endTime("2018-02-02T22:25:27.521Z")
                        .recordType("detail_records_report")
                        .reportUrl("http://example.com")
                        .startTime("2018-02-02T22:25:27.521Z")
                        .status(WdrReport.Status.PENDING)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedDetailRecordsReportRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(detailRecordsReportRetrieveResponse),
                jacksonTypeRef<DetailRecordsReportRetrieveResponse>(),
            )

        assertThat(roundtrippedDetailRecordsReportRetrieveResponse)
            .isEqualTo(detailRecordsReportRetrieveResponse)
    }
}
