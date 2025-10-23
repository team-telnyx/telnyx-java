// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopForkingResponseTest {

    @Test
    fun create() {
        val actionStopForkingResponse =
            ActionStopForkingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopForkingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopForkingResponse =
            ActionStopForkingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopForkingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopForkingResponse),
                jacksonTypeRef<ActionStopForkingResponse>(),
            )

        assertThat(roundtrippedActionStopForkingResponse).isEqualTo(actionStopForkingResponse)
    }
}
