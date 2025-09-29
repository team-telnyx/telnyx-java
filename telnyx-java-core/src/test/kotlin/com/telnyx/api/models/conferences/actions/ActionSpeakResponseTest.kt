// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionSpeakResponseTest {

    @Test
    fun create() {
        val actionSpeakResponse =
            ActionSpeakResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionSpeakResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionSpeakResponse =
            ActionSpeakResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionSpeakResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionSpeakResponse),
                jacksonTypeRef<ActionSpeakResponse>(),
            )

        assertThat(roundtrippedActionSpeakResponse).isEqualTo(actionSpeakResponse)
    }
}
