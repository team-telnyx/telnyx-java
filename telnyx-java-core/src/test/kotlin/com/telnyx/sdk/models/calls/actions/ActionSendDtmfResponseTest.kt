// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendDtmfResponseTest {

    @Test
    fun create() {
        val actionSendDtmfResponse =
            ActionSendDtmfResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionSendDtmfResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionSendDtmfResponse =
            ActionSendDtmfResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionSendDtmfResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionSendDtmfResponse),
                jacksonTypeRef<ActionSendDtmfResponse>(),
            )

        assertThat(roundtrippedActionSendDtmfResponse).isEqualTo(actionSendDtmfResponse)
    }
}
