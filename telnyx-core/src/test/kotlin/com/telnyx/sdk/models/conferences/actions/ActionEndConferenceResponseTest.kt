// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEndConferenceResponseTest {

    @Test
    fun create() {
        val actionEndConferenceResponse =
            ActionEndConferenceResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionEndConferenceResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionEndConferenceResponse =
            ActionEndConferenceResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionEndConferenceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionEndConferenceResponse),
                jacksonTypeRef<ActionEndConferenceResponse>(),
            )

        assertThat(roundtrippedActionEndConferenceResponse).isEqualTo(actionEndConferenceResponse)
    }
}
