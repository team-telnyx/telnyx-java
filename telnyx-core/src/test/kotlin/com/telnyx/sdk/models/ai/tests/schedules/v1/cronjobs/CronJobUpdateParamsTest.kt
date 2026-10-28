// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CronJobUpdateParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params = CronJobUpdateParams.builder().id(0L).build()

        assertThat(params._pathParam(0)).isEqualTo("0")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.agent()).contains(0L)
        assertThat(body.crontabExpression()).contains("0 4 * * *")
        assertThat(body.executionMode()).contains("execution_mode")
        assertThat(body.frequency()).contains(0L)
        assertThat(body.isActive()).contains(true)
        assertThat(body.name()).contains("Nightly regression - updated")
        assertThat(body.notifyOn()).contains(CronJobUpdateParams.NotifyOn.BOTH)
        assertThat(body.personalities().getOrNull()).containsExactly(0L)
        assertThat(body.runAsText()).contains(true)
        assertThat(body.scenarios().getOrNull()).containsExactly(0L)
        assertThat(body.tags().getOrNull()).containsExactly("string")
        assertThat(body.timezone()).contains("timezone")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = CronJobUpdateParams.builder().id(0L).build()

        val body = params._body()
    }
}
