// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionPayResponseTest {

    @Test
    fun create() {
        val actionPayResponse =
            ActionPayResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionPayResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionPayResponse =
            ActionPayResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionPayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionPayResponse),
                jacksonTypeRef<ActionPayResponse>(),
            )

        assertThat(roundtrippedActionPayResponse).isEqualTo(actionPayResponse)
    }
}
