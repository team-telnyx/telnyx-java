// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamingStartedTest {

    @Test
    fun create() {
        val callStreamingStarted =
            CallStreamingStarted.builder()
                .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                .eventType(CallStreamingStarted.EventType.STREAMING_STARTED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                .payload(
                    CallStreamingStarted.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamUrl("wss://www.example.com/websocket")
                        .build()
                )
                .recordType(CallStreamingStarted.RecordType.EVENT)
                .build()

        assertThat(callStreamingStarted.id()).contains("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
        assertThat(callStreamingStarted.eventType())
            .contains(CallStreamingStarted.EventType.STREAMING_STARTED)
        assertThat(callStreamingStarted.occurredAt())
            .contains(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
        assertThat(callStreamingStarted.payload())
            .contains(
                CallStreamingStarted.Payload.builder()
                    .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .streamUrl("wss://www.example.com/websocket")
                    .build()
            )
        assertThat(callStreamingStarted.recordType())
            .contains(CallStreamingStarted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamingStarted =
            CallStreamingStarted.builder()
                .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                .eventType(CallStreamingStarted.EventType.STREAMING_STARTED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                .payload(
                    CallStreamingStarted.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .streamUrl("wss://www.example.com/websocket")
                        .build()
                )
                .recordType(CallStreamingStarted.RecordType.EVENT)
                .build()

        val roundtrippedCallStreamingStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamingStarted),
                jacksonTypeRef<CallStreamingStarted>(),
            )

        assertThat(roundtrippedCallStreamingStarted).isEqualTo(callStreamingStarted)
    }
}
