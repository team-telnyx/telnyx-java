// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionCancelResponseTest {

    @Test
    fun create() {
        val actionCancelResponse = ActionCancelResponse.builder().result("ok").build()

        assertThat(actionCancelResponse.result()).contains("ok")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionCancelResponse = ActionCancelResponse.builder().result("ok").build()

        val roundtrippedActionCancelResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionCancelResponse),
                jacksonTypeRef<ActionCancelResponse>(),
            )

        assertThat(roundtrippedActionCancelResponse).isEqualTo(actionCancelResponse)
    }
}
