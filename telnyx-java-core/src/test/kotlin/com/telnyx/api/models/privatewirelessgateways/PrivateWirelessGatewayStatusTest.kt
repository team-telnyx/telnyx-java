// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayStatusTest {

    @Test
    fun create() {
        val privateWirelessGatewayStatus =
            PrivateWirelessGatewayStatus.builder()
                .errorCode("error_code")
                .errorDescription("error_description")
                .value(PrivateWirelessGatewayStatus.Value.PROVISIONED)
                .build()

        assertThat(privateWirelessGatewayStatus.errorCode()).contains("error_code")
        assertThat(privateWirelessGatewayStatus.errorDescription()).contains("error_description")
        assertThat(privateWirelessGatewayStatus.value())
            .contains(PrivateWirelessGatewayStatus.Value.PROVISIONED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateWirelessGatewayStatus =
            PrivateWirelessGatewayStatus.builder()
                .errorCode("error_code")
                .errorDescription("error_description")
                .value(PrivateWirelessGatewayStatus.Value.PROVISIONED)
                .build()

        val roundtrippedPrivateWirelessGatewayStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateWirelessGatewayStatus),
                jacksonTypeRef<PrivateWirelessGatewayStatus>(),
            )

        assertThat(roundtrippedPrivateWirelessGatewayStatus).isEqualTo(privateWirelessGatewayStatus)
    }
}
