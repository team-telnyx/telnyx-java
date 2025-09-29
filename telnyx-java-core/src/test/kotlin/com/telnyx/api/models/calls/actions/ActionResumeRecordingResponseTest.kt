// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionResumeRecordingResponseTest {

    @Test
    fun create() {
        val actionResumeRecordingResponse =
            ActionResumeRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionResumeRecordingResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionResumeRecordingResponse =
            ActionResumeRecordingResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionResumeRecordingResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionResumeRecordingResponse),
                jacksonTypeRef<ActionResumeRecordingResponse>(),
            )

        assertThat(roundtrippedActionResumeRecordingResponse)
            .isEqualTo(actionResumeRecordingResponse)
    }
}
