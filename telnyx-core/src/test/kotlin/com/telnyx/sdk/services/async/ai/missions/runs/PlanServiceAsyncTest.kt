// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.missions.runs

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanAddStepsToPlanParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanCreateParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanGetStepDetailsParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanRetrieveParams
import com.telnyx.sdk.models.ai.missions.runs.plan.PlanUpdateStepParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PlanServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.ai().missions().runs().plan()

        val planFuture =
            planServiceAsync.create(
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

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.ai().missions().runs().plan()

        val planFuture =
            planServiceAsync.retrieve(
                PlanRetrieveParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        val plan = planFuture.get()
        plan.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun addStepsToPlan() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.ai().missions().runs().plan()

        val responseFuture =
            planServiceAsync.addStepsToPlan(
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

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun getStepDetails() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.ai().missions().runs().plan()

        val responseFuture =
            planServiceAsync.getStepDetails(
                PlanGetStepDetailsParams.builder()
                    .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .stepId("step_id")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun updateStep() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val planServiceAsync = client.ai().missions().runs().plan()

        val responseFuture =
            planServiceAsync.updateStep(
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

        val response = responseFuture.get()
        response.validate()
    }
}
