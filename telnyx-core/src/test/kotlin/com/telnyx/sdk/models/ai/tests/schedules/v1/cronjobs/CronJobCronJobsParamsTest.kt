// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronJobCronJobsParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.crontabExpression()).isEqualTo("0 3 * * *")
        assertThat(body.agent()).contains(1259L)
        assertThat(body.executionMode()).contains("voice")
        assertThat(body.frequency()).contains(0L)
        assertThat(body.isActive()).contains(true)
        assertThat(body.name()).contains("Nightly regression")
        assertThat(body.notifyOn()).contains(CronJobCronJobsParams.NotifyOn.FAILURE)
        assertThat(body.personalities().getOrNull()).containsExactly(0L)
        assertThat(body.runAsText()).contains(true)
        assertThat(body.scenarios().getOrNull()).containsExactly(9512L)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.timezone()).contains("America/Chicago")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CronJobCronJobsParams.builder().crontabExpression("0 3 * * *").build()

        val body = params._body()

        assertThat(body.crontabExpression()).isEqualTo("0 3 * * *")
    }
}
