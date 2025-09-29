// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.rooms.sessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionKickResponseTest {

    @Test
    fun create() {
        val actionKickResponse =
            ActionKickResponse.builder()
                .data(ActionKickResponse.Data.builder().result("ok").build())
                .build()

        assertThat(actionKickResponse.data())
            .contains(ActionKickResponse.Data.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionKickResponse =
            ActionKickResponse.builder()
                .data(ActionKickResponse.Data.builder().result("ok").build())
                .build()

        val roundtrippedActionKickResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionKickResponse),
                jacksonTypeRef<ActionKickResponse>(),
            )

        assertThat(roundtrippedActionKickResponse).isEqualTo(actionKickResponse)
    }
}
