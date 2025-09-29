// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HangupToolParamsTest {

    @Test
    fun create() {
        val hangupToolParams = HangupToolParams.builder().description("description").build()

        assertThat(hangupToolParams.description()).contains("description")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hangupToolParams = HangupToolParams.builder().description("description").build()

        val roundtrippedHangupToolParams =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hangupToolParams),
                jacksonTypeRef<HangupToolParams>(),
            )

        assertThat(roundtrippedHangupToolParams).isEqualTo(hangupToolParams)
    }
}
