// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioRunScenariosResponseTest {

    @Test
    fun create() {
        val scenarioRunScenariosResponse =
            ScenarioRunScenariosResponse.builder().id(10119L).status("in_queue").build()

        assertThat(scenarioRunScenariosResponse.id()).isEqualTo(10119L)
        assertThat(scenarioRunScenariosResponse.status()).isEqualTo("in_queue")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioRunScenariosResponse =
            ScenarioRunScenariosResponse.builder().id(10119L).status("in_queue").build()

        val roundtrippedScenarioRunScenariosResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioRunScenariosResponse),
                jacksonTypeRef<ScenarioRunScenariosResponse>(),
            )

        assertThat(roundtrippedScenarioRunScenariosResponse).isEqualTo(scenarioRunScenariosResponse)
    }
}
