// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.legacy.reporting.usagereports.messaging.StandardPaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceListPageResponseTest {

    @Test
    fun create() {
        val voiceListPageResponse =
            VoiceListPageResponse.builder()
                .addData(
                    CdrUsageReportResponseLegacy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection("1234567890")
                        .addConnection("9876543210")
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .productBreakdown(0)
                        .recordType("cdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            CdrUsageReportResponseLegacy.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .totalPages(3)
                        .pageSize(25)
                        .totalResults(55)
                        .build()
                )
                .build()

        assertThat(voiceListPageResponse.data().getOrNull())
            .containsExactly(
                CdrUsageReportResponseLegacy.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .aggregationType(0)
                    .addConnection("1234567890")
                    .addConnection("9876543210")
                    .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .productBreakdown(0)
                    .recordType("cdr_usage_report")
                    .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                    .result(
                        CdrUsageReportResponseLegacy.Result.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .status(0)
                    .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                    .build()
            )
        assertThat(voiceListPageResponse.meta())
            .contains(
                StandardPaginationMeta.builder()
                    .pageNumber(2)
                    .totalPages(3)
                    .pageSize(25)
                    .totalResults(55)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceListPageResponse =
            VoiceListPageResponse.builder()
                .addData(
                    CdrUsageReportResponseLegacy.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .aggregationType(0)
                        .addConnection("1234567890")
                        .addConnection("9876543210")
                        .createdAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .endTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .productBreakdown(0)
                        .recordType("cdr_usage_report")
                        .reportUrl("http://portal.telnyx.com/downloads/report_name_8hvb45Gu.csv")
                        .result(
                            CdrUsageReportResponseLegacy.Result.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .startTime(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .status(0)
                        .updatedAt(OffsetDateTime.parse("2018-02-02T22:25:27.521Z"))
                        .build()
                )
                .meta(
                    StandardPaginationMeta.builder()
                        .pageNumber(2)
                        .totalPages(3)
                        .pageSize(25)
                        .totalResults(55)
                        .build()
                )
                .build()

        val roundtrippedVoiceListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceListPageResponse),
                jacksonTypeRef<VoiceListPageResponse>(),
            )

        assertThat(roundtrippedVoiceListPageResponse).isEqualTo(voiceListPageResponse)
    }
}
