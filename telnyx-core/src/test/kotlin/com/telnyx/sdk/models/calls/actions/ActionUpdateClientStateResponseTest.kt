// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUpdateClientStateResponseTest {

    @Test
    fun create() {
        val actionUpdateClientStateResponse =
            ActionUpdateClientStateResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionUpdateClientStateResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionUpdateClientStateResponse =
            ActionUpdateClientStateResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionUpdateClientStateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionUpdateClientStateResponse),
                jacksonTypeRef<ActionUpdateClientStateResponse>(),
            )

        assertThat(roundtrippedActionUpdateClientStateResponse)
            .isEqualTo(actionUpdateClientStateResponse)
    }
}
