// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamingFailedWebhookEventTest {

    @Test
    fun create() {
        val callStreamingFailedWebhookEvent =
            CallStreamingFailedWebhookEvent.builder()
                .data(
                    CallStreamingFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallStreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureReason("connection_failed")
                                .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                                .streamParams(
                                    CallStreamingFailedWebhookEvent.Data.Payload.StreamParams
                                        .builder()
                                        .streamUrl("wss://www.example.com/websocket")
                                        .track(
                                            CallStreamingFailedWebhookEvent.Data.Payload
                                                .StreamParams
                                                .Track
                                                .INBOUND_TRACK
                                        )
                                        .build()
                                )
                                .streamType(
                                    CallStreamingFailedWebhookEvent.Data.Payload.StreamType
                                        .WEBSOCKET
                                )
                                .build()
                        )
                        .recordType(CallStreamingFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callStreamingFailedWebhookEvent.data())
            .contains(
                CallStreamingFailedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(CallStreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        CallStreamingFailedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .failureReason("connection_failed")
                            .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                            .streamParams(
                                CallStreamingFailedWebhookEvent.Data.Payload.StreamParams.builder()
                                    .streamUrl("wss://www.example.com/websocket")
                                    .track(
                                        CallStreamingFailedWebhookEvent.Data.Payload.StreamParams
                                            .Track
                                            .INBOUND_TRACK
                                    )
                                    .build()
                            )
                            .streamType(
                                CallStreamingFailedWebhookEvent.Data.Payload.StreamType.WEBSOCKET
                            )
                            .build()
                    )
                    .recordType(CallStreamingFailedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamingFailedWebhookEvent =
            CallStreamingFailedWebhookEvent.builder()
                .data(
                    CallStreamingFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallStreamingFailedWebhookEvent.Data.EventType.STREAMING_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureReason("connection_failed")
                                .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                                .streamParams(
                                    CallStreamingFailedWebhookEvent.Data.Payload.StreamParams
                                        .builder()
                                        .streamUrl("wss://www.example.com/websocket")
                                        .track(
                                            CallStreamingFailedWebhookEvent.Data.Payload
                                                .StreamParams
                                                .Track
                                                .INBOUND_TRACK
                                        )
                                        .build()
                                )
                                .streamType(
                                    CallStreamingFailedWebhookEvent.Data.Payload.StreamType
                                        .WEBSOCKET
                                )
                                .build()
                        )
                        .recordType(CallStreamingFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallStreamingFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamingFailedWebhookEvent),
                jacksonTypeRef<CallStreamingFailedWebhookEvent>(),
            )

        assertThat(roundtrippedCallStreamingFailedWebhookEvent)
            .isEqualTo(callStreamingFailedWebhookEvent)
    }
}
