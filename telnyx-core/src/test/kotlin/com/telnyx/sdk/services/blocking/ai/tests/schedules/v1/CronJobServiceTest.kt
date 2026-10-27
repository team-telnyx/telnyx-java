// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.tests.schedules.v1

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobRetrieveCronJobsParams
import com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs.CronJobUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CronJobServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cronJobService = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJob = cronJobService.retrieve(0L)

        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cronJobService = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJob =
            cronJobService.update(
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

        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cronJobService = client.ai().tests().schedules().v1().cronJobs()

        val cronJob = cronJobService.delete(0L)

        cronJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun cronJobs() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cronJobService = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJob =
            cronJobService.cronJobs(
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

        scheduledTestJob.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveCronJobs() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val cronJobService = client.ai().tests().schedules().v1().cronJobs()

        val scheduledTestJobs =
            cronJobService.retrieveCronJobs(
                CronJobRetrieveCronJobsParams.builder().agentId(0L).build()
            )

        scheduledTestJobs.forEach { it.validate() }
    }
}
