// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayTest {

    @Test
    fun create() {
        val publicInternetGateway =
            PublicInternetGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .publicIp("127.0.0.1")
                .regionCode("ashburn-va")
                .build()

        assertThat(publicInternetGateway.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(publicInternetGateway.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(publicInternetGateway.recordType()).contains("sample_record_type")
        assertThat(publicInternetGateway.updatedAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(publicInternetGateway.name()).contains("test interface")
        assertThat(publicInternetGateway.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(publicInternetGateway.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(publicInternetGateway.publicIp()).contains("127.0.0.1")
        assertThat(publicInternetGateway.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInternetGateway =
            PublicInternetGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .createdAt("2018-02-02T22:25:27.521Z")
                .recordType("sample_record_type")
                .updatedAt("2018-02-02T22:25:27.521Z")
                .name("test interface")
                .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .status(InterfaceStatus.PROVISIONED)
                .publicIp("127.0.0.1")
                .regionCode("ashburn-va")
                .build()

        val roundtrippedPublicInternetGateway =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGateway),
                jacksonTypeRef<PublicInternetGateway>(),
            )

        assertThat(roundtrippedPublicInternetGateway).isEqualTo(publicInternetGateway)
    }
}
