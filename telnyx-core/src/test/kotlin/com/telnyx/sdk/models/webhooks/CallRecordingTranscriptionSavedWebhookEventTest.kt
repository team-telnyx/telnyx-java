// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallRecordingTranscriptionSavedWebhookEventTest {

    @Test
    fun create() {
        val callRecordingTranscriptionSavedWebhookEvent =
            CallRecordingTranscriptionSavedWebhookEvent.builder()
                .data(
                    CallRecordingTranscriptionSavedWebhookEvent.Data.builder()
                        .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                        .eventType(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.EventType
                                .CALL_RECORDING_TRANSCRIPTION_SAVED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                        .payload(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callingPartyType(
                                    CallRecordingTranscriptionSavedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .PSTN
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .recordingId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .recordingTranscriptionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .status(
                                    CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.Status
                                        .COMPLETED
                                )
                                .transcriptionText("Hi!")
                                .build()
                        )
                        .recordType(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        assertThat(callRecordingTranscriptionSavedWebhookEvent.data())
            .contains(
                CallRecordingTranscriptionSavedWebhookEvent.Data.builder()
                    .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                    .eventType(
                        CallRecordingTranscriptionSavedWebhookEvent.Data.EventType
                            .CALL_RECORDING_TRANSCRIPTION_SAVED
                    )
                    .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                    .payload(
                        CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                            )
                            .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .callingPartyType(
                                CallRecordingTranscriptionSavedWebhookEvent.Data.Payload
                                    .CallingPartyType
                                    .PSTN
                            )
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .recordingId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .recordingTranscriptionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                            .status(
                                CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.Status
                                    .COMPLETED
                            )
                            .transcriptionText("Hi!")
                            .build()
                    )
                    .recordType(CallRecordingTranscriptionSavedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callRecordingTranscriptionSavedWebhookEvent =
            CallRecordingTranscriptionSavedWebhookEvent.builder()
                .data(
                    CallRecordingTranscriptionSavedWebhookEvent.Data.builder()
                        .id("898e96ef-be63-45aa-9e7d-01332bff9a97")
                        .eventType(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.EventType
                                .CALL_RECORDING_TRANSCRIPTION_SAVED
                        )
                        .occurredAt(OffsetDateTime.parse("2025-02-19T17:02:49.371454Z"))
                        .payload(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v3:MdI91X4lWFEs7IgbBEOT9M4AigoY08M0WWZFISt1Yw2axZ_IiE4pqg"
                                )
                                .callLegId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callSessionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .callingPartyType(
                                    CallRecordingTranscriptionSavedWebhookEvent.Data.Payload
                                        .CallingPartyType
                                        .PSTN
                                )
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .recordingId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .recordingTranscriptionId("428c31b6-7af4-4bcb-b7f5-5013ef9657c1")
                                .status(
                                    CallRecordingTranscriptionSavedWebhookEvent.Data.Payload.Status
                                        .COMPLETED
                                )
                                .transcriptionText("Hi!")
                                .build()
                        )
                        .recordType(
                            CallRecordingTranscriptionSavedWebhookEvent.Data.RecordType.EVENT
                        )
                        .build()
                )
                .build()

        val roundtrippedCallRecordingTranscriptionSavedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callRecordingTranscriptionSavedWebhookEvent),
                jacksonTypeRef<CallRecordingTranscriptionSavedWebhookEvent>(),
            )

        assertThat(roundtrippedCallRecordingTranscriptionSavedWebhookEvent)
            .isEqualTo(callRecordingTranscriptionSavedWebhookEvent)
    }
}
