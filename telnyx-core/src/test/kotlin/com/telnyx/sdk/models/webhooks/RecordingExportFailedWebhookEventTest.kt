// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RecordingExportFailedWebhookEventTest {

    @Test
    fun create() {
        val recordingExportFailedWebhookEvent =
            RecordingExportFailedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingExportFailedWebhookEvent.Data.builder()
                        .bucket("bucket")
                        .key("key")
                        .reason(RecordingExportFailedWebhookEvent.Data.Reason.INVALID_TARGET)
                        .region("region")
                        .sessionId("session_id")
                        .build()
                )
                .event(RecordingExportFailedWebhookEvent.Event.RECORDING_EXPORT_FAILED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        assertThat(recordingExportFailedWebhookEvent.id()).isEqualTo("whdel_9f2c...")
        assertThat(recordingExportFailedWebhookEvent.data())
            .isEqualTo(
                RecordingExportFailedWebhookEvent.Data.builder()
                    .bucket("bucket")
                    .key("key")
                    .reason(RecordingExportFailedWebhookEvent.Data.Reason.INVALID_TARGET)
                    .region("region")
                    .sessionId("session_id")
                    .build()
            )
        assertThat(recordingExportFailedWebhookEvent.event())
            .isEqualTo(RecordingExportFailedWebhookEvent.Event.RECORDING_EXPORT_FAILED)
        assertThat(recordingExportFailedWebhookEvent.occurredAt())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(recordingExportFailedWebhookEvent.version()).isEqualTo("1")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val recordingExportFailedWebhookEvent =
            RecordingExportFailedWebhookEvent.builder()
                .id("whdel_9f2c...")
                .data(
                    RecordingExportFailedWebhookEvent.Data.builder()
                        .bucket("bucket")
                        .key("key")
                        .reason(RecordingExportFailedWebhookEvent.Data.Reason.INVALID_TARGET)
                        .region("region")
                        .sessionId("session_id")
                        .build()
                )
                .event(RecordingExportFailedWebhookEvent.Event.RECORDING_EXPORT_FAILED)
                .occurredAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version("1")
                .build()

        val roundtrippedRecordingExportFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(recordingExportFailedWebhookEvent),
                jacksonTypeRef<RecordingExportFailedWebhookEvent>(),
            )

        assertThat(roundtrippedRecordingExportFailedWebhookEvent)
            .isEqualTo(recordingExportFailedWebhookEvent)
    }
}
