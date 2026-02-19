// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.missions.runs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.ai().missions().runs().plan()

        val plan =
            planService.create(
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
            )

        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.ai().missions().runs().plan()

        val plan =
            planService.retrieve(
                PlanRetrieveParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addStepsToPlan() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.ai().missions().runs().plan()

        val response =
            planService.addStepsToPlan(
                PlanAddStepsToPlanParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .addStep(
                        PlanAddStepsToPlanParams.Step.builder()
                            .description("description")
                            .sequence(0L)
                            .stepId("step_id")
                            .metadata(
                                PlanAddStepsToPlanParams.Step.Metadata.builder()
                                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                                    .build()
                            )
                            .parentStepId("parent_step_id")
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStepDetails() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.ai().missions().runs().plan()

        val response =
            planService.getStepDetails(
                PlanGetStepDetailsParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .stepId("step_id")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStep() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val planService = client.ai().missions().runs().plan()

        val response =
            planService.updateStep(
                PlanUpdateStepParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .stepId("step_id")
                    .metadata(
                        PlanUpdateStepParams.Metadata.builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .status(PlanUpdateStepParams.Status.PENDING)
                    .build()
            )

        response.validate()
    }
}
