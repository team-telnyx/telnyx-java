// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAddAiAssistantMessagesResponseTest {

    @Test
    fun create() {
        val actionAddAiAssistantMessagesResponse =
            ActionAddAiAssistantMessagesResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionAddAiAssistantMessagesResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionAddAiAssistantMessagesResponse =
            ActionAddAiAssistantMessagesResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionAddAiAssistantMessagesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionAddAiAssistantMessagesResponse),
                jacksonTypeRef<ActionAddAiAssistantMessagesResponse>(),
            )

        assertThat(roundtrippedActionAddAiAssistantMessagesResponse)
            .isEqualTo(actionAddAiAssistantMessagesResponse)
    }
}
