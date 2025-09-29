// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.webhooks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallSiprecFailedWebhookEventTest {

    @Test
    fun create() {
        val callSiprecFailedWebhookEvent =
            CallSiprecFailedWebhookEvent.builder()
                .data(
                    CallSiprecFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallSiprecFailedWebhookEvent.Data.EventType.SIPREC_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallSiprecFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureCause("no_answer")
                                .build()
                        )
                        .recordType(CallSiprecFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        assertThat(callSiprecFailedWebhookEvent.data())
            .contains(
                CallSiprecFailedWebhookEvent.Data.builder()
                    .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                    .eventType(CallSiprecFailedWebhookEvent.Data.EventType.SIPREC_FAILED)
                    .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                    .payload(
                        CallSiprecFailedWebhookEvent.Data.Payload.builder()
                            .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                            .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                            .connectionId("7267xxxxxxxxxxxxxx")
                            .failureCause("no_answer")
                            .build()
                    )
                    .recordType(CallSiprecFailedWebhookEvent.Data.RecordType.EVENT)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callSiprecFailedWebhookEvent =
            CallSiprecFailedWebhookEvent.builder()
                .data(
                    CallSiprecFailedWebhookEvent.Data.builder()
                        .id("25dc3731-e51e-4927-a50d-a61cc25984b1")
                        .eventType(CallSiprecFailedWebhookEvent.Data.EventType.SIPREC_FAILED)
                        .occurredAt(OffsetDateTime.parse("2021-12-15T14:11:24.613295Z"))
                        .payload(
                            CallSiprecFailedWebhookEvent.Data.Payload.builder()
                                .callControlId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callLegId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .callSessionId("31f19208-5db0-11ec-9ea7-02420a0d3a69")
                                .clientState("aGF2ZSBhIG5pY2UgZGF5ID1d")
                                .connectionId("7267xxxxxxxxxxxxxx")
                                .failureCause("no_answer")
                                .build()
                        )
                        .recordType(CallSiprecFailedWebhookEvent.Data.RecordType.EVENT)
                        .build()
                )
                .build()

        val roundtrippedCallSiprecFailedWebhookEvent =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callSiprecFailedWebhookEvent),
                jacksonTypeRef<CallSiprecFailedWebhookEvent>(),
            )

        assertThat(roundtrippedCallSiprecFailedWebhookEvent).isEqualTo(callSiprecFailedWebhookEvent)
    }
}
