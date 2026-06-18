// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.tools

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ToolDeleteResponseTest {

    @Test
    fun create() {
        val toolDeleteResponse = ToolDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val toolDeleteResponse = ToolDeleteResponse.builder().build()

        val roundtrippedToolDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(toolDeleteResponse),
                jacksonTypeRef<ToolDeleteResponse>(),
            )

        assertThat(roundtrippedToolDeleteResponse).isEqualTo(toolDeleteResponse)
    }
}
