// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordResumeResponseTest {

    @Test
    fun create() {
        val actionRecordResumeResponse =
            ActionRecordResumeResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionRecordResumeResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRecordResumeResponse =
            ActionRecordResumeResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionRecordResumeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRecordResumeResponse),
                jacksonTypeRef<ActionRecordResumeResponse>(),
            )

        assertThat(roundtrippedActionRecordResumeResponse).isEqualTo(actionRecordResumeResponse)
    }
}
