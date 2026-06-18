// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRecordingSavedTest {

    @Test
    fun create() {
        val callRecordingSaved =
            CallRecordingSaved.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallRecordingSaved.EventType.CALL_RECORDING_SAVED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallRecordingSaved.Payload.builder()
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .channels(CallRecordingSaved.Payload.Channels.SINGLE)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .publicRecordingUrls(
                            CallRecordingSaved.Payload.PublicRecordingUrls.builder()
                                .mp3("http://example.com/recording.mp3")
                                .wav("http://example.com/recording.wav")
                                .build()
                        )
                        .recordingEndedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                        .recordingStartedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                        .recordingUrls(
                            CallRecordingSaved.Payload.RecordingUrls.builder()
                                .mp3("http://example.com/recording.mp3")
                                .wav("http://example.com/recording.wav")
                                .build()
                        )
                        .build()
                )
                .recordType(CallRecordingSaved.RecordType.EVENT)
                .build()

        assertThat(callRecordingSaved.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(callRecordingSaved.eventType())
            .contains(CallRecordingSaved.EventType.CALL_RECORDING_SAVED)
        assertThat(callRecordingSaved.occurredAt())
            .contains(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
        assertThat(callRecordingSaved.payload())
            .contains(
                CallRecordingSaved.Payload.builder()
                    .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                    .channels(CallRecordingSaved.Payload.Channels.SINGLE)
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .publicRecordingUrls(
                        CallRecordingSaved.Payload.PublicRecordingUrls.builder()
                            .mp3("http://example.com/recording.mp3")
                            .wav("http://example.com/recording.wav")
                            .build()
                    )
                    .recordingEndedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                    .recordingStartedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                    .recordingUrls(
                        CallRecordingSaved.Payload.RecordingUrls.builder()
                            .mp3("http://example.com/recording.mp3")
                            .wav("http://example.com/recording.wav")
                            .build()
                    )
                    .build()
            )
        assertThat(callRecordingSaved.recordType()).contains(CallRecordingSaved.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRecordingSaved =
            CallRecordingSaved.builder()
                .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                .eventType(CallRecordingSaved.EventType.CALL_RECORDING_SAVED)
                .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                .payload(
                    CallRecordingSaved.Payload.builder()
                        .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                        .channels(CallRecordingSaved.Payload.Channels.SINGLE)
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .publicRecordingUrls(
                            CallRecordingSaved.Payload.PublicRecordingUrls.builder()
                                .mp3("http://example.com/recording.mp3")
                                .wav("http://example.com/recording.wav")
                                .build()
                        )
                        .recordingEndedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                        .recordingStartedAt(OffsetDateTime.parse("2018-02-02T22:20:27.521992Z"))
                        .recordingUrls(
                            CallRecordingSaved.Payload.RecordingUrls.builder()
                                .mp3("http://example.com/recording.mp3")
                                .wav("http://example.com/recording.wav")
                                .build()
                        )
                        .build()
                )
                .recordType(CallRecordingSaved.RecordType.EVENT)
                .build()

        val roundtrippedCallRecordingSaved =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRecordingSaved),
                jacksonTypeRef<CallRecordingSaved>(),
            )

        assertThat(roundtrippedCallRecordingSaved).isEqualTo(callRecordingSaved)
    }
}
