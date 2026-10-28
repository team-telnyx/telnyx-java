// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioRetrieveGenerateProgressResponseTest {

    @Test
    fun create() {
        val scenarioRetrieveGenerateProgressResponse =
            ScenarioRetrieveGenerateProgressResponse.builder()
                .completedScenarios(5L)
                .failedScenarios(0L)
                .addScenariosList(
                    ScenarioRetrieveGenerateProgressResponse.ScenariosList.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .totalScenarios(5L)
                .build()

        assertThat(scenarioRetrieveGenerateProgressResponse.completedScenarios()).contains(5L)
        assertThat(scenarioRetrieveGenerateProgressResponse.failedScenarios()).contains(0L)
        assertThat(scenarioRetrieveGenerateProgressResponse.scenariosList().getOrNull())
            .containsExactly(
                ScenarioRetrieveGenerateProgressResponse.ScenariosList.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(scenarioRetrieveGenerateProgressResponse.totalScenarios()).contains(5L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioRetrieveGenerateProgressResponse =
            ScenarioRetrieveGenerateProgressResponse.builder()
                .completedScenarios(5L)
                .failedScenarios(0L)
                .addScenariosList(
                    ScenarioRetrieveGenerateProgressResponse.ScenariosList.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .totalScenarios(5L)
                .build()

        val roundtrippedScenarioRetrieveGenerateProgressResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioRetrieveGenerateProgressResponse),
                jacksonTypeRef<ScenarioRetrieveGenerateProgressResponse>(),
            )

        assertThat(roundtrippedScenarioRetrieveGenerateProgressResponse)
            .isEqualTo(scenarioRetrieveGenerateProgressResponse)
    }
}
