// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionReferResponseTest {

    @Test
    fun create() {
        val actionReferResponse =
            ActionReferResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionReferResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionReferResponse =
            ActionReferResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionReferResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionReferResponse),
                jacksonTypeRef<ActionReferResponse>(),
            )

        assertThat(roundtrippedActionReferResponse).isEqualTo(actionReferResponse)
    }
}
