// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.conferences.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUnholdResponseTest {

    @Test
    fun create() {
        val actionUnholdResponse =
            ActionUnholdResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionUnholdResponse.data())
            .contains(ConferenceCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionUnholdResponse =
            ActionUnholdResponse.builder()
                .data(ConferenceCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionUnholdResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionUnholdResponse),
                jacksonTypeRef<ActionUnholdResponse>(),
            )

        assertThat(roundtrippedActionUnholdResponse).isEqualTo(actionUnholdResponse)
    }
}
