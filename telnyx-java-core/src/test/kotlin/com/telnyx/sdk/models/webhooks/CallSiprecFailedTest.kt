// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecFailedTest {

    @Test
    fun create() {
        val callSiprecFailed =
            CallSiprecFailed.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallSiprecFailed.EventType.SIPREC_FAILED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallSiprecFailed.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .failureCause("no_answer")
                        .build()
                )
                .recordType(CallSiprecFailed.RecordType.EVENT)
                .build()

        assertThat(callSiprecFailed.id()).contains("25dc3731-e51e-4927-a50d-a61cc25984b1")
        assertThat(callSiprecFailed.eventType()).contains(CallSiprecFailed.EventType.SIPREC_FAILED)
        assertThat(callSiprecFailed.occurredAt())
            .contains(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
        assertThat(callSiprecFailed.payload())
            .contains(
                CallSiprecFailed.Payload.builder()
                    .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                    .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                    .connectionId("7267xxxxxxxxxxxxxx")
                    .failureCause("no_answer")
                    .build()
            )
        assertThat(callSiprecFailed.recordType()).contains(CallSiprecFailed.RecordType.EVENT)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecFailed =
            CallSiprecFailed.builder()
                .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                .eventType(CallSiprecFailed.EventType.SIPREC_FAILED)
                .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                .payload(
                    CallSiprecFailed.Payload.builder()
                        .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                        .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                        .connectionId("7267xxxxxxxxxxxxxx")
                        .failureCause("no_answer")
                        .build()
                )
                .recordType(CallSiprecFailed.RecordType.EVENT)
                .build()

        val roundtrippedCallSiprecFailed =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecFailed),
                jacksonTypeRef<CallSiprecFailed>(),
            )

        assertThat(roundtrippedCallSiprecFailed).isEqualTo(callSiprecFailed)
    }
}
