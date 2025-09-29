// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.finetuning.jobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class JobListResponseTest {

    @Test
    fun create() {
        val jobListResponse =
            JobListResponse.builder()
                .addData(
                    FineTuningJob.builder()
                        .id("id")
                        .createdAt(0L)
                        .finishedAt(0L)
                        .hyperparameters(
                            FineTuningJob.Hyperparameters.builder().nEpochs(1L).build()
                        )
                        .model("model")
                        .organizationId("organization_id")
                        .status(FineTuningJob.Status.QUEUED)
                        .trainedTokens(0L)
                        .trainingFile("training_file")
                        .build()
                )
                .build()

        assertThat(jobListResponse.data())
            .containsExactly(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val jobListResponse =
            JobListResponse.builder()
                .addData(
                    FineTuningJob.builder()
                        .id("id")
                        .createdAt(0L)
                        .finishedAt(0L)
                        .hyperparameters(
                            FineTuningJob.Hyperparameters.builder().nEpochs(1L).build()
                        )
                        .model("model")
                        .organizationId("organization_id")
                        .status(FineTuningJob.Status.QUEUED)
                        .trainedTokens(0L)
                        .trainingFile("training_file")
                        .build()
                )
                .build()

        val roundtrippedJobListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(jobListResponse),
                jacksonTypeRef<JobListResponse>(),
            )

        assertThat(roundtrippedJobListResponse).isEqualTo(jobListResponse)
    }
}
