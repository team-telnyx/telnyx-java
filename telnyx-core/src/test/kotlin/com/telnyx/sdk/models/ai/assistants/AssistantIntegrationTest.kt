// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantIntegrationTest {

    @Test
    fun create() {
        val assistantIntegration =
            AssistantIntegration.builder()
                .integrationId("integration_id")
                .addAllowedList("string")
                .build()

        assertThat(assistantIntegration.integrationId()).isEqualTo("integration_id")
        assertThat(assistantIntegration.allowedList().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantIntegration =
            AssistantIntegration.builder()
                .integrationId("integration_id")
                .addAllowedList("string")
                .build()

        val roundtrippedAssistantIntegration =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantIntegration),
                jacksonTypeRef<AssistantIntegration>(),
            )

        assertThat(roundtrippedAssistantIntegration).isEqualTo(assistantIntegration)
    }
}
