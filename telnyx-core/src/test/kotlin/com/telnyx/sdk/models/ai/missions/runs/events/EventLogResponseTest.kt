// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventLogResponseTest {

    @Test
    fun create() {
        val eventLogResponse =
            EventLogResponse.builder()
                .data(
                    EventLogResponse.Data.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventLogResponse.Data.Type.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventLogResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .build()

        assertThat(eventLogResponse.data())
            .isEqualTo(
                EventLogResponse.Data.builder()
                    .eventId("event_id")
                    .runId("run_id")
                    .summary("summary")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(EventLogResponse.Data.Type.STATUS_CHANGE)
                    .agentId("agent_id")
                    .idempotencyKey("idempotency_key")
                    .payload(
                        EventLogResponse.Data.Payload.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .stepId("step_id")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val eventLogResponse =
            EventLogResponse.builder()
                .data(
                    EventLogResponse.Data.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventLogResponse.Data.Type.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventLogResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .build()

        val roundtrippedEventLogResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventLogResponse),
                jacksonTypeRef<EventLogResponse>(),
            )

        assertThat(roundtrippedEventLogResponse).isEqualTo(eventLogResponse)
    }
}
