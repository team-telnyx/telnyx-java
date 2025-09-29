// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rooms.sessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionUnmuteResponseTest {

    @Test
    fun create() {
        val actionUnmuteResponse =
            ActionUnmuteResponse.builder()
                .data(ActionUnmuteResponse.Data.builder().result("ok").build())
                .build()

        assertThat(actionUnmuteResponse.data())
            .contains(ActionUnmuteResponse.Data.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionUnmuteResponse =
            ActionUnmuteResponse.builder()
                .data(ActionUnmuteResponse.Data.builder().result("ok").build())
                .build()

        val roundtrippedActionUnmuteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionUnmuteResponse),
                jacksonTypeRef<ActionUnmuteResponse>(),
            )

        assertThat(roundtrippedActionUnmuteResponse).isEqualTo(actionUnmuteResponse)
    }
}
