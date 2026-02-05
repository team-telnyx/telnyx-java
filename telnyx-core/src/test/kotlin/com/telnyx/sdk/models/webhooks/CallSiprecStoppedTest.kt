// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecStoppedTest {

    @Test
    fun create() {
        val callSiprecStopped =
            CallSiprecStopped.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallSiprecStopped.EventType.SIPREC_STOPPED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallSiprecStopped.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .hangupCause("normal_clearing")
                        .build()
                )
                .recordType(CallSiprecStopped.RecordType.EVENT)
                .build()

        assertThat(callSiprecStopped.id()).contains("25dc3731-e51e-4927-a50d-a61cc25984b1")
        assertThat(callSiprecStopped.eventType())
            .contains(CallSiprecStopped.EventType.SIPREC_STOPPED)
        assertThat(callSiprecStopped.occurredAt())
            .contains(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
        assertThat(callSiprecStopped.payload())
            .contains(
                CallSiprecStopped.Payload.builder()
                    .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .hangupCause("normal_clearing")
                    .build()
            )
        assertThat(callSiprecStopped.recordType()).contains(CallSiprecStopped.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecStopped =
            CallSiprecStopped.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallSiprecStopped.EventType.SIPREC_STOPPED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallSiprecStopped.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .hangupCause("normal_clearing")
                        .build()
                )
                .recordType(CallSiprecStopped.RecordType.EVENT)
                .build()

        val roundtrippedCallSiprecStopped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecStopped),
                jacksonTypeRef<CallSiprecStopped>(),
            )

        assertThat(roundtrippedCallSiprecStopped).isEqualTo(callSiprecStopped)
    }
}
