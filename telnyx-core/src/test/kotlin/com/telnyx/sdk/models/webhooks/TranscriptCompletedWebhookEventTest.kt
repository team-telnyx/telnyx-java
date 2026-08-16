// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptCompletedWebhookEventTest {

    @Test
    fun create() {
        val transcriptCompletedWebhookEvent =
            TranscriptCompletedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    TranscriptCompletedWebhookEvent.Data.builder()
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastSeq(0L)
                        .segmentCount(0L)
                        .sessionId("mtgsess_9b2f...")
                        .build()
                )
                .event(TranscriptCompletedWebhookEvent.Event.TRANSCRIPT_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(transcriptCompletedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(transcriptCompletedWebhookEvent.data())
            .isEqualTo(
                TranscriptCompletedWebhookEvent.Data.builder()
                    .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .lastSeq(0L)
                    .segmentCount(0L)
                    .sessionId("mtgsess_9b2f...")
                    .build()
            )
        assertThat(transcriptCompletedWebhookEvent.event())
            .isEqualTo(TranscriptCompletedWebhookEvent.Event.TRANSCRIPT_COMPLETED)
        assertThat(transcriptCompletedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(transcriptCompletedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptCompletedWebhookEvent =
            TranscriptCompletedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    TranscriptCompletedWebhookEvent.Data.builder()
                        .endedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .lastSeq(0L)
                        .segmentCount(0L)
                        .sessionId("mtgsess_9b2f...")
                        .build()
                )
                .event(TranscriptCompletedWebhookEvent.Event.TRANSCRIPT_COMPLETED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedTranscriptCompletedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptCompletedWebhookEvent),
                jacksonTypeRef<TranscriptCompletedWebhookEvent>(),
            )

        assertThat(roundtrippedTranscriptCompletedWebhookEvent)
            .isEqualTo(transcriptCompletedWebhookEvent)
    }
}
