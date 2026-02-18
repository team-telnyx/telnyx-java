// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanStepDataTest {

    @Test
    fun create() {
        val planStepData =
            PlanStepData.builder()
                .description("description")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sequence(0L)
                .status(PlanStepData.Status.PENDING)
                .stepId("step_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    PlanStepData.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parentStepId("parent_step_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(planStepData.description()).isEqualTo("description")
        assertThat(planStepData.runId()).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(planStepData.sequence()).isEqualTo(0L)
        assertThat(planStepData.status()).isEqualTo(PlanStepData.Status.PENDING)
        assertThat(planStepData.stepId()).isEqualTo("step_id")
        assertThat(planStepData.completedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(planStepData.metadata())
            .contains(
                PlanStepData.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(planStepData.parentStepId()).contains("parent_step_id")
        assertThat(planStepData.startedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planStepData =
            PlanStepData.builder()
                .description("description")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sequence(0L)
                .status(PlanStepData.Status.PENDING)
                .stepId("step_id")
                .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .metadata(
                    PlanStepData.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parentStepId("parent_step_id")
                .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedPlanStepData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planStepData),
                jacksonTypeRef<PlanStepData>(),
            )

        assertThat(roundtrippedPlanStepData).isEqualTo(planStepData)
    }
}
