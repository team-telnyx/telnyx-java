// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecStoppedWebhookEventTest {

    @Test
    fun create() {
        val callSiprecStoppedWebhookEvent =
            CallSiprecStoppedWebhookEvent.builder()
                .data(
                    CallSiprecStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallSiprecStoppedWebhookEvent.Data.EventType.SIPREC_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallSiprecStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .hangupCause("normal_clearing")
                                .build()
                        )
                        .recordType(CallSiprecStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callSiprecStoppedWebhookEvent.data())
            .contains(
                CallSiprecStoppedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(CallSiprecStoppedWebhookEvent.Data.EventType.SIPREC_STOPPED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        CallSiprecStoppedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .hangupCause("normal_clearing")
                            .build()
                    )
                    .recordType(CallSiprecStoppedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecStoppedWebhookEvent =
            CallSiprecStoppedWebhookEvent.builder()
                .data(
                    CallSiprecStoppedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallSiprecStoppedWebhookEvent.Data.EventType.SIPREC_STOPPED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallSiprecStoppedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .hangupCause("normal_clearing")
                                .build()
                        )
                        .recordType(CallSiprecStoppedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallSiprecStoppedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecStoppedWebhookEvent),
                jacksonTypeRef<CallSiprecStoppedWebhookEvent>(),
            )

        assertThat(roundtrippedCallSiprecStoppedWebhookEvent)
            .isEqualTo(callSiprecStoppedWebhookEvent)
    }
}
