// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.networks.InterfaceStatus
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
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .regionCode("ashburn-va")
                        .build()
                )
                .build()

        assertThat(publicInternetGatewayDeleteResponse.data())
            .contains(
                PublicInternetGatewayDeleteResponse.Data.builder()
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
                        .recordType("sample_record_type")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
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
