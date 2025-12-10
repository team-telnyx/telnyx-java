// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayStatusTest {

    @Test
    fun create() {
        val privateWirelessGatewayStatus =
            PrivateWirelessGatewayStatus.builder()
                .errorCode(null)
                .errorDescription(null)
                .value(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
                .build()

        assertThat(privateWirelessGatewayStatus.errorCode()).isEmpty
        assertThat(privateWirelessGatewayStatus.errorDescription()).isEmpty
        assertThat(privateWirelessGatewayStatus.value())
            .contains(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateWirelessGatewayStatus =
            PrivateWirelessGatewayStatus.builder()
                .errorCode(null)
                .errorDescription(null)
                .value(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
                .build()

        val roundtrippedPrivateWirelessGatewayStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateWirelessGatewayStatus),
                jacksonTypeRef<PrivateWirelessGatewayStatus>(),
            )

        assertThat(roundtrippedPrivateWirelessGatewayStatus).isEqualTo(privateWirelessGatewayStatus)
    }
}
