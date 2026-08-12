// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.events

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class EventLogParamsTest {

    @Test
    fun create() {
        EventLogParams.builder()
            .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .summary("Summary")
            .type(EventType.STATUS_CHANGE)
            .agentId("Agent Id")
            .idempotencyKey("Idempotency Key")
            .payload(
                EventLogParams.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
            .stepId("Step Id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            EventLogParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .summary("Summary")
                .type(EventType.STATUS_CHANGE)
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            EventLogParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .summary("Summary")
                .type(EventType.STATUS_CHANGE)
                .agentId("Agent Id")
                .idempotencyKey("Idempotency Key")
                .payload(
                    EventLogParams.Payload.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .stepId("Step Id")
                .build()

        val body = params._body()

        assertThat(body.summary()).isEqualTo("Summary")
        assertThat(body.type()).isEqualTo(EventType.STATUS_CHANGE)
        assertThat(body.agentId()).contains("Agent Id")
        assertThat(body.idempotencyKey()).contains("Idempotency Key")
        assertThat(body.payload())
            .contains(
                EventLogParams.Payload.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(body.stepId()).contains("Step Id")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            EventLogParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .summary("Summary")
                .type(EventType.STATUS_CHANGE)
                .build()

        val body = params._body()

        assertThat(body.summary()).isEqualTo("Summary")
        assertThat(body.type()).isEqualTo(EventType.STATUS_CHANGE)
    }
}
