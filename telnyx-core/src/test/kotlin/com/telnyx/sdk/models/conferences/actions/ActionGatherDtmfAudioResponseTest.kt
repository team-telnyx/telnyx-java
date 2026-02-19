// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionGatherDtmfAudioResponseTest {

    @Test
    fun create() {
        val actionGatherDtmfAudioResponse =
            ActionGatherDtmfAudioResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionGatherDtmfAudioResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionGatherDtmfAudioResponse =
            ActionGatherDtmfAudioResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionGatherDtmfAudioResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionGatherDtmfAudioResponse),
                jacksonTypeRef<ActionGatherDtmfAudioResponse>(),
            )

        assertThat(roundtrippedActionGatherDtmfAudioResponse)
            .isEqualTo(actionGatherDtmfAudioResponse)
    }
}
