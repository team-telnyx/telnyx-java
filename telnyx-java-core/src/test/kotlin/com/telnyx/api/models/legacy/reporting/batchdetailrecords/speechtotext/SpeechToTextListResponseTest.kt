// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.legacy.reporting.batchdetailrecords.speechtotext

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextListResponseTest {

    @Test
    fun create() {
        val speechToTextListResponse =
            SpeechToTextListResponse.builder()
                .addData(
                    SpeechToTextListResponse.Data.builder()
                        .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .recordType("speech_to_text_report")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(SpeechToTextListResponse.Data.Status.PENDING)
                        .build()
                )
                .build()

        assertThat(speechToTextListResponse.data().getOrNull())
            .containsExactly(
                SpeechToTextListResponse.Data.builder()
                    .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .recordType("speech_to_text_report")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .status(SpeechToTextListResponse.Data.Status.PENDING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speechToTextListResponse =
            SpeechToTextListResponse.builder()
                .addData(
                    SpeechToTextListResponse.Data.builder()
                        .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .recordType("speech_to_text_report")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(SpeechToTextListResponse.Data.Status.PENDING)
                        .build()
                )
                .build()

        val roundtrippedSpeechToTextListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speechToTextListResponse),
                jacksonTypeRef<SpeechToTextListResponse>(),
            )

        assertThat(roundtrippedSpeechToTextListResponse).isEqualTo(speechToTextListResponse)
    }
}
