// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CreatePlanStepRequestTest {

    @Test
    fun create() {
        val createPlanStepRequest =
            CreatePlanStepRequest.builder()
                .description("description")
                .sequence(0L)
                .stepId("step_id")
                .metadata(
                    CreatePlanStepRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parentStepId("parent_step_id")
                .build()

        assertThat(createPlanStepRequest.description()).isEqualTo("description")
        assertThat(createPlanStepRequest.sequence()).isEqualTo(0L)
        assertThat(createPlanStepRequest.stepId()).isEqualTo("step_id")
        assertThat(createPlanStepRequest.metadata())
            .contains(
                CreatePlanStepRequest.Metadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(createPlanStepRequest.parentStepId()).contains("parent_step_id")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val createPlanStepRequest =
            CreatePlanStepRequest.builder()
                .description("description")
                .sequence(0L)
                .stepId("step_id")
                .metadata(
                    CreatePlanStepRequest.Metadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .parentStepId("parent_step_id")
                .build()

        val roundtrippedCreatePlanStepRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(createPlanStepRequest),
                jacksonTypeRef<CreatePlanStepRequest>(),
            )

        assertThat(roundtrippedCreatePlanStepRequest).isEqualTo(createPlanStepRequest)
    }
}
