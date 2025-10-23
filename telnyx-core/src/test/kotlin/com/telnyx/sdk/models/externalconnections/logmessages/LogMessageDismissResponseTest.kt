// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.logmessages

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LogMessageDismissResponseTest {

    @Test
    fun create() {
        val logMessageDismissResponse = LogMessageDismissResponse.builder().success(true).build()

        assertThat(logMessageDismissResponse.success()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val logMessageDismissResponse = LogMessageDismissResponse.builder().success(true).build()

        val roundtrippedLogMessageDismissResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(logMessageDismissResponse),
                jacksonTypeRef<LogMessageDismissResponse>(),
            )

        assertThat(roundtrippedLogMessageDismissResponse).isEqualTo(logMessageDismissResponse)
    }
}
