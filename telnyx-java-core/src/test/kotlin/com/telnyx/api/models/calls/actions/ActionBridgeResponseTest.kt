// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionBridgeResponseTest {

    @Test
    fun create() {
        val actionBridgeResponse =
            ActionBridgeResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionBridgeResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionBridgeResponse =
            ActionBridgeResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionBridgeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionBridgeResponse),
                jacksonTypeRef<ActionBridgeResponse>(),
            )

        assertThat(roundtrippedActionBridgeResponse).isEqualTo(actionBridgeResponse)
    }
}
