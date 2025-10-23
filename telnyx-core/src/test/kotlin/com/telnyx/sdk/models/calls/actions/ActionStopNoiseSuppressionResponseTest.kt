// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopNoiseSuppressionResponseTest {

    @Test
    fun create() {
        val actionStopNoiseSuppressionResponse =
            ActionStopNoiseSuppressionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopNoiseSuppressionResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopNoiseSuppressionResponse =
            ActionStopNoiseSuppressionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopNoiseSuppressionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopNoiseSuppressionResponse),
                jacksonTypeRef<ActionStopNoiseSuppressionResponse>(),
            )

        assertThat(roundtrippedActionStopNoiseSuppressionResponse)
            .isEqualTo(actionStopNoiseSuppressionResponse)
    }
}
