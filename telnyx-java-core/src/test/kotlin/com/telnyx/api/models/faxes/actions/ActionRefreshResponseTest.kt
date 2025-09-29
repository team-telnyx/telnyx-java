// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.faxes.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRefreshResponseTest {

    @Test
    fun create() {
        val actionRefreshResponse = ActionRefreshResponse.builder().result("ok").build()

        assertThat(actionRefreshResponse.result()).contains("ok")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRefreshResponse = ActionRefreshResponse.builder().result("ok").build()

        val roundtrippedActionRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRefreshResponse),
                jacksonTypeRef<ActionRefreshResponse>(),
            )

        assertThat(roundtrippedActionRefreshResponse).isEqualTo(actionRefreshResponse)
    }
}
