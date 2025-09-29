// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ai.assistants

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HangupToolTest {

    @Test
    fun create() {
        val hangupTool =
            HangupTool.builder()
                .hangup(HangupToolParams.builder().description("description").build())
                .type(HangupTool.Type.HANGUP)
                .build()

        assertThat(hangupTool.hangup())
            .isEqualTo(HangupToolParams.builder().description("description").build())
        assertThat(hangupTool.type()).isEqualTo(HangupTool.Type.HANGUP)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hangupTool =
            HangupTool.builder()
                .hangup(HangupToolParams.builder().description("description").build())
                .type(HangupTool.Type.HANGUP)
                .build()

        val roundtrippedHangupTool =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hangupTool),
                jacksonTypeRef<HangupTool>(),
            )

        assertThat(roundtrippedHangupTool).isEqualTo(hangupTool)
    }
}
