// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingExportedWebhookEventTest {

    @Test
    fun create() {
        val recordingExportedWebhookEvent =
            RecordingExportedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingExportedWebhookEvent.Data.builder()
                        .bucket("bucket")
                        .bytes(1L)
                        .key("key")
                        .region("region")
                        .sessionId("session_id")
                        .sha256("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
                        .build()
                )
                .event(RecordingExportedWebhookEvent.Event.RECORDING_EXPORTED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(recordingExportedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(recordingExportedWebhookEvent.data())
            .isEqualTo(
                RecordingExportedWebhookEvent.Data.builder()
                    .bucket("bucket")
                    .bytes(1L)
                    .key("key")
                    .region("region")
                    .sessionId("session_id")
                    .sha256("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
                    .build()
            )
        assertThat(recordingExportedWebhookEvent.event())
            .isEqualTo(RecordingExportedWebhookEvent.Event.RECORDING_EXPORTED)
        assertThat(recordingExportedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingExportedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingExportedWebhookEvent =
            RecordingExportedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingExportedWebhookEvent.Data.builder()
                        .bucket("bucket")
                        .bytes(1L)
                        .key("key")
                        .region("region")
                        .sessionId("session_id")
                        .sha256("ecc2efdd09bd231a9ad9bd2aada37aa7ccc3d38a03cc25beb6c28aa0aaa316be")
                        .build()
                )
                .event(RecordingExportedWebhookEvent.Event.RECORDING_EXPORTED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedRecordingExportedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingExportedWebhookEvent),
                jacksonTypeRef<RecordingExportedWebhookEvent>(),
            )

        assertThat(roundtrippedRecordingExportedWebhookEvent)
            .isEqualTo(recordingExportedWebhookEvent)
    }
}
