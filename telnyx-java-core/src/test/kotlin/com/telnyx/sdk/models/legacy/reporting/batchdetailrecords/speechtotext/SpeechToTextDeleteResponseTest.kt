// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.legacy.reporting.batchdetailrecords.speechtotext

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SpeechToTextDeleteResponseTest {

    @Test
    fun create() {
        val speechToTextDeleteResponse =
            SpeechToTextDeleteResponse.builder()
                .data(
                    SpeechToTextDeleteResponse.Data.builder()
                        .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .recordType("speech_to_text_report")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(SpeechToTextDeleteResponse.Data.Status.PENDING)
                        .build()
                )
                .build()

        assertThat(speechToTextDeleteResponse.data())
            .contains(
                SpeechToTextDeleteResponse.Data.builder()
                    .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                    .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                    .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .recordType("speech_to_text_report")
                    .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                    .status(SpeechToTextDeleteResponse.Data.Status.PENDING)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val speechToTextDeleteResponse =
            SpeechToTextDeleteResponse.builder()
                .data(
                    SpeechToTextDeleteResponse.Data.builder()
                        .id("ab76c3b6-80cd-11eb-9439-0242ac130002")
                        .createdAt(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .downloadLink("https://portal-cdrs-usage.s3.amazonaws.com")
                        .endDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .recordType("speech_to_text_report")
                        .startDate(OffsetDateTime.parse("2020-07-01T00:00:00-06:00"))
                        .status(SpeechToTextDeleteResponse.Data.Status.PENDING)
                        .build()
                )
                .build()

        val roundtrippedSpeechToTextDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(speechToTextDeleteResponse),
                jacksonTypeRef<SpeechToTextDeleteResponse>(),
            )

        assertThat(roundtrippedSpeechToTextDeleteResponse).isEqualTo(speechToTextDeleteResponse)
    }
}
