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
                .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                .phoneNumber("+18665550001")
                .recordType("messaging_hosted_number")
                .status(HostedNumber.Status.SUCCESSFUL)
                .build()

        assertThat(hostedNumber.id()).contains("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
        assertThat(hostedNumber.phoneNumber()).contains("+18665550001")
        assertThat(hostedNumber.recordType()).contains("messaging_hosted_number")
        assertThat(hostedNumber.status()).contains(HostedNumber.Status.SUCCESSFUL)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val hostedNumber =
            HostedNumber.builder()
                .id("bf6307bd-884d-4c1f-b6ea-c62b8c495d3c")
                .phoneNumber("+18665550001")
                .recordType("messaging_hosted_number")
                .status(HostedNumber.Status.SUCCESSFUL)
                .build()

        val roundtrippedHostedNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(hostedNumber),
                jacksonTypeRef<HostedNumber>(),
            )

        assertThat(roundtrippedHostedNumber).isEqualTo(hostedNumber)
    }
}
