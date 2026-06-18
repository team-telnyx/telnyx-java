// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolAddResponseTest {

    @Test
    fun create() {
        val toolAddResponse = ToolAddResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolAddResponse = ToolAddResponse.builder().build()

        val roundtrippedToolAddResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolAddResponse),
                jacksonTypeRef<ToolAddResponse>(),
            )

        assertThat(roundtrippedToolAddResponse).isEqualTo(toolAddResponse)
    }
}
