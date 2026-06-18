// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.finetuning

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.finetuning.jobs.JobCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class JobServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.ai().fineTuning().jobs()

        val fineTuningJobFuture =
            jobServiceAsync.create(
                JobCreateParams.builder()
                    .model("model")
                    .trainingFile("training_file")
                    .hyperparameters(JobCreateParams.Hyperparameters.builder().nEpochs(1L).build())
                    .suffix("suffix")
                    .build()
            )

        val fineTuningJob = fineTuningJobFuture.get()
        fineTuningJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.ai().fineTuning().jobs()

        val fineTuningJobFuture = jobServiceAsync.retrieve("job_id")

        val fineTuningJob = fineTuningJobFuture.get()
        fineTuningJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.ai().fineTuning().jobs()

        val jobsFuture = jobServiceAsync.list()

        val jobs = jobsFuture.get()
        jobs.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cancel() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val jobServiceAsync = client.ai().fineTuning().jobs()

        val fineTuningJobFuture = jobServiceAsync.cancel("job_id")

        val fineTuningJob = fineTuningJobFuture.get()
        fineTuningJob.validate()
    }
}
