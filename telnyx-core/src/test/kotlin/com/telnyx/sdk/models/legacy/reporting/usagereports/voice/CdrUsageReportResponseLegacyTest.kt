// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CdrUsageReportResponseLegacyTest {

    @Test
    fun create() {
        val cdrUsageReportResponseLegacy =
            CdrUsageReportResponseLegacy.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(0)
                .addConnection(0L)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .productBreakdown(0)
                .recordType("cdr_usage_report")
                .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                .result(JsonValue.from(mapOf<String, Any>()))
                .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .status(0)
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        assertThat(cdrUsageReportResponseLegacy.id())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(cdrUsageReportResponseLegacy.aggregationType()).contains(0)
        assertThat(cdrUsageReportResponseLegacy.connections().getOrNull()).containsExactly(0L)
        assertThat(cdrUsageReportResponseLegacy.createdAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(cdrUsageReportResponseLegacy.endTime())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(cdrUsageReportResponseLegacy.productBreakdown()).contains(0)
        assertThat(cdrUsageReportResponseLegacy.recordType()).contains("cdr_usage_report")
        assertThat(cdrUsageReportResponseLegacy.reportUrl())
            .contains("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
        assertThat(cdrUsageReportResponseLegacy._result())
            .isEqualTo(JsonValue.from(mapOf<String, Any>()))
        assertThat(cdrUsageReportResponseLegacy.startTime())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
        assertThat(cdrUsageReportResponseLegacy.status()).contains(0)
        assertThat(cdrUsageReportResponseLegacy.updatedAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cdrUsageReportResponseLegacy =
            CdrUsageReportResponseLegacy.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .aggregationType(0)
                .addConnection(0L)
                .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .productBreakdown(0)
                .recordType("cdr_usage_report")
                .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                .result(JsonValue.from(mapOf<String, Any>()))
                .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .status(0)
                .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                .build()

        val roundtrippedCdrUsageReportResponseLegacy =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cdrUsageReportResponseLegacy),
                jacksonTypeRef<CdrUsageReportResponseLegacy>(),
            )

        assertThat(roundtrippedCdrUsageReportResponseLegacy).isEqualTo(cdrUsageReportResponseLegacy)
    }
}
