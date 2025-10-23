// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayCreateResponseTest {

    @Test
    fun create() {
        val privateWirelessGatewayCreateResponse =
            PrivateWirelessGatewayCreateResponse.builder()
                .data(
                    PrivateWirelessGateway.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .addAssignedResource(
                            PwgAssignedResourcesSummary.builder()
                                .count(1L)
                                .recordType("sim_card_group")
                                .build()
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipRange("100.64.1.0/24")
                        .name("My private wireless gateway")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("private_wireless_gateway")
                        .regionCode("dc2")
                        .status(
                            PrivateWirelessGatewayStatus.builder()
                                .errorCode("error_code")
                                .errorDescription("error_description")
                                .value(PrivateWirelessGatewayStatus.Value_.PROVISIONING)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(privateWirelessGatewayCreateResponse.data())
            .contains(
                PrivateWirelessGateway.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .addAssignedResource(
                        PwgAssignedResourcesSummary.builder()
                            .count(1L)
                            .recordType("sim_card_group")
                            .build()
                    )
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .ipRange("100.64.1.0/24")
                    .name("My private wireless gateway")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .recordType("private_wireless_gateway")
                    .regionCode("dc2")
                    .status(
                        PrivateWirelessGatewayStatus.builder()
                            .errorCode("error_code")
                            .errorDescription("error_description")
                            .value(PrivateWirelessGatewayStatus.Value_.PROVISIONING)
                            .build()
                    )
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateWirelessGatewayCreateResponse =
            PrivateWirelessGatewayCreateResponse.builder()
                .data(
                    PrivateWirelessGateway.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .addAssignedResource(
                            PwgAssignedResourcesSummary.builder()
                                .count(1L)
                                .recordType("sim_card_group")
                                .build()
                        )
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .ipRange("100.64.1.0/24")
                        .name("My private wireless gateway")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .recordType("private_wireless_gateway")
                        .regionCode("dc2")
                        .status(
                            PrivateWirelessGatewayStatus.builder()
                                .errorCode("error_code")
                                .errorDescription("error_description")
                                .value(PrivateWirelessGatewayStatus.Value_.PROVISIONING)
                                .build()
                        )
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedPrivateWirelessGatewayCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateWirelessGatewayCreateResponse),
                jacksonTypeRef<PrivateWirelessGatewayCreateResponse>(),
            )

        assertThat(roundtrippedPrivateWirelessGatewayCreateResponse)
            .isEqualTo(privateWirelessGatewayCreateResponse)
    }
}
