// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionTransferResponseTest {

    @Test
    fun create() {
        val actionTransferResponse =
            ActionTransferResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionTransferResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionTransferResponse =
            ActionTransferResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionTransferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionTransferResponse),
                jacksonTypeRef<ActionTransferResponse>(),
            )

        assertThat(roundtrippedActionTransferResponse).isEqualTo(actionTransferResponse)
    }
}
