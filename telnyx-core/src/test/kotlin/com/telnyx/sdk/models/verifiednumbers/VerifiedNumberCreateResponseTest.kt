// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberCreateResponseTest {

    @Test
    fun create() {
        val verifiedNumberCreateResponse =
            VerifiedNumberCreateResponse.builder()
                .phoneNumber("+15551234567")
                .verificationMethod("sms")
                .build()

        assertThat(verifiedNumberCreateResponse.phoneNumber()).contains("+15551234567")
        assertThat(verifiedNumberCreateResponse.verificationMethod()).contains("sms")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedNumberCreateResponse =
            VerifiedNumberCreateResponse.builder()
                .phoneNumber("+15551234567")
                .verificationMethod("sms")
                .build()

        val roundtrippedVerifiedNumberCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedNumberCreateResponse),
                jacksonTypeRef<VerifiedNumberCreateResponse>(),
            )

        assertThat(roundtrippedVerifiedNumberCreateResponse).isEqualTo(verifiedNumberCreateResponse)
    }
}
