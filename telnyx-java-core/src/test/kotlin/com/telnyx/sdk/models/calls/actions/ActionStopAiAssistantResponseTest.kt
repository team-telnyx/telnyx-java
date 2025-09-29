// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopAiAssistantResponseTest {

    @Test
    fun create() {
        val actionStopAiAssistantResponse =
            ActionStopAiAssistantResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopAiAssistantResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopAiAssistantResponse =
            ActionStopAiAssistantResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopAiAssistantResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopAiAssistantResponse),
                jacksonTypeRef<ActionStopAiAssistantResponse>(),
            )

        assertThat(roundtrippedActionStopAiAssistantResponse)
            .isEqualTo(actionStopAiAssistantResponse)
    }
}
