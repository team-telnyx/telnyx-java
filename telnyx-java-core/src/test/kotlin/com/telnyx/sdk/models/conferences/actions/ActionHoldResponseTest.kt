// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionHoldResponseTest {

    @Test
    fun create() {
        val actionHoldResponse =
            ActionHoldResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionHoldResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionHoldResponse =
            ActionHoldResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionHoldResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionHoldResponse),
                jacksonTypeRef<ActionHoldResponse>(),
            )

        assertThat(roundtrippedActionHoldResponse).isEqualTo(actionHoldResponse)
    }
}
