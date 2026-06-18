// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.runs.plan

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PlanGetStepDetailsParamsTest {

    @Test
    fun create() {
        PlanGetStepDetailsParams.builder()
            .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
            .stepId("step_id")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            PlanGetStepDetailsParams.builder()
                .missionId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .runId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .stepId("step_id")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(1)).isEqualTo("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(params._pathParam(2)).isEqualTo("step_id")
        // out-of-bound path param
        assertThat(params._pathParam(3)).isEqualTo("")
    }
}
