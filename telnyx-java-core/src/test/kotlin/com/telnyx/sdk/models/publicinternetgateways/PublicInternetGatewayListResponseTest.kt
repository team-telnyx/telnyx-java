// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayListResponseTest {

    @Test
    fun create() {
        val publicInternetGatewayListResponse =
            PublicInternetGatewayListResponse.builder()
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

        assertThat(publicInternetGatewayListResponse.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(publicInternetGatewayListResponse.createdAt())
            .contains("2018-02-02T22:25:27.521Z")
        assertThat(publicInternetGatewayListResponse.recordType()).contains("sample_record_type")
        assertThat(publicInternetGatewayListResponse.updatedAt())
            .contains("2018-02-02T22:25:27.521Z")
        assertThat(publicInternetGatewayListResponse.name()).contains("test interface")
        assertThat(publicInternetGatewayListResponse.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(publicInternetGatewayListResponse.status()).contains(InterfaceStatus.PROVISIONED)
        assertThat(publicInternetGatewayListResponse.publicIp()).contains("127.0.0.1")
        assertThat(publicInternetGatewayListResponse.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInternetGatewayListResponse =
            PublicInternetGatewayListResponse.builder()
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

        val roundtrippedPublicInternetGatewayListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGatewayListResponse),
                jacksonTypeRef<PublicInternetGatewayListResponse>(),
            )

        assertThat(roundtrippedPublicInternetGatewayListResponse)
            .isEqualTo(publicInternetGatewayListResponse)
    }
}
