// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventDataTest {

    @Test
    fun create() {
        val eventData =
            EventData.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EventData.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    EventData.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        assertThat(eventData.eventId()).isEqualTo("event_id")
        assertThat(eventData.runId()).isEqualTo("run_id")
        assertThat(eventData.summary()).isEqualTo("summary")
        assertThat(eventData.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventData.type()).isEqualTo(EventData.Type.STATUS_CHANGE)
        assertThat(eventData.agentId()).contains("agent_id")
        assertThat(eventData.idempotencyKey()).contains("idempotency_key")
        assertThat(eventData.payload())
            .contains(
                EventData.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(eventData.stepId()).contains("step_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventData =
            EventData.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EventData.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    EventData.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        val roundtrippedEventData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventData),
                jacksonTypeRef<EventData>(),
            )

        assertThat(roundtrippedEventData).isEqualTo(eventData)
    }
}
