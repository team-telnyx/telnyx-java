// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolUpdateToolResponseTest {

    @Test
    fun create() {
        val toolUpdateToolResponse = ToolUpdateToolResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolUpdateToolResponse = ToolUpdateToolResponse.builder().build()

        val roundtrippedToolUpdateToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolUpdateToolResponse),
                jacksonTypeRef<ToolUpdateToolResponse>(),
            )

        assertThat(roundtrippedToolUpdateToolResponse).isEqualTo(toolUpdateToolResponse)
    }
}
