// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.ai.assistants.tests.testsuites.runs.Meta
import com.telnyx.sdk.models.ai.missions.runs.events.EventData
import com.telnyx.sdk.models.ai.missions.runs.events.EventType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventsListResponseTest {

    @Test
    fun create() {
        val eventsListResponse =
            EventsListResponse.builder()
                .addData(
                    EventData.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventType.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventData.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        assertThat(eventsListResponse.data())
            .containsExactly(
                EventData.builder()
                    .eventId("event_id")
                    .runId("run_id")
                    .summary("summary")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(EventType.STATUS_CHANGE)
                    .agentId("agent_id")
                    .idempotencyKey("idempotency_key")
                    .payload(
                        EventData.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .stepId("step_id")
                    .build()
            )
        assertThat(eventsListResponse.meta())
            .isEqualTo(
                Meta.builder().pageNumber(0L).pageSize(0L).totalPages(0L).totalResults(0L).build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventsListResponse =
            EventsListResponse.builder()
                .addData(
                    EventData.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventType.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventData.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .meta(
                    Meta.builder()
                        .pageNumber(0L)
                        .pageSize(0L)
                        .totalPages(0L)
                        .totalResults(0L)
                        .build()
                )
                .build()

        val roundtrippedEventsListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventsListResponse),
                jacksonTypeRef<EventsListResponse>(),
            )

        assertThat(roundtrippedEventsListResponse).isEqualTo(eventsListResponse)
    }
}
