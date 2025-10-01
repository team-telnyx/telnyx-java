// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayCreateParamsTest {

    @Test
    fun create() {
        PublicInternetGatewayCreateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .createdAt("2018-02-02T22:25:27.521Z")
            .recordType("sample_record_type")
            .updatedAt("2018-02-02T22:25:27.521Z")
            .name("test interface")
            .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .status(InterfaceStatus.PROVISIONED)
            .regionCode("ashburn-va")
            .publicIp("127.0.0.1")
            .build()
    }

    @Test
    fun body() {
        val params =
            PublicInternetGatewayCreateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .regionCode("ashburn-va")
                .publicIp("127.0.0.1")
                .build()

        val body = params._body()

        assertThat(body.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.recordType()).contains("sample_record_type")
        assertThat(body.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(body.name()).contains("test interface")
        assertThat(body.networkId()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(body.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(body.regionCode()).contains("ashburn-va")
        assertThat(body.publicIp()).contains("127.0.0.1")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params = PublicInternetGatewayCreateParams.builder().build()

        val body = params._body()
    }
}
