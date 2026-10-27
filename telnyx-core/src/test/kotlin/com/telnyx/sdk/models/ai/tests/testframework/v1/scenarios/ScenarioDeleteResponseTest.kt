// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioDeleteResponseTest {

    @Test
    fun create() {
        val scenarioDeleteResponse = ScenarioDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioDeleteResponse = ScenarioDeleteResponse.builder().build()

        val roundtrippedScenarioDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioDeleteResponse),
                jacksonTypeRef<ScenarioDeleteResponse>(),
            )

        assertThat(roundtrippedScenarioDeleteResponse).isEqualTo(scenarioDeleteResponse)
    }
}
