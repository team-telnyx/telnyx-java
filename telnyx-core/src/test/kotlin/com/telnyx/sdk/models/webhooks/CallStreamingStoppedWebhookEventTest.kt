// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamingStoppedWebhookEventTest {

    @Test
    fun create() {
        val callStreamingStoppedWebhookEvent =
            CallStreamingStoppedWebhookEvent.builder()
                .data(
                    CallStreamingStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(
                            CallStreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callStreamingStoppedWebhookEvent.data())
            .contains(
                CallStreamingStoppedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(CallStreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        CallStreamingStoppedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .streamUrl("wss://www.example.com/websocket")
                            .build()
                    )
                    .recordType(CallStreamingStoppedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamingStoppedWebhookEvent =
            CallStreamingStoppedWebhookEvent.builder()
                .data(
                    CallStreamingStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(
                            CallStreamingStoppedWebhookEvent.Data.EventType.STREAMING_STOPPED
                        )
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallStreamingStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .streamUrl("wss://www.example.com/websocket")
                                .build()
                        )
                        .recordType(CallStreamingStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallStreamingStoppedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamingStoppedWebhookEvent),
                jacksonTypeRef<CallStreamingStoppedWebhookEvent>(),
            )

        assertThat(roundtrippedCallStreamingStoppedWebhookEvent)
            .isEqualTo(callStreamingStoppedWebhookEvent)
    }
}
