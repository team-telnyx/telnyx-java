// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamingStartedWebhookEventTest {

    @Test
    fun create() {
        val callStreamingStartedWebhookEvent =
            CallStreamingStartedWebhookEvent.builder()
                .data(
                    CallStreamingStartedWebhookEvent.Data.builder()
                        .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                        .eventType(
                            CallStreamingStartedWebhookEvent.Data.EventType.STREAMING_STARTED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                        .payload(
                            CallStreamingStartedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callStreamingStartedWebhookEvent.data())
            .contains(
                CallStreamingStartedWebhookEvent.Data.builder()
                    .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                    .eventType(CallStreamingStartedWebhookEvent.Data.EventType.STREAMING_STARTED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                    .payload(
                        CallStreamingStartedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .streamUrl("wss://www.example.com/websocket")
                            .build()
                    )
                    .recordType(CallStreamingStartedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamingStartedWebhookEvent =
            CallStreamingStartedWebhookEvent.builder()
                .data(
                    CallStreamingStartedWebhookEvent.Data.builder()
                        .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                        .eventType(
                            CallStreamingStartedWebhookEvent.Data.EventType.STREAMING_STARTED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                        .payload(
                            CallStreamingStartedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStartedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallStreamingStartedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamingStartedWebhookEvent),
                jacksonTypeRef<CallStreamingStartedWebhookEvent>(),
            )

        assertThat(roundtrippedCallStreamingStartedWebhookEvent)
            .isEqualTo(callStreamingStartedWebhookEvent)
    }
}
