// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamingStoppedWebhookEventTest {

    @Test
    fun create() {
        val streamingStoppedWebhookEvent =
            StreamingStoppedWebhookEvent.builder()
                .data(
                    StreamingStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(StreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            StreamingStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(StreamingStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(streamingStoppedWebhookEvent.data())
            .contains(
                StreamingStoppedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(StreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        StreamingStoppedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .streamUrl("wss://www.example.com/websocket")
                            .build()
                    )
                    .recordType(StreamingStoppedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamingStoppedWebhookEvent =
            StreamingStoppedWebhookEvent.builder()
                .data(
                    StreamingStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(StreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            StreamingStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(StreamingStoppedWebhookEvent.Data.RecordType.EVENT)
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
