// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.finetuning

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.finetuning.jobs.JobCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.ai().fineTuning().jobs()

        val fineTuningJob =
            jobService.create(
                JobCreateParams.builder()
                    .model("model")
                    .trainingFile("training_file")
                    .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(1L).build())
                    .suffix("suffix")
                    .build()
            )

        fineTuningJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.ai().fineTuning().jobs()

        val fineTuningJob = jobService.retrieve("job_id")

        fineTuningJob.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.ai().fineTuning().jobs()

        val jobs = jobService.list()

        jobs.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun cancel() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val jobService = client.ai().fineTuning().jobs()

        val fineTuningJob = jobService.cancel("job_id")

        fineTuningJob.validate()
    }
}
