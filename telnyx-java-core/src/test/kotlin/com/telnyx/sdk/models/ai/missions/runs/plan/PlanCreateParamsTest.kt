// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateParamsTest {

    @Test
    fun create() {
        PlanCreateParams.builder()
            .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .addStep(
                PlanCreateParams.Step.builder()
                    .description("description")
                    .sequence(0L)
                    .stepId("step_id")
                    .metadata(
                        PlanCreateParams.Step.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentStepId("parent_step_id")
                    .build()
            )
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanCreateParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStep(
                    PlanCreateParams.Step.builder()
                        .description("description")
                        .sequence(0L)
                        .stepId("step_id")
                        .build()
                )
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        // out-of-bound path param
        assertThat(params._pathParam(2)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            PlanCreateParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStep(
                    PlanCreateParams.Step.builder()
                        .description("description")
                        .sequence(0L)
                        .stepId("step_id")
                        .metadata(
                            PlanCreateParams.Step.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .parentStepId("parent_step_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.steps())
            .containsExactly(
                PlanCreateParams.Step.builder()
                    .description("description")
                    .sequence(0L)
                    .stepId("step_id")
                    .metadata(
                        PlanCreateParams.Step.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentStepId("parent_step_id")
                    .build()
            )
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PlanCreateParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .addStep(
                    PlanCreateParams.Step.builder()
                        .description("description")
                        .sequence(0L)
                        .stepId("step_id")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body.steps())
            .containsExactly(
                PlanCreateParams.Step.builder()
                    .description("description")
                    .sequence(0L)
                    .stepId("step_id")
                    .build()
            )
    }
}
