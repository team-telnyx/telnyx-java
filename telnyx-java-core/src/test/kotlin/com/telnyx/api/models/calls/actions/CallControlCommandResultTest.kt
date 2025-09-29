// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.calls.actions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CallControlCommandResultTest {

    @Test
    fun create() {
        val callControlCommandResult = CallControlCommandResult.builder().result("ok").build()

        assertThat(callControlCommandResult.result()).contains("ok")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val callControlCommandResult = CallControlCommandResult.builder().result("ok").build()

        val roundtrippedCallControlCommandResult =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(callControlCommandResult),
                jacksonTypeRef<CallControlCommandResult>(),
            )

        assertThat(roundtrippedCallControlCommandResult).isEqualTo(callControlCommandResult)
    }
}
