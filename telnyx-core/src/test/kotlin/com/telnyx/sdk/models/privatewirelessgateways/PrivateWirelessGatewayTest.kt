// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayTest {

    @Test
    fun create() {
        val privateWirelessGateway =
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
                        .errorCode(null)
                        .errorDescription(null)
                        .value(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(privateWirelessGateway.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(privateWirelessGateway.assignedResources().getOrNull())
            .containsExactly(
                PwgAssignedResourcesSummary.builder().count(1L).recordType("sim_card_group").build()
            )
        assertThat(privateWirelessGateway.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(privateWirelessGateway.ipRange()).contains("100.64.1.0/24")
        assertThat(privateWirelessGateway.name()).contains("My private wireless gateway")
        assertThat(privateWirelessGateway.networkId())
            .contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(privateWirelessGateway.recordType()).contains("private_wireless_gateway")
        assertThat(privateWirelessGateway.regionCode()).contains("dc2")
        assertThat(privateWirelessGateway.status())
            .contains(
                PrivateWirelessGatewayStatus.builder()
                    .errorCode(null)
                    .errorDescription(null)
                    .value(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
                    .build()
            )
        assertThat(privateWirelessGateway.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateWirelessGateway =
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
                        .errorCode(null)
                        .errorDescription(null)
                        .value(PrivateWirelessGatewayStatus.Value_.PROVISIONED)
                        .build()
                )
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedPrivateWirelessGateway =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateWirelessGateway),
                jacksonTypeRef<PrivateWirelessGateway>(),
            )

        assertThat(roundtrippedPrivateWirelessGateway).isEqualTo(privateWirelessGateway)
    }
}
