// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.missions.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolGetToolResponseTest {

    @Test
    fun create() {
        val toolGetToolResponse = ToolGetToolResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolGetToolResponse = ToolGetToolResponse.builder().build()

        val roundtrippedToolGetToolResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolGetToolResponse),
                jacksonTypeRef<ToolGetToolResponse>(),
            )

        assertThat(roundtrippedToolGetToolResponse).isEqualTo(toolGetToolResponse)
    }
}
