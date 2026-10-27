// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tests.testframework.v1.aiagents

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AiagentDeleteResponseTest {

    @Test
    fun create() {
        val aiagentDeleteResponse = AiagentDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val aiagentDeleteResponse = AiagentDeleteResponse.builder().build()

        val roundtrippedAiagentDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(aiagentDeleteResponse),
                jacksonTypeRef<AiagentDeleteResponse>(),
            )

        assertThat(roundtrippedAiagentDeleteResponse).isEqualTo(aiagentDeleteResponse)
    }
}
