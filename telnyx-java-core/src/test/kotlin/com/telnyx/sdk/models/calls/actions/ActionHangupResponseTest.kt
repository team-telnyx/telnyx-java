// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionHangupResponseTest {

    @Test
    fun create() {
        val actionHangupResponse =
            ActionHangupResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionHangupResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionHangupResponse =
            ActionHangupResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionHangupResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionHangupResponse),
                jacksonTypeRef<ActionHangupResponse>(),
            )

        assertThat(roundtrippedActionHangupResponse).isEqualTo(actionHangupResponse)
    }
}
