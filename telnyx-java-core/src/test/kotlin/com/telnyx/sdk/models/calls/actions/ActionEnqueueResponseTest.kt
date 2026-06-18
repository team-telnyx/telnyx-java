// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEnqueueResponseTest {

    @Test
    fun create() {
        val actionEnqueueResponse =
            ActionEnqueueResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionEnqueueResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionEnqueueResponse =
            ActionEnqueueResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionEnqueueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionEnqueueResponse),
                jacksonTypeRef<ActionEnqueueResponse>(),
            )

        assertThat(roundtrippedActionEnqueueResponse).isEqualTo(actionEnqueueResponse)
    }
}
