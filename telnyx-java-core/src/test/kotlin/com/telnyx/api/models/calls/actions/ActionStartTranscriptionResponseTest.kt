// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartTranscriptionResponseTest {

    @Test
    fun create() {
        val actionStartTranscriptionResponse =
            ActionStartTranscriptionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartTranscriptionResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartTranscriptionResponse =
            ActionStartTranscriptionResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartTranscriptionResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartTranscriptionResponse),
                jacksonTypeRef<ActionStartTranscriptionResponse>(),
            )

        assertThat(roundtrippedActionStartTranscriptionResponse)
            .isEqualTo(actionStartTranscriptionResponse)
    }
}
