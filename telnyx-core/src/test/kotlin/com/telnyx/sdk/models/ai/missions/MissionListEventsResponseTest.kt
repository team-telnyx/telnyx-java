// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MissionListEventsResponseTest {

    @Test
    fun create() {
        val missionListEventsResponse =
            MissionListEventsResponse.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(MissionListEventsResponse.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    MissionListEventsResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        assertThat(missionListEventsResponse.eventId()).isEqualTo("event_id")
        assertThat(missionListEventsResponse.runId()).isEqualTo("run_id")
        assertThat(missionListEventsResponse.summary()).isEqualTo("summary")
        assertThat(missionListEventsResponse.timestamp())
            .isEqualTo(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(missionListEventsResponse.type())
            .isEqualTo(MissionListEventsResponse.Type.STATUS_CHANGE)
        assertThat(missionListEventsResponse.agentId()).contains("agent_id")
        assertThat(missionListEventsResponse.idempotencyKey()).contains("idempotency_key")
        assertThat(missionListEventsResponse.payload())
            .contains(
                MissionListEventsResponse.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(missionListEventsResponse.stepId()).contains("step_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val missionListEventsResponse =
            MissionListEventsResponse.builder()
                .eventId("event_id")
                .runId("run_id")
                .summary("summary")
                .timestamp(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .type(MissionListEventsResponse.Type.STATUS_CHANGE)
                .agentId("agent_id")
                .idempotencyKey("idempotency_key")
                .payload(
                    MissionListEventsResponse.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("step_id")
                .build()

        val roundtrippedMissionListEventsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(missionListEventsResponse),
                jacksonTypeRef<MissionListEventsResponse>(),
            )

        assertThat(roundtrippedMissionListEventsResponse).isEqualTo(missionListEventsResponse)
    }
}
