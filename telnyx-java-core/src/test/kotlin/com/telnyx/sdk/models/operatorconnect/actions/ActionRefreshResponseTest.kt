// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.operatorconnect.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionRefreshResponseTest {

    @Test
    fun create() {
        val actionRefreshResponse =
            ActionRefreshResponse.builder()
                .message("Operator connect refresh already in progress")
                .success(true)
                .build()

        assertThat(actionRefreshResponse.message())
            .contains("Operator connect refresh already in progress")
        assertThat(actionRefreshResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionRefreshResponse =
            ActionRefreshResponse.builder()
                .message("Operator connect refresh already in progress")
                .success(true)
                .build()

        val roundtrippedActionRefreshResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionRefreshResponse),
                jacksonTypeRef<ActionRefreshResponse>(),
            )

        assertThat(roundtrippedActionRefreshResponse).isEqualTo(actionRefreshResponse)
    }
}
