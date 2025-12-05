// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.networks.InterfaceStatus
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PublicInternetGatewayListResponseTest {

    @Test
    fun create() {
        val publicInternetGatewayListResponse =
            PublicInternetGatewayListResponse.builder()
                .addData(
                    PublicInternetGatewayListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("public_internet_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .regionCode("ashburn-va")
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

        assertThat(publicInternetGatewayListResponse.data().getOrNull())
            .containsExactly(
                PublicInternetGatewayListResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("public_internet_gateway")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .name("test interface")
                    .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .status(InterfaceStatus.PROVISIONED)
                    .publicIp("127.0.0.1")
                    .regionCode("ashburn-va")
                    .build()
            )
        assertThat(publicInternetGatewayListResponse.meta())
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
        val publicInternetGatewayListResponse =
            PublicInternetGatewayListResponse.builder()
                .addData(
                    PublicInternetGatewayListResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("public_internet_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .name("test interface")
                        .networkId("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .status(InterfaceStatus.PROVISIONED)
                        .publicIp("127.0.0.1")
                        .regionCode("ashburn-va")
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

        val roundtrippedPublicInternetGatewayListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(publicInternetGatewayListResponse),
                jacksonTypeRef<PublicInternetGatewayListResponse>(),
            )

        assertThat(roundtrippedPublicInternetGatewayListResponse)
            .isEqualTo(publicInternetGatewayListResponse)
    }
}
