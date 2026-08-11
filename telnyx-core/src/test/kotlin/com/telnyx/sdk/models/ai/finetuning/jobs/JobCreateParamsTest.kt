// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateParamsTest {

    @Test
    fun create() {
        JobCreateParams.builder()
            .model("string")
            .trainingFile("string")
            .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(3L).build())
            .suffix("string")
            .build()
    }

    @Test
    fun body() {
        val params =
            JobCreateParams.builder()
                .model("string")
                .trainingFile("string")
                .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(3L).build())
                .suffix("string")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("string")
        assertThat(body.trainingFile()).isEqualTo("string")
        assertThat(body.hyperparameters())
            .contains(JobCreateParams.Hyperparameters.builder().nEpochs(3L).build())
        assertThat(body.suffix()).contains("string")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = JobCreateParams.builder().model("string").trainingFile("string").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("string")
        assertThat(body.trainingFile()).isEqualTo("string")
    }
}
