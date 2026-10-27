// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.scenarios

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ScenarioRetrieveScenarioAgentProgressResponseTest {

    @Test
    fun create() {
        val scenarioRetrieveScenarioAgentProgressResponse =
            ScenarioRetrieveScenarioAgentProgressResponse.builder()
                .error(null)
                .mode("improve")
                .progressId("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
                .result(
                    ScenarioRetrieveScenarioAgentProgressResponse.Result.builder()
                        .cancelled(true)
                        .addClarificationQuestion(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result
                                .ClarificationQuestion
                                .builder()
                                .question("question")
                                .build()
                        )
                        .addConversationHistory(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result.ConversationHistory
                                .builder()
                                .content("content")
                                .role("role")
                                .timestamp("timestamp")
                                .build()
                        )
                        .message("Applied changes to 2 scenarios.")
                        .needsClarification(true)
                        .sessionId(0L)
                        .success(true)
                        .addUpdatedScenario(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result.UpdatedScenario
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .sessionId(417L)
                .status("completed")
                .build()

        assertThat(scenarioRetrieveScenarioAgentProgressResponse.error()).isEmpty
        assertThat(scenarioRetrieveScenarioAgentProgressResponse.mode()).contains("improve")
        assertThat(scenarioRetrieveScenarioAgentProgressResponse.progressId())
            .contains("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
        assertThat(scenarioRetrieveScenarioAgentProgressResponse.result())
            .contains(
                ScenarioRetrieveScenarioAgentProgressResponse.Result.builder()
                    .cancelled(true)
                    .addClarificationQuestion(
                        ScenarioRetrieveScenarioAgentProgressResponse.Result.ClarificationQuestion
                            .builder()
                            .question("question")
                            .build()
                    )
                    .addConversationHistory(
                        ScenarioRetrieveScenarioAgentProgressResponse.Result.ConversationHistory
                            .builder()
                            .content("content")
                            .role("role")
                            .timestamp("timestamp")
                            .build()
                    )
                    .message("Applied changes to 2 scenarios.")
                    .needsClarification(true)
                    .sessionId(0L)
                    .success(true)
                    .addUpdatedScenario(
                        ScenarioRetrieveScenarioAgentProgressResponse.Result.UpdatedScenario
                            .builder()
                            .putAdditionalProperty("foo", JsonValue.from("bar"))
                            .build()
                    )
                    .build()
            )
        assertThat(scenarioRetrieveScenarioAgentProgressResponse.sessionId()).contains(417L)
        assertThat(scenarioRetrieveScenarioAgentProgressResponse.status()).contains("completed")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val scenarioRetrieveScenarioAgentProgressResponse =
            ScenarioRetrieveScenarioAgentProgressResponse.builder()
                .error(null)
                .mode("improve")
                .progressId("c8f5d2b3-4e5f-6a7b-9c0d-1f2a3b4c5d6e")
                .result(
                    ScenarioRetrieveScenarioAgentProgressResponse.Result.builder()
                        .cancelled(true)
                        .addClarificationQuestion(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result
                                .ClarificationQuestion
                                .builder()
                                .question("question")
                                .build()
                        )
                        .addConversationHistory(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result.ConversationHistory
                                .builder()
                                .content("content")
                                .role("role")
                                .timestamp("timestamp")
                                .build()
                        )
                        .message("Applied changes to 2 scenarios.")
                        .needsClarification(true)
                        .sessionId(0L)
                        .success(true)
                        .addUpdatedScenario(
                            ScenarioRetrieveScenarioAgentProgressResponse.Result.UpdatedScenario
                                .builder()
                                .putAdditionalProperty("foo", JsonValue.from("bar"))
                                .build()
                        )
                        .build()
                )
                .sessionId(417L)
                .status("completed")
                .build()

        val roundtrippedScenarioRetrieveScenarioAgentProgressResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(scenarioRetrieveScenarioAgentProgressResponse),
                jacksonTypeRef<ScenarioRetrieveScenarioAgentProgressResponse>(),
            )

        assertThat(roundtrippedScenarioRetrieveScenarioAgentProgressResponse)
            .isEqualTo(scenarioRetrieveScenarioAgentProgressResponse)
    }
}
