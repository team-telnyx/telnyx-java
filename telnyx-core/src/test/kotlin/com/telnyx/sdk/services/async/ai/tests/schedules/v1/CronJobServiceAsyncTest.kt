// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.tests.schedules.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CronJobServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cronJobServiceAsync = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJobFuture = cronJobServiceAsync.retrieve(0L)

        val scheduledTestJob = scheduledTestJobFuture.get()
        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cronJobServiceAsync = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJobFuture =
            cronJobServiceAsync.update(
                CronJobUpdateParams.builder()
                    .id(0L)
                    .agent(0L)
                    .crontabExpression("0 4 * * *")
                    .executionMode("execution_mode")
                    .frequency(0L)
                    .isActive(true)
                    .name("Nightly regression - updated")
                    .notifyOn(CronJobUpdateParams.NotifyOn.BOTH)
                    .addPersonality(0L)
                    .runAsText(true)
                    .addScenario(0L)
                    .addTag("string")
                    .timezone("timezone")
                    .build()
            )

        val scheduledTestJob = scheduledTestJobFuture.get()
        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cronJobServiceAsync = client.ai().tests().schedules().v1().cronJobs()

        val cronJobFuture = cronJobServiceAsync.delete(0L)

        val cronJob = cronJobFuture.get()
        cronJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cronJobs() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cronJobServiceAsync = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJobFuture =
            cronJobServiceAsync.cronJobs(
                CronJobCronJobsParams.builder()
                    .crontabExpression("0 3 * * *")
                    .agent(1259L)
                    .executionMode("voice")
                    .frequency(0L)
                    .isActive(true)
                    .name("Nightly regression")
                    .notifyOn(CronJobCronJobsParams.NotifyOn.FAILURE)
                    .addPersonality(0L)
                    .runAsText(true)
                    .addScenario(9512L)
                    .addTag("string")
                    .timezone("America/Chicago")
                    .build()
            )

        val scheduledTestJob = scheduledTestJobFuture.get()
        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCronJobs() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val cronJobServiceAsync = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJobsFuture =
            cronJobServiceAsync.retrieveCronJobs(
                CronJobRetrieveCronJobsParams.builder().agentId(0L).build()
            )

        val scheduledTestJobs = scheduledTestJobsFuture.get()
        scheduledTestJobs.forEach { it.validate() }
    }
}
