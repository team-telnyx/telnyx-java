// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.faxes.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRefreshResponseTest {

    @Test
    fun create() {
        val actionRefreshResponse =
            ActionRefreshResponse.builder()
                .data(ActionRefreshResponse.Data.builder().result("ok").build())
                .build()

        assertThat(actionRefreshResponse.data())
            .contains(ActionRefreshResponse.Data.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRefreshResponse =
            ActionRefreshResponse.builder()
                .data(ActionRefreshResponse.Data.builder().result("ok").build())
                .build()

        val roundtrippedActionRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRefreshResponse),
                jacksonTypeRef<ActionRefreshResponse>(),
            )

        assertThat(roundtrippedActionRefreshResponse).isEqualTo(actionRefreshResponse)
    }
}
