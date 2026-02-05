// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecStartedTest {

    @Test
    fun create() {
        val callSiprecStarted =
            CallSiprecStarted.builder()
                .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                .eventType(CallSiprecStarted.EventType.SIPREC_STARTED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                .payload(
                    CallSiprecStarted.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .build()
                )
                .recordType(CallSiprecStarted.RecordType.EVENT)
                .build()

        assertThat(callSiprecStarted.id()).contains("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
        assertThat(callSiprecStarted.eventType())
            .contains(CallSiprecStarted.EventType.SIPREC_STARTED)
        assertThat(callSiprecStarted.occurredAt())
            .contains(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
        assertThat(callSiprecStarted.payload())
            .contains(
                CallSiprecStarted.Payload.builder()
                    .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .build()
            )
        assertThat(callSiprecStarted.recordType()).contains(CallSiprecStarted.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecStarted =
            CallSiprecStarted.builder()
                .id("7d743d69-f7e8-4761-b7d4-8cacf9d3c031")
                .eventType(CallSiprecStarted.EventType.SIPREC_STARTED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:06:32.059436Z"))
                .payload(
                    CallSiprecStarted.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .build()
                )
                .recordType(CallSiprecStarted.RecordType.EVENT)
                .build()

        val roundtrippedCallSiprecStarted =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecStarted),
                jacksonTypeRef<CallSiprecStarted>(),
            )

        assertThat(roundtrippedCallSiprecStarted).isEqualTo(callSiprecStarted)
    }
}
