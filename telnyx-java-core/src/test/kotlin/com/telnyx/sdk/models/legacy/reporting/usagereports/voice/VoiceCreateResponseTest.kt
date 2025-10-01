// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.usagereports.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCreateResponseTest {

    @Test
    fun create() {
        val voiceCreateResponse =
            VoiceCreateResponse.builder()
                .data(
                    VoiceCreateResponse.Data.builder()
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
                )
                .build()

        assertThat(voiceCreateResponse.data())
            .contains(
                VoiceCreateResponse.Data.builder()
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCreateResponse =
            VoiceCreateResponse.builder()
                .data(
                    VoiceCreateResponse.Data.builder()
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
                )
                .build()

        val roundtrippedVoiceCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCreateResponse),
                jacksonTypeRef<VoiceCreateResponse>(),
            )

        assertThat(roundtrippedVoiceCreateResponse).isEqualTo(voiceCreateResponse)
    }
}
