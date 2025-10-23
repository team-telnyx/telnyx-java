// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class HostedNumberTest {

    @Test
    fun create() {
        val hostedNumber =
            HostedNumber.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("phone_number")
                .recordType("messaging_hosted_number")
                .status(HostedNumber.Status.DELETED)
                .build()

        assertThat(hostedNumber.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(hostedNumber.phoneNumber()).contains("phone_number")
        assertThat(hostedNumber.recordType()).contains("messaging_hosted_number")
        assertThat(hostedNumber.status()).contains(HostedNumber.Status.DELETED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedNumber =
            HostedNumber.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .phoneNumber("phone_number")
                .recordType("messaging_hosted_number")
                .status(HostedNumber.Status.DELETED)
                .build()

        val roundtrippedHostedNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedNumber),
                jacksonTypeRef<HostedNumber>(),
            )

        assertThat(roundtrippedHostedNumber).isEqualTo(hostedNumber)
    }
}
