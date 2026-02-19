// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionEndResponseTest {

    @Test
    fun create() {
        val actionEndResponse =
            ActionEndResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionEndResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionEndResponse =
            ActionEndResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionEndResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionEndResponse),
                jacksonTypeRef<ActionEndResponse>(),
            )

        assertThat(roundtrippedActionEndResponse).isEqualTo(actionEndResponse)
    }
}
