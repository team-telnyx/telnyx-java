// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayCreateParamsTest {

    @Test
    fun create() {
        PrivateWirelessGatewayCreateParams.builder()
            .name("My private wireless gateway")
            .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .regionCode("dc2")
            .build()
    }

    @Test
    fun body() {
        val params =
            PrivateWirelessGatewayCreateParams.builder()
                .name("My private wireless gateway")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .regionCode("dc2")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My private wireless gateway")
        assertThat(body.networkId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.regionCode()).contains("dc2")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            PrivateWirelessGatewayCreateParams.builder()
                .name("My private wireless gateway")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()

        assertThat(body.name()).isEqualTo("My private wireless gateway")
        assertThat(body.networkId()).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
    }
}
