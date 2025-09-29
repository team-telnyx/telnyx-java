// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordPauseResponseTest {

    @Test
    fun create() {
        val actionRecordPauseResponse =
            ActionRecordPauseResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionRecordPauseResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRecordPauseResponse =
            ActionRecordPauseResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionRecordPauseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRecordPauseResponse),
                jacksonTypeRef<ActionRecordPauseResponse>(),
            )

        assertThat(roundtrippedActionRecordPauseResponse).isEqualTo(actionRecordPauseResponse)
    }
}
