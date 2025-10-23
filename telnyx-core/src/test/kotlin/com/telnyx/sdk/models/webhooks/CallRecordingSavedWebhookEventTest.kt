// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRecordingSavedWebhookEventTest {

    @Test
    fun create() {
        val callRecordingSavedWebhookEvent =
            CallRecordingSavedWebhookEvent.builder()
                .data(
                    CallRecordingSavedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallRecordingSavedWebhookEvent.Data.EventType.CALL_RECORDING_SAVED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallRecordingSavedWebhookEvent.Data.Payload.builder()
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .channels(
                                    CallRecordingSavedWebhookEvent.Data.Payload.Channels.SINGLE
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .publicRecordingUrls(
                                    CallRecordingSavedWebhookEvent.Data.Payload.PublicRecordingUrls
                                        .builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .recordingEndedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingStartedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingUrls(
                                    CallRecordingSavedWebhookEvent.Data.Payload.RecordingUrls
                                        .builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .build()
                        )
                        .recordType(CallRecordingSavedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callRecordingSavedWebhookEvent.data())
            .contains(
                CallRecordingSavedWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(CallRecordingSavedWebhookEvent.Data.EventType.CALL_RECORDING_SAVED)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        CallRecordingSavedWebhookEvent.Data.Payload.builder()
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .channels(CallRecordingSavedWebhookEvent.Data.Payload.Channels.SINGLE)
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .publicRecordingUrls(
                                CallRecordingSavedWebhookEvent.Data.Payload.PublicRecordingUrls
                                    .builder()
                                    .mp3("http://example.com/recording.mp3")
                                    .wav("http://example.com/recording.wav")
                                    .build()
                            )
                            .recordingEndedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                            .recordingStartedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                            .recordingUrls(
                                CallRecordingSavedWebhookEvent.Data.Payload.RecordingUrls.builder()
                                    .mp3("http://example.com/recording.mp3")
                                    .wav("http://example.com/recording.wav")
                                    .build()
                            )
                            .build()
                    )
                    .recordType(CallRecordingSavedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRecordingSavedWebhookEvent =
            CallRecordingSavedWebhookEvent.builder()
                .data(
                    CallRecordingSavedWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(
                            CallRecordingSavedWebhookEvent.Data.EventType.CALL_RECORDING_SAVED
                        )
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            CallRecordingSavedWebhookEvent.Data.Payload.builder()
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .channels(
                                    CallRecordingSavedWebhookEvent.Data.Payload.Channels.SINGLE
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .publicRecordingUrls(
                                    CallRecordingSavedWebhookEvent.Data.Payload.PublicRecordingUrls
                                        .builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .recordingEndedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingStartedAt(
                                    OffsetDateTime.parse("2018-02-02T22:20:27.521992Z")
                                )
                                .recordingUrls(
                                    CallRecordingSavedWebhookEvent.Data.Payload.RecordingUrls
                                        .builder()
                                        .mp3("http://example.com/recording.mp3")
                                        .wav("http://example.com/recording.wav")
                                        .build()
                                )
                                .build()
                        )
                        .recordType(CallRecordingSavedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallRecordingSavedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRecordingSavedWebhookEvent),
                jacksonTypeRef<CallRecordingSavedWebhookEvent>(),
            )

        assertThat(roundtrippedCallRecordingSavedWebhookEvent)
            .isEqualTo(callRecordingSavedWebhookEvent)
    }
}
