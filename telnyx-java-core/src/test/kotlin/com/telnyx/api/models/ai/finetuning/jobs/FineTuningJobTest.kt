// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.finetuning.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class FineTuningJobTest {

    @Test
    fun create() {
        val fineTuningJob =
            FineTuningJob.builder()
                .id("id")
                .createdAt(0L)
                .finishedAt(0L)
                .hyperparameters(FineTuningJob.Hyperparameters.builder().nEpochs(1L).build())
                .model("model")
                .organizationId("organization_id")
                .status(FineTuningJob.Status.QUEUED)
                .trainedTokens(0L)
                .trainingFile("training_file")
                .build()

        assertThat(fineTuningJob.id()).isEqualTo("id")
        assertThat(fineTuningJob.createdAt()).isEqualTo(0L)
        assertThat(fineTuningJob.finishedAt()).contains(0L)
        assertThat(fineTuningJob.hyperparameters())
            .isEqualTo(FineTuningJob.Hyperparameters.builder().nEpochs(1L).build())
        assertThat(fineTuningJob.model()).isEqualTo("model")
        assertThat(fineTuningJob.organizationId()).isEqualTo("organization_id")
        assertThat(fineTuningJob.status()).isEqualTo(FineTuningJob.Status.QUEUED)
        assertThat(fineTuningJob.trainedTokens()).contains(0L)
        assertThat(fineTuningJob.trainingFile()).isEqualTo("training_file")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val fineTuningJob =
            FineTuningJob.builder()
                .id("id")
                .createdAt(0L)
                .finishedAt(0L)
                .hyperparameters(FineTuningJob.Hyperparameters.builder().nEpochs(1L).build())
                .model("model")
                .organizationId("organization_id")
                .status(FineTuningJob.Status.QUEUED)
                .trainedTokens(0L)
                .trainingFile("training_file")
                .build()

        val roundtrippedFineTuningJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(fineTuningJob),
                jacksonTypeRef<FineTuningJob>(),
            )

        assertThat(roundtrippedFineTuningJob).isEqualTo(fineTuningJob)
    }
}
