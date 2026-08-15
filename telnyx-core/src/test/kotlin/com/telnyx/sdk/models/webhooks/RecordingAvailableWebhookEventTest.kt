// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingAvailableWebhookEventTest {

    @Test
    fun create() {
        val recordingAvailableWebhookEvent =
            RecordingAvailableWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingAvailableWebhookEvent.Data.builder()
                        .addRecordingType("video_mixed")
                        .sessionId("mtgsess_9b2f...")
                        .build()
                )
                .event(RecordingAvailableWebhookEvent.Event.RECORDING_AVAILABLE)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(recordingAvailableWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(recordingAvailableWebhookEvent.data())
            .isEqualTo(
                RecordingAvailableWebhookEvent.Data.builder()
                    .addRecordingType("video_mixed")
                    .sessionId("mtgsess_9b2f...")
                    .build()
            )
        assertThat(recordingAvailableWebhookEvent.event())
            .isEqualTo(RecordingAvailableWebhookEvent.Event.RECORDING_AVAILABLE)
        assertThat(recordingAvailableWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingAvailableWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingAvailableWebhookEvent =
            RecordingAvailableWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingAvailableWebhookEvent.Data.builder()
                        .addRecordingType("video_mixed")
                        .sessionId("mtgsess_9b2f...")
                        .build()
                )
                .event(RecordingAvailableWebhookEvent.Event.RECORDING_AVAILABLE)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedRecordingAvailableWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingAvailableWebhookEvent),
                jacksonTypeRef<RecordingAvailableWebhookEvent>(),
            )

        assertThat(roundtrippedRecordingAvailableWebhookEvent)
            .isEqualTo(recordingAvailableWebhookEvent)
    }
}
