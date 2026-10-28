// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.telnyx.sdk.core.JsonValue
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioRunScenariosParamsTest {

    @Test
    fun create() {
        ScenarioRunScenariosParams.builder()
            .agentId(1259L)
            .agentNumber("agent_number")
            .assistantId("assistant_id")
            .concurrencyLimit(3L)
            .frequency(0L)
            .mode(ScenarioRunScenariosParams.Mode.SAME_NUMBER)
            .name("name")
            .outboundPhoneNumber("outbound_phone_number")
            .addPersonalityId(0L)
            .scenariosOfJsonValues(listOf(JsonValue.from(9512)))
            .addTag("regression")
            .addTestProfileId(0L)
            .build()
    }

    @Test
    fun body() {
        val params =
            ScenarioRunScenariosParams.builder()
                .agentId(1259L)
                .agentNumber("agent_number")
                .assistantId("assistant_id")
                .concurrencyLimit(3L)
                .frequency(0L)
                .mode(ScenarioRunScenariosParams.Mode.SAME_NUMBER)
                .name("name")
                .outboundPhoneNumber("outbound_phone_number")
                .addPersonalityId(0L)
                .scenariosOfJsonValues(listOf(JsonValue.from(9512)))
                .addTag("regression")
                .addTestProfileId(0L)
                .build()

        val body = params._body()

        assertThat(body.agentId()).contains(1259L)
        assertThat(body.agentNumber()).contains("agent_number")
        assertThat(body.assistantId()).contains("assistant_id")
        assertThat(body.concurrencyLimit()).contains(3L)
        assertThat(body.frequency()).contains(0L)
        assertThat(body.mode()).contains(ScenarioRunScenariosParams.Mode.SAME_NUMBER)
        assertThat(body.name()).contains("name")
        assertThat(body.outboundPhoneNumber()).contains("outbound_phone_number")
        assertThat(body.personalityIds().getOrNull()).containsExactly(0L)
        assertThat(body.scenarios())
            .contains(
                ScenarioRunScenariosParams.Scenarios.ofJsonValues(listOf(JsonValue.from(9512)))
            )
        assertThat(body.tags().getOrNull()).containsExactly("regression")
        assertThat(body.testProfileIds().getOrNull()).containsExactly(0L)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = ScenarioRunScenariosParams.builder().build()

        val body = params._body()
    }
}
