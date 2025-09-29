// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionPlayResponseTest {

    @Test
    fun create() {
        val actionPlayResponse =
            ActionPlayResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionPlayResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionPlayResponse =
            ActionPlayResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionPlayResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionPlayResponse),
                jacksonTypeRef<ActionPlayResponse>(),
            )

        assertThat(roundtrippedActionPlayResponse).isEqualTo(actionPlayResponse)
    }
}
