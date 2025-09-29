// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartForkingResponseTest {

    @Test
    fun create() {
        val actionStartForkingResponse =
            ActionStartForkingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartForkingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartForkingResponse =
            ActionStartForkingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartForkingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartForkingResponse),
                jacksonTypeRef<ActionStartForkingResponse>(),
            )

        assertThat(roundtrippedActionStartForkingResponse).isEqualTo(actionStartForkingResponse)
    }
}
