// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.networks.defaultgateway

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import com.telnyx.api.models.networks.InterfaceStatus
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefaultGatewayDeleteResponseTest {

    @Test
    fun create() {
        val defaultGatewayDeleteResponse =
            DefaultGatewayDeleteResponse.builder()
                .addData(
                    DefaultGatewayDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("default_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                        .status(InterfaceStatus.PROVISIONED)
                        .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
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

        assertThat(defaultGatewayDeleteResponse.data().getOrNull())
            .containsExactly(
                DefaultGatewayDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("default_gateway")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )
        assertThat(defaultGatewayDeleteResponse.meta())
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
        val defaultGatewayDeleteResponse =
            DefaultGatewayDeleteResponse.builder()
                .addData(
                    DefaultGatewayDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("default_gateway")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                        .status(InterfaceStatus.PROVISIONED)
                        .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
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

        val roundtrippedDefaultGatewayDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(defaultGatewayDeleteResponse),
                jacksonTypeRef<DefaultGatewayDeleteResponse>(),
            )

        assertThat(roundtrippedDefaultGatewayDeleteResponse).isEqualTo(defaultGatewayDeleteResponse)
    }
}
