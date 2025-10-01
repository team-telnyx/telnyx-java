// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopSiprecResponseTest {

    @Test
    fun create() {
        val actionStopSiprecResponse =
            ActionStopSiprecResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopSiprecResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopSiprecResponse =
            ActionStopSiprecResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopSiprecResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopSiprecResponse),
                jacksonTypeRef<ActionStopSiprecResponse>(),
            )

        assertThat(roundtrippedActionStopSiprecResponse).isEqualTo(actionStopSiprecResponse)
    }
}
