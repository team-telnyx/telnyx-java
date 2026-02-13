// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanCreateResponseTest {

    @Test
    fun create() {
        val planCreateResponse =
            PlanCreateResponse.builder()
                .addData(
                    PlanCreateResponse.Data.builder()
                        .description("description")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sequence(0L)
                        .status(PlanCreateResponse.Data.Status.PENDING)
                        .stepId("step_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            PlanCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .parentStepId("parent_step_id")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        assertThat(planCreateResponse.data())
            .containsExactly(
                PlanCreateResponse.Data.builder()
                    .description("description")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .sequence(0L)
                    .status(PlanCreateResponse.Data.Status.PENDING)
                    .stepId("step_id")
                    .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .metadata(
                        PlanCreateResponse.Data.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .parentStepId("parent_step_id")
                    .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val planCreateResponse =
            PlanCreateResponse.builder()
                .addData(
                    PlanCreateResponse.Data.builder()
                        .description("description")
                        .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .sequence(0L)
                        .status(PlanCreateResponse.Data.Status.PENDING)
                        .stepId("step_id")
                        .completedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .metadata(
                            PlanCreateResponse.Data.Metadata.builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .parentStepId("parent_step_id")
                        .startedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .build()

        val roundtrippedPlanCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(planCreateResponse),
                jacksonTypeRef<PlanCreateResponse>(),
            )

        assertThat(roundtrippedPlanCreateResponse).isEqualTo(planCreateResponse)
    }
}
