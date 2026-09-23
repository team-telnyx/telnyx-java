// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.botsignup

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SuccessResponseTest {

    @Test
    fun create() {
        val successResponse =
            SuccessResponse.builder()
                .message("A one-time sign-in link has been sent to your email address.")
                .success(true)
                .build()

        assertThat(successResponse.message())
            .isEqualTo("A one-time sign-in link has been sent to your email address.")
        assertThat(successResponse.success()).isEqualTo(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val successResponse =
            SuccessResponse.builder()
                .message("A one-time sign-in link has been sent to your email address.")
                .success(true)
                .build()

        val roundtrippedSuccessResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(successResponse),
                jacksonTypeRef<SuccessResponse>(),
            )

        assertThat(roundtrippedSuccessResponse).isEqualTo(successResponse)
    }
}
