// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.privatewirelessgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PrivateWirelessGatewayListResponseTest {

    @Test
    fun create() {
        val privateWirelessGatewayListResponse =
            PrivateWirelessGatewayListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(privateWirelessGatewayListResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(privateWirelessGatewayListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val privateWirelessGatewayListResponse =
            PrivateWirelessGatewayListResponse.builder()
                .addData(
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
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedPrivateWirelessGatewayListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(privateWirelessGatewayListResponse),
                jacksonTypeRef<PrivateWirelessGatewayListResponse>(),
            )

        assertThat(roundtrippedPrivateWirelessGatewayListResponse)
            .isEqualTo(privateWirelessGatewayListResponse)
    }
}
