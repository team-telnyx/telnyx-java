// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AssistantMcpServerTest {

    @Test
    fun create() {
        val assistantMcpServer =
            AssistantMcpServer.builder().id("id").addAllowedTool("string").build()

        assertThat(assistantMcpServer.id()).isEqualTo("id")
        assertThat(assistantMcpServer.allowedTools().getOrNull()).containsExactly("string")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val assistantMcpServer =
            AssistantMcpServer.builder().id("id").addAllowedTool("string").build()

        val roundtrippedAssistantMcpServer =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(assistantMcpServer),
                jacksonTypeRef<AssistantMcpServer>(),
            )

        assertThat(roundtrippedAssistantMcpServer).isEqualTo(assistantMcpServer)
    }
}
