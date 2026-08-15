// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.meetingsessions.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionAcceptedResponseTest {

    @Test
    fun create() {
        val actionAcceptedResponse = ActionAcceptedResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionAcceptedResponse = ActionAcceptedResponse.builder().build()

        val roundtrippedActionAcceptedResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionAcceptedResponse),
                jacksonTypeRef<ActionAcceptedResponse>(),
            )

        assertThat(roundtrippedActionAcceptedResponse).isEqualTo(actionAcceptedResponse)
    }
}
