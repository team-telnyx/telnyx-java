// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartRecordingResponseTest {

    @Test
    fun create() {
        val actionStartRecordingResponse =
            ActionStartRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartRecordingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartRecordingResponse =
            ActionStartRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartRecordingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartRecordingResponse),
                jacksonTypeRef<ActionStartRecordingResponse>(),
            )

        assertThat(roundtrippedActionStartRecordingResponse).isEqualTo(actionStartRecordingResponse)
    }
}
