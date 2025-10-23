// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRejectResponseTest {

    @Test
    fun create() {
        val actionRejectResponse =
            ActionRejectResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionRejectResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRejectResponse =
            ActionRejectResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionRejectResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRejectResponse),
                jacksonTypeRef<ActionRejectResponse>(),
            )

        assertThat(roundtrippedActionRejectResponse).isEqualTo(actionRejectResponse)
    }
}
