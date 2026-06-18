// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolListToolsResponseTest {

    @Test
    fun create() {
        val toolListToolsResponse = ToolListToolsResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolListToolsResponse = ToolListToolsResponse.builder().build()

        val roundtrippedToolListToolsResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolListToolsResponse),
                jacksonTypeRef<ToolListToolsResponse>(),
            )

        assertThat(roundtrippedToolListToolsResponse).isEqualTo(toolListToolsResponse)
    }
}
