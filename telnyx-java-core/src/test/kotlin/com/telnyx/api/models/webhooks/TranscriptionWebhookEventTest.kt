// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TranscriptionWebhookEventTest {

    @Test
    fun create() {
        val transcriptionWebhookEvent =
            TranscriptionWebhookEvent.builder()
                .data(
                    TranscriptionWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(TranscriptionWebhookEvent.Data.EventType.CALL_TRANSCRIPTION)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            TranscriptionWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                                )
                                .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                                .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                                .clientState("client_state")
                                .connectionId("1240401930086254526")
                                .transcriptionData(
                                    TranscriptionWebhookEvent.Data.Payload.TranscriptionData
                                        .builder()
                                        .confidence(0.977219)
                                        .isFinal(true)
                                        .transcript("hello this is a test speech")
                                        .transcriptionTrack(
                                            TranscriptionWebhookEvent.Data.Payload.TranscriptionData
                                                .TranscriptionTrack
                                                .INBOUND
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(TranscriptionWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(transcriptionWebhookEvent.data())
            .contains(
                TranscriptionWebhookEvent.Data.builder()
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .eventType(TranscriptionWebhookEvent.Data.EventType.CALL_TRANSCRIPTION)
                    .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                    .payload(
                        TranscriptionWebhookEvent.Data.Payload.builder()
                            .callControlId(
                                "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                            )
                            .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                            .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                            .clientState("client_state")
                            .connectionId("1240401930086254526")
                            .transcriptionData(
                                TranscriptionWebhookEvent.Data.Payload.TranscriptionData.builder()
                                    .confidence(0.977219)
                                    .isFinal(true)
                                    .transcript("hello this is a test speech")
                                    .transcriptionTrack(
                                        TranscriptionWebhookEvent.Data.Payload.TranscriptionData
                                            .TranscriptionTrack
                                            .INBOUND
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .recordType(TranscriptionWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val transcriptionWebhookEvent =
            TranscriptionWebhookEvent.builder()
                .data(
                    TranscriptionWebhookEvent.Data.builder()
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .eventType(TranscriptionWebhookEvent.Data.EventType.CALL_TRANSCRIPTION)
                        .occurredAt(OffsetDateTime.parse("2018-02-02T22:25:27.521992Z"))
                        .payload(
                            TranscriptionWebhookEvent.Data.Payload.builder()
                                .callControlId(
                                    "v2:7subYr8fLrXmaAXm8egeAMpoSJ72J3SGPUuome81-hQuaKRf9b7hKA"
                                )
                                .callLegId("5ca81340-5beb-11eb-ae45-02420a0f8b69")
                                .callSessionId("5ca81eee-5beb-11eb-ba6c-02420a0f8b69")
                                .clientState("client_state")
                                .connectionId("1240401930086254526")
                                .transcriptionData(
                                    TranscriptionWebhookEvent.Data.Payload.TranscriptionData
                                        .builder()
                                        .confidence(0.977219)
                                        .isFinal(true)
                                        .transcript("hello this is a test speech")
                                        .transcriptionTrack(
                                            TranscriptionWebhookEvent.Data.Payload.TranscriptionData
                                                .TranscriptionTrack
                                                .INBOUND
                                        )
                                        .build()
                                )
                                .build()
                        )
                        .recordType(TranscriptionWebhookEvent.Data.RecordType.EVENT)
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
