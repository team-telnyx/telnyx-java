// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartNoiseSuppressionResponseTest {

    @Test
    fun create() {
        val actionStartNoiseSuppressionResponse =
            ActionStartNoiseSuppressionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartNoiseSuppressionResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartNoiseSuppressionResponse =
            ActionStartNoiseSuppressionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartNoiseSuppressionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartNoiseSuppressionResponse),
                jacksonTypeRef<ActionStartNoiseSuppressionResponse>(),
            )

        assertThat(roundtrippedActionStartNoiseSuppressionResponse)
            .isEqualTo(actionStartNoiseSuppressionResponse)
    }
}
