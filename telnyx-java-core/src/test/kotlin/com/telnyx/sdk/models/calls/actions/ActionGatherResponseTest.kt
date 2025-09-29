// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherResponseTest {

    @Test
    fun create() {
        val actionGatherResponse =
            ActionGatherResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionGatherResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionGatherResponse =
            ActionGatherResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionGatherResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionGatherResponse),
                jacksonTypeRef<ActionGatherResponse>(),
            )

        assertThat(roundtrippedActionGatherResponse).isEqualTo(actionGatherResponse)
    }
}
