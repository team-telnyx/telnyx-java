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
                    PublicInternetGatewayCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .region(
                            PublicInternetGatewayCreateResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
                        .build()
                )
                .build()

        assertThat(publicInternetGatewayCreateResponse.data())
            .contains(
                PublicInternetGatewayCreateResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .publicIp("127.0.0.1")
                    .region(
                        PublicInternetGatewayCreateResponse.Data.Region.builder()
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
        val publicInternetGatewayCreateResponse =
            PublicInternetGatewayCreateResponse.builder()
                .data(
                    PublicInternetGatewayCreateResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .region(
                            PublicInternetGatewayCreateResponse.Data.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("ashburn-va")
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
