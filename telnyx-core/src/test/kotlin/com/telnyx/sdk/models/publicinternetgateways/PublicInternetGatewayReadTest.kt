// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayReadTest {

    @Test
    fun create() {
        val publicInternetGatewayRead =
            PublicInternetGatewayRead.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .publicIp("127.0.0.1")
                .recordType("public_internet_gateway")
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        assertThat(publicInternetGatewayRead.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(publicInternetGatewayRead.createdAt()).contains("created_at")
        assertThat(publicInternetGatewayRead.name()).contains("name")
        assertThat(publicInternetGatewayRead.networkId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(publicInternetGatewayRead.publicIp()).contains("127.0.0.1")
        assertThat(publicInternetGatewayRead.recordType()).contains("public_internet_gateway")
        assertThat(publicInternetGatewayRead.regionCode()).contains("region_code")
        assertThat(publicInternetGatewayRead.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(publicInternetGatewayRead.updatedAt()).contains("updated_at")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInternetGatewayRead =
            PublicInternetGatewayRead.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt("created_at")
                .name("name")
                .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .publicIp("127.0.0.1")
                .recordType("public_internet_gateway")
                .regionCode("region_code")
                .status(InterfaceStatus.PROVISIONED)
                .updatedAt("updated_at")
                .build()

        val roundtrippedPublicInternetGatewayRead =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGatewayRead),
                jacksonTypeRef<PublicInternetGatewayRead>(),
            )

        assertThat(roundtrippedPublicInternetGatewayRead).isEqualTo(publicInternetGatewayRead)
    }
}
