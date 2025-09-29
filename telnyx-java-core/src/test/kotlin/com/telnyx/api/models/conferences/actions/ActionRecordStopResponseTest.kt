// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRecordStopResponseTest {

    @Test
    fun create() {
        val actionRecordStopResponse =
            ActionRecordStopResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionRecordStopResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRecordStopResponse =
            ActionRecordStopResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionRecordStopResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRecordStopResponse),
                jacksonTypeRef<ActionRecordStopResponse>(),
            )

        assertThat(roundtrippedActionRecordStopResponse).isEqualTo(actionRecordStopResponse)
    }
}
