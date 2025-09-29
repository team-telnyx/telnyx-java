// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartPlaybackResponseTest {

    @Test
    fun create() {
        val actionStartPlaybackResponse =
            ActionStartPlaybackResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartPlaybackResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartPlaybackResponse =
            ActionStartPlaybackResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartPlaybackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartPlaybackResponse),
                jacksonTypeRef<ActionStartPlaybackResponse>(),
            )

        assertThat(roundtrippedActionStartPlaybackResponse).isEqualTo(actionStartPlaybackResponse)
    }
}
