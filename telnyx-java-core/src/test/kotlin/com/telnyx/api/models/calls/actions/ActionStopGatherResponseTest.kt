// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopGatherResponseTest {

    @Test
    fun create() {
        val actionStopGatherResponse =
            ActionStopGatherResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopGatherResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopGatherResponse =
            ActionStopGatherResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopGatherResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopGatherResponse),
                jacksonTypeRef<ActionStopGatherResponse>(),
            )

        assertThat(roundtrippedActionStopGatherResponse).isEqualTo(actionStopGatherResponse)
    }
}
