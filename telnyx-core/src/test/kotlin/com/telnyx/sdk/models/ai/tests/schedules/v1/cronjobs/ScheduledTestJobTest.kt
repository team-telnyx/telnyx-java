// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.schedules.v1.cronjobs

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScheduledTestJobTest {

    @Test
    fun create() {
        val scheduledTestJob =
            ScheduledTestJob.builder()
                .id(1188L)
                .agent(1259L)
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .crontabExpression("0 3 * * *")
                .isActive(true)
                .name("Nightly regression")
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .executionMode("voice")
                .frequency(1L)
                .notifyOn(ScheduledTestJob.NotifyOn.FAILURE)
                .addPersonality(4643L)
                .personality(null)
                .runAsText(false)
                .addScenarioId(9512L)
                .addScenariosData(
                    ScheduledTestJob.ScenariosData.builder()
                        .id(9512L)
                        .agent(1259L)
                        .name("Refund escalation flow")
                        .personality(4643L)
                        .personalityName("Interruptive (High)")
                        .build()
                )
                .addTag("regression")
                .timezone("America/Chicago")
                .build()

        assertThat(scheduledTestJob.id()).isEqualTo(1188L)
        assertThat(scheduledTestJob.agent()).isEqualTo(1259L)
        assertThat(scheduledTestJob.createdAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
        assertThat(scheduledTestJob.crontabExpression()).isEqualTo("0 3 * * *")
        assertThat(scheduledTestJob.isActive()).isEqualTo(true)
        assertThat(scheduledTestJob.name()).isEqualTo("Nightly regression")
        assertThat(scheduledTestJob.updatedAt())
            .isEqualTo(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
        assertThat(scheduledTestJob.executionMode()).contains("voice")
        assertThat(scheduledTestJob.frequency()).contains(1L)
        assertThat(scheduledTestJob.notifyOn()).contains(ScheduledTestJob.NotifyOn.FAILURE)
        assertThat(scheduledTestJob.personalities().getOrNull()).containsExactly(4643L)
        assertThat(scheduledTestJob.personality()).isEmpty
        assertThat(scheduledTestJob.runAsText()).contains(false)
        assertThat(scheduledTestJob.scenarioIds().getOrNull()).containsExactly(9512L)
        assertThat(scheduledTestJob.scenariosData().getOrNull())
            .containsExactly(
                ScheduledTestJob.ScenariosData.builder()
                    .id(9512L)
                    .agent(1259L)
                    .name("Refund escalation flow")
                    .personality(4643L)
                    .personalityName("Interruptive (High)")
                    .build()
            )
        assertThat(scheduledTestJob.tags().getOrNull()).containsExactly("regression")
        assertThat(scheduledTestJob.timezone()).contains("America/Chicago")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scheduledTestJob =
            ScheduledTestJob.builder()
                .id(1188L)
                .agent(1259L)
                .createdAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .crontabExpression("0 3 * * *")
                .isActive(true)
                .name("Nightly regression")
                .updatedAt(OffsetDateTime.parse("2026-10-13T18:04:05.123456Z"))
                .executionMode("voice")
                .frequency(1L)
                .notifyOn(ScheduledTestJob.NotifyOn.FAILURE)
                .addPersonality(4643L)
                .personality(null)
                .runAsText(false)
                .addScenarioId(9512L)
                .addScenariosData(
                    ScheduledTestJob.ScenariosData.builder()
                        .id(9512L)
                        .agent(1259L)
                        .name("Refund escalation flow")
                        .personality(4643L)
                        .personalityName("Interruptive (High)")
                        .build()
                )
                .addTag("regression")
                .timezone("America/Chicago")
                .build()

        val roundtrippedScheduledTestJob =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scheduledTestJob),
                jacksonTypeRef<ScheduledTestJob>(),
            )

        assertThat(roundtrippedScheduledTestJob).isEqualTo(scheduledTestJob)
    }
}
