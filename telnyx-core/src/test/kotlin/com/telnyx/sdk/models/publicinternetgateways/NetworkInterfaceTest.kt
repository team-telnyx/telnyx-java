// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkInterfaceTest {

    @Test
    fun create() {
        val networkInterface =
            NetworkInterface.builder()
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .build()

        assertThat(networkInterface.name()).contains("test interface")
        assertThat(networkInterface.networkId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(networkInterface.status()).contains(InterfaceStatus.PROVISIONED)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkInterface =
            NetworkInterface.builder()
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .build()

        val roundtrippedNetworkInterface =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkInterface),
                jacksonTypeRef<NetworkInterface>(),
            )

        assertThat(roundtrippedNetworkInterface).isEqualTo(networkInterface)
    }
}
