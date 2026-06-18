// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolCreateToolResponseTest {

    @Test
    fun create() {
        val toolCreateToolResponse = ToolCreateToolResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolCreateToolResponse = ToolCreateToolResponse.builder().build()

        val roundtrippedToolCreateToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolCreateToolResponse),
                jacksonTypeRef<ToolCreateToolResponse>(),
            )

        assertThat(roundtrippedToolCreateToolResponse).isEqualTo(toolCreateToolResponse)
    }
}
