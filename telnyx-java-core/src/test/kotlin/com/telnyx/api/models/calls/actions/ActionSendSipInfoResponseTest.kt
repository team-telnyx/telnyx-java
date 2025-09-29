// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSendSipInfoResponseTest {

    @Test
    fun create() {
        val actionSendSipInfoResponse =
            ActionSendSipInfoResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionSendSipInfoResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionSendSipInfoResponse =
            ActionSendSipInfoResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionSendSipInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionSendSipInfoResponse),
                jacksonTypeRef<ActionSendSipInfoResponse>(),
            )

        assertThat(roundtrippedActionSendSipInfoResponse).isEqualTo(actionSendSipInfoResponse)
    }
}
