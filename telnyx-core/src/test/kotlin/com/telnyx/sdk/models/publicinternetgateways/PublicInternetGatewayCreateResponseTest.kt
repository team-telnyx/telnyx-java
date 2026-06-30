// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayCreateResponseTest {

    @Test
    fun create() {
        val publicInternetGatewayCreateResponse =
            PublicInternetGatewayCreateResponse.builder()
                .data(
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
                )
                .build()

        assertThat(publicInternetGatewayCreateResponse.data())
            .contains(
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
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInternetGatewayCreateResponse =
            PublicInternetGatewayCreateResponse.builder()
                .data(
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
                )
                .build()

        val roundtrippedPublicInternetGatewayCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGatewayCreateResponse),
                jacksonTypeRef<PublicInternetGatewayCreateResponse>(),
            )

        assertThat(roundtrippedPublicInternetGatewayCreateResponse)
            .isEqualTo(publicInternetGatewayCreateResponse)
    }
}
