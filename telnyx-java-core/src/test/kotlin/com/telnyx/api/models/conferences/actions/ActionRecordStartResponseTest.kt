// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordStartResponseTest {

    @Test
    fun create() {
        val actionRecordStartResponse =
            ActionRecordStartResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionRecordStartResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRecordStartResponse =
            ActionRecordStartResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionRecordStartResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRecordStartResponse),
                jacksonTypeRef<ActionRecordStartResponse>(),
            )

        assertThat(roundtrippedActionRecordStartResponse).isEqualTo(actionRecordStartResponse)
    }
}
