// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionLeaveQueueResponseTest {

    @Test
    fun create() {
        val actionLeaveQueueResponse =
            ActionLeaveQueueResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionLeaveQueueResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionLeaveQueueResponse =
            ActionLeaveQueueResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionLeaveQueueResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionLeaveQueueResponse),
                jacksonTypeRef<ActionLeaveQueueResponse>(),
            )

        assertThat(roundtrippedActionLeaveQueueResponse).isEqualTo(actionLeaveQueueResponse)
    }
}
