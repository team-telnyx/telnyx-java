// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class WirelessPrivateWirelessGatewayTest {

    @Test
    fun create() {
        val wirelessPrivateWirelessGateway =
            WirelessPrivateWirelessGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addressMode(WirelessPrivateWirelessGateway.AddressMode.DYNAMIC)
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
                        .errorCode(null)
                        .errorDescription(null)
                        .value(
                            PrivateWirelessGatewayStatus.PrivateWirelessGatewayStatusValue
                                .PROVISIONED
                        )
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(wirelessPrivateWirelessGateway.id())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessPrivateWirelessGateway.addressMode())
            .contains(WirelessPrivateWirelessGateway.AddressMode.DYNAMIC)
        assertThat(wirelessPrivateWirelessGateway.assignedResources().getOrNull())
            .containsExactly(
                PwgAssignedResourcesSummary.builder().count(1L).recordType("sim_card_group").build()
            )
        assertThat(wirelessPrivateWirelessGateway.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(wirelessPrivateWirelessGateway.ipRange()).contains("100.64.1.0/24")
        assertThat(wirelessPrivateWirelessGateway.name()).contains("My private wireless gateway")
        assertThat(wirelessPrivateWirelessGateway.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(wirelessPrivateWirelessGateway.recordType()).contains("private_wireless_gateway")
        assertThat(wirelessPrivateWirelessGateway.regionCode()).contains("dc2")
        assertThat(wirelessPrivateWirelessGateway.status())
            .contains(
                PrivateWirelessGatewayStatus.builder()
                    .errorCode(null)
                    .errorDescription(null)
                    .value(
                        PrivateWirelessGatewayStatus.PrivateWirelessGatewayStatusValue.PROVISIONED
                    )
                    .build()
            )
        assertThat(wirelessPrivateWirelessGateway.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val wirelessPrivateWirelessGateway =
            WirelessPrivateWirelessGateway.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addressMode(WirelessPrivateWirelessGateway.AddressMode.DYNAMIC)
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
                        .errorCode(null)
                        .errorDescription(null)
                        .value(
                            PrivateWirelessGatewayStatus.PrivateWirelessGatewayStatusValue
                                .PROVISIONED
                        )
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedWirelessPrivateWirelessGateway =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(wirelessPrivateWirelessGateway),
                jacksonTypeRef<WirelessPrivateWirelessGateway>(),
            )

        assertThat(roundtrippedWirelessPrivateWirelessGateway)
            .isEqualTo(wirelessPrivateWirelessGateway)
    }
}
