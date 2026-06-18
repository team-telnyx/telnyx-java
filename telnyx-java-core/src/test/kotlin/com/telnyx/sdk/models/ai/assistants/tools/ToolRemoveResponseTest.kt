// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolRemoveResponseTest {

    @Test
    fun create() {
        val toolRemoveResponse = ToolRemoveResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolRemoveResponse = ToolRemoveResponse.builder().build()

        val roundtrippedToolRemoveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolRemoveResponse),
                jacksonTypeRef<ToolRemoveResponse>(),
            )

        assertThat(roundtrippedToolRemoveResponse).isEqualTo(toolRemoveResponse)
    }
}
