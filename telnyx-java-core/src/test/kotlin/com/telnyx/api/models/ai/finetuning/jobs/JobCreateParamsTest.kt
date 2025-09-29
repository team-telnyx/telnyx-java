// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.finetuning.jobs

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobCreateParamsTest {

    @Test
    fun create() {
        JobCreateParams.builder()
            .model("model")
            .trainingFile("training_file")
            .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(1L).build())
            .suffix("suffix")
            .build()
    }

    @Test
    fun body() {
        val params =
            JobCreateParams.builder()
                .model("model")
                .trainingFile("training_file")
                .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(1L).build())
                .suffix("suffix")
                .build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingFile()).isEqualTo("training_file")
        assertThat(body.hyperparameters())
            .contains(JobCreateParams.Hyperparameters.builder().nEpochs(1L).build())
        assertThat(body.suffix()).contains("suffix")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = JobCreateParams.builder().model("model").trainingFile("training_file").build()

        val body = params._body()

        assertThat(body.model()).isEqualTo("model")
        assertThat(body.trainingFile()).isEqualTo("training_file")
    }
}
