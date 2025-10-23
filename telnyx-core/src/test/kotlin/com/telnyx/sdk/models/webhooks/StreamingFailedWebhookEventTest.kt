// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class StreamingFailedWebhookEventTest {

    @Test
    fun create() {
        val streamingFailedWebhookEvent =
            StreamingFailedWebhookEvent.builder()
                .data(
                    StreamingFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(StreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            StreamingFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureReason("connection_failed")
                                .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                                .streamParams(
                                    StreamingFailedWebhookEvent.Data.Payload.StreamParams.builder()
                                        .streamUrl("wss://www.example.com/websocket")
                                        .track(
                                            StreamingFailedWebhookEvent.Data.Payload.StreamParams
                                                .Track
                                                .INBOUND_TRACK
                                        )
                                        .build()
                                )
                                .streamType(
                                    StreamingFailedWebhookEvent.Data.Payload.StreamType.WEBSOCKET
                                )
                                .build()
                        )
                        .recordType(StreamingFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(streamingFailedWebhookEvent.data())
            .contains(
                StreamingFailedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(StreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        StreamingFailedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .failureReason("connection_failed")
                            .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                            .streamParams(
                                StreamingFailedWebhookEvent.Data.Payload.StreamParams.builder()
                                    .streamUrl("wss://www.example.com/websocket")
                                    .track(
                                        StreamingFailedWebhookEvent.Data.Payload.StreamParams.Track
                                            .INBOUND_TRACK
                                    )
                                    .build()
                            )
                            .streamType(
                                StreamingFailedWebhookEvent.Data.Payload.StreamType.WEBSOCKET
                            )
                            .build()
                    )
                    .recordType(StreamingFailedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val streamingFailedWebhookEvent =
            StreamingFailedWebhookEvent.builder()
                .data(
                    StreamingFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(StreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            StreamingFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureReason("connection_failed")
                                .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                                .streamParams(
                                    StreamingFailedWebhookEvent.Data.Payload.StreamParams.builder()
                                        .streamUrl("wss://www.example.com/websocket")
                                        .track(
                                            StreamingFailedWebhookEvent.Data.Payload.StreamParams
                                                .Track
                                                .INBOUND_TRACK
                                        )
                                        .build()
                                )
                                .streamType(
                                    StreamingFailedWebhookEvent.Data.Payload.StreamType.WEBSOCKET
                                )
                                .build()
                        )
                        .recordType(StreamingFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedStreamingFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(streamingFailedWebhookEvent),
                jacksonTypeRef<StreamingFailedWebhookEvent>(),
            )

        assertThat(roundtrippedStreamingFailedWebhookEvent).isEqualTo(streamingFailedWebhookEvent)
    }
}
