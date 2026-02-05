// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionWebhookEventTest {

    @Test
    fun create() {
        val transcriptionWebhookEvent =
            TranscriptionWebhookEvent.builder()
                .data(
                    Transcription.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(Transcription.EventType.CALL_TRANSCRIPTION)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            Transcription.Payload.builder()
                                .callControlId(
                                    "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                                )
                                .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                                .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("1240401930086254526")
                                .transcriptionData(
                                    Transcription.Payload.TranscriptionData.builder()
                                        .confidence(0.977219)
                                        .isFinal(true)
                                        .transcript("hello this is a test speech")
                                        .transcriptionTrack(
                                            Transcription.Payload.TranscriptionData
                                                .TranscriptionTrack
                                                .INBOUND
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(Transcription.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(transcriptionWebhookEvent.data())
            .contains(
                Transcription.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(Transcription.EventType.CALL_TRANSCRIPTION)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        Transcription.Payload.builder()
                            .callControlId(
                                "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                            )
                            .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                            .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("1240401930086254526")
                            .transcriptionData(
                                Transcription.Payload.TranscriptionData.builder()
                                    .confidence(0.977219)
                                    .isFinal(true)
                                    .transcript("hello this is a test speech")
                                    .transcriptionTrack(
                                        Transcription.Payload.TranscriptionData.TranscriptionTrack
                                            .INBOUND
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .recordType(Transcription.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionWebhookEvent =
            TranscriptionWebhookEvent.builder()
                .data(
                    Transcription.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(Transcription.EventType.CALL_TRANSCRIPTION)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            Transcription.Payload.builder()
                                .callControlId(
                                    "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                                )
                                .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                                .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("1240401930086254526")
                                .transcriptionData(
                                    Transcription.Payload.TranscriptionData.builder()
                                        .confidence(0.977219)
                                        .isFinal(true)
                                        .transcript("hello this is a test speech")
                                        .transcriptionTrack(
                                            Transcription.Payload.TranscriptionData
                                                .TranscriptionTrack
                                                .INBOUND
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(Transcription.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedTranscriptionWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(transcriptionWebhookEvent),
                jacksonTypeRef<TranscriptionWebhookEvent>(),
            )

        assertThat(roundtrippedTranscriptionWebhookEvent).isEqualTo(transcriptionWebhookEvent)
    }
}
