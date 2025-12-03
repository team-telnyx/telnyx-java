// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamingStoppedWebhookEventTest {

    @Test
    fun create() {
        val streamingStoppedWebhookEvent =
            StreamingStoppedWebhookEvent.builder()
                .data(
                    CallStreamingStopped.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallStreamingStopped.EventType.STREAMING_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingStopped.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStopped.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(streamingStoppedWebhookEvent.data())
            .contains(
                CallStreamingStopped.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(CallStreamingStopped.EventType.STREAMING_STOPPED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        CallStreamingStopped.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .streamUrl("wss://www.example.com/websocket")
                            .build()
                    )
                    .recordType(CallStreamingStopped.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamingStoppedWebhookEvent =
            StreamingStoppedWebhookEvent.builder()
                .data(
                    CallStreamingStopped.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallStreamingStopped.EventType.STREAMING_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingStopped.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStopped.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedStreamingStoppedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamingStoppedWebhookEvent),
                jacksonTypeRef<StreamingStoppedWebhookEvent>(),
            )

        assertThat(roundtrippedStreamingStoppedWebhookEvent).isEqualTo(streamingStoppedWebhookEvent)
    }
}
