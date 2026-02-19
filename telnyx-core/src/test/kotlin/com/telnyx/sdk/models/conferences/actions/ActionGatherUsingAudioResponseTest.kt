// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherUsingAudioResponseTest {

    @Test
    fun create() {
        val actionGatherUsingAudioResponse =
            ActionGatherUsingAudioResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionGatherUsingAudioResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionGatherUsingAudioResponse =
            ActionGatherUsingAudioResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionGatherUsingAudioResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionGatherUsingAudioResponse),
                jacksonTypeRef<ActionGatherUsingAudioResponse>(),
            )

        assertThat(roundtrippedActionGatherUsingAudioResponse)
            .isEqualTo(actionGatherUsingAudioResponse)
    }
}
