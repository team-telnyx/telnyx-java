// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.networks.InterfaceStatus
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayDeleteResponseTest {

    @Test
    fun create() {
        val publicInternetGatewayDeleteResponse =
            PublicInternetGatewayDeleteResponse.builder()
                .data(
                    PublicInternetGatewayDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("public_internet_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .region(
                            PublicInternetGatewayDeleteResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
                        .build()
                )
                .build()

        assertThat(publicInternetGatewayDeleteResponse.data())
            .contains(
                PublicInternetGatewayDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("public_internet_gateway")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .publicIp("127.0.0.1")
                    .region(
                        PublicInternetGatewayDeleteResponse.Data.Region.builder()
                            .code("ashburn-va")
                            .name("Ashburn")
                            .recordType("region")
                            .build()
                    )
                    .regionCode("ashburn-va")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val publicInternetGatewayDeleteResponse =
            PublicInternetGatewayDeleteResponse.builder()
                .data(
                    PublicInternetGatewayDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("public_internet_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .region(
                            PublicInternetGatewayDeleteResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
                        .build()
                )
                .build()

        val roundtrippedPublicInternetGatewayDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGatewayDeleteResponse),
                jacksonTypeRef<PublicInternetGatewayDeleteResponse>(),
            )

        assertThat(roundtrippedPublicInternetGatewayDeleteResponse)
            .isEqualTo(publicInternetGatewayDeleteResponse)
    }
}
