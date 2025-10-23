// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.wireless.detailrecordsreports

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WdrReportTest {

    @Test
    fun create() {
        val wdrReport =
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

        assertThat(wdrReport.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wdrReport.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wdrReport.endTime()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wdrReport.recordType()).contains("detail_records_report")
        assertThat(wdrReport.reportUrl()).contains("http://example.com")
        assertThat(wdrReport.startTime()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wdrReport.status()).contains(WdrReport.Status.PENDING)
        assertThat(wdrReport.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wdrReport =
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

        val roundtrippedWdrReport =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wdrReport),
                jacksonTypeRef<WdrReport>(),
            )

        assertThat(roundtrippedWdrReport).isEqualTo(wdrReport)
    }
}
