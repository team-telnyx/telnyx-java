// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionMuteResponseTest {

    @Test
    fun create() {
        val actionMuteResponse =
            ActionMuteResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionMuteResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionMuteResponse =
            ActionMuteResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionMuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionMuteResponse),
                jacksonTypeRef<ActionMuteResponse>(),
            )

        assertThat(roundtrippedActionMuteResponse).isEqualTo(actionMuteResponse)
    }
}
