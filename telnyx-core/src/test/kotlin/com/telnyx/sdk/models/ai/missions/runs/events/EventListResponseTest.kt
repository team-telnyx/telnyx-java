// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventListResponseTest {

    @Test
    fun create() {
        val eventListResponse =
            EventListResponse.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EventListResponse.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    EventListResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        assertThat(eventListResponse.eventId()).isEqualTo("event_id")
        assertThat(eventListResponse.runId()).isEqualTo("run_id")
        assertThat(eventListResponse.summary()).isEqualTo("summary")
        assertThat(eventListResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(eventListResponse.type()).isEqualTo(EventListResponse.Type.STATUS_CHANGE)
        assertThat(eventListResponse.agentId()).contains("agent_id")
        assertThat(eventListResponse.idempotencyKey()).contains("idempotency_key")
        assertThat(eventListResponse.payload())
            .contains(
                EventListResponse.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(eventListResponse.stepId()).contains("step_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventListResponse =
            EventListResponse.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(EventListResponse.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    EventListResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        val roundtrippedEventListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventListResponse),
                jacksonTypeRef<EventListResponse>(),
            )

        assertThat(roundtrippedEventListResponse).isEqualTo(eventListResponse)
    }
}
