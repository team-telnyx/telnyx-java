// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ActionStartSiprecResponseTest {

    @Test
    fun create() {
        val actionStartSiprecResponse =
            ActionStartSiprecResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        assertThat(actionStartSiprecResponse.data())
            .contains(CallControlCommandResult.builder().result("ok").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val actionStartSiprecResponse =
            ActionStartSiprecResponse.builder()
                .data(CallControlCommandResult.builder().result("ok").build())
                .build()

        val roundtrippedActionStartSiprecResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(actionStartSiprecResponse),
                jacksonTypeRef<ActionStartSiprecResponse>(),
            )

        assertThat(roundtrippedActionStartSiprecResponse).isEqualTo(actionStartSiprecResponse)
    }
}
