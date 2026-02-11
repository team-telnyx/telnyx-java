// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventGetEventDetailsResponseTest {

    @Test
    fun create() {
        val eventGetEventDetailsResponse =
            EventGetEventDetailsResponse.builder()
                .data(
                    EventGetEventDetailsResponse.Data.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventGetEventDetailsResponse.Data.Type.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventGetEventDetailsResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .build()

        assertThat(eventGetEventDetailsResponse.data())
            .isEqualTo(
                EventGetEventDetailsResponse.Data.builder()
                    .eventId("event_id")
                    .runId("run_id")
                    .summary("summary")
                    .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .type(EventGetEventDetailsResponse.Data.Type.STATUS_CHANGE)
                    .agentId("agent_id")
                    .idempotencyKey("idempotency_key")
                    .payload(
                        EventGetEventDetailsResponse.Data.Payload.builder()
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
        val eventGetEventDetailsResponse =
            EventGetEventDetailsResponse.builder()
                .data(
                    EventGetEventDetailsResponse.Data.builder()
                        .eventId("event_id")
                        .runId("run_id")
                        .summary("summary")
                        .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .type(EventGetEventDetailsResponse.Data.Type.STATUS_CHANGE)
                        .agentId("agent_id")
                        .idempotencyKey("idempotency_key")
                        .payload(
                            EventGetEventDetailsResponse.Data.Payload.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .stepId("step_id")
                        .build()
                )
                .build()

        val roundtrippedEventGetEventDetailsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(eventGetEventDetailsResponse),
                jacksonTypeRef<EventGetEventDetailsResponse>(),
            )

        assertThat(roundtrippedEventGetEventDetailsResponse).isEqualTo(eventGetEventDetailsResponse)
    }
}
