// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStopResponseTest {

    @Test
    fun create() {
        val actionStopResponse =
            ActionStopResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStopResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStopResponse =
            ActionStopResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStopResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStopResponse),
                jacksonTypeRef<ActionStopResponse>(),
            )

        assertThat(roundtrippedActionStopResponse).isEqualTo(actionStopResponse)
    }
}
