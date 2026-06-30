// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallStreamingFailedTest {

    @Test
    fun create() {
        val callStreamingFailed =
            CallStreamingFailed.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallStreamingFailed.EventType.STREAMING_FAILED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallStreamingFailed.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .failureReason("connection_failed")
                        .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                        .streamParams(
                            CallStreamingFailed.Payload.StreamParams.builder()
                                .streamUrl("wss://www.example.com/websocket")
                                .track(CallStreamingFailed.Payload.StreamParams.Track.INBOUND_TRACK)
                                .build()
                        )
                        .streamType(CallStreamingFailed.Payload.StreamType.WEBSOCKET)
                        .build()
                )
                .recordType(CallStreamingFailed.RecordType.EVENT)
                .build()

        assertThat(callStreamingFailed.id()).contains("25dc3731-e51e-4927-a50d-a61cc25984b1")
        assertThat(callStreamingFailed.eventType())
            .contains(CallStreamingFailed.EventType.STREAMING_FAILED)
        assertThat(callStreamingFailed.occurredAt())
            .contains(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
        assertThat(callStreamingFailed.payload())
            .contains(
                CallStreamingFailed.Payload.builder()
                    .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .failureReason("connection_failed")
                    .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                    .streamParams(
                        CallStreamingFailed.Payload.StreamParams.builder()
                            .streamUrl("wss://www.example.com/websocket")
                            .track(CallStreamingFailed.Payload.StreamParams.Track.INBOUND_TRACK)
                            .build()
                    )
                    .streamType(CallStreamingFailed.Payload.StreamType.WEBSOCKET)
                    .build()
            )
        assertThat(callStreamingFailed.recordType()).contains(CallStreamingFailed.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callStreamingFailed =
            CallStreamingFailed.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallStreamingFailed.EventType.STREAMING_FAILED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallStreamingFailed.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .failureReason("connection_failed")
                        .streamId("1edb94f9-7ef0-4150-b502-e0ebadfd9491")
                        .streamParams(
                            CallStreamingFailed.Payload.StreamParams.builder()
                                .streamUrl("wss://www.example.com/websocket")
                                .track(CallStreamingFailed.Payload.StreamParams.Track.INBOUND_TRACK)
                                .build()
                        )
                        .streamType(CallStreamingFailed.Payload.StreamType.WEBSOCKET)
                        .build()
                )
                .recordType(CallStreamingFailed.RecordType.EVENT)
                .build()

        val roundtrippedCallStreamingFailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callStreamingFailed),
                jacksonTypeRef<CallStreamingFailed>(),
            )

        assertThat(roundtrippedCallStreamingFailed).isEqualTo(callStreamingFailed)
    }
}
