// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks.defaultgateway

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import com.telnyx.sdk.models.networks.InterfaceStatus
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DefaultGatewayRetrieveResponseTest {

    @Test
    fun create() {
        val defaultGatewayRetrieveResponse =
            DefaultGatewayRetrieveResponse.builder()
                .addData(
                    DefaultGatewayRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
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

        assertThat(defaultGatewayRetrieveResponse.data().getOrNull())
            .containsExactly(
                DefaultGatewayRetrieveResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("sample_record_type")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .networkId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .status(InterfaceStatus.PROVISIONED)
                    .wireguardPeerId("e66c496d-4a85-423b-8b2a-8e63fac20320")
                    .build()
            )
        assertThat(defaultGatewayRetrieveResponse.meta())
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
        val defaultGatewayRetrieveResponse =
            DefaultGatewayRetrieveResponse.builder()
                .addData(
                    DefaultGatewayRetrieveResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("sample_record_type")
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

        val roundtrippedDefaultGatewayRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(defaultGatewayRetrieveResponse),
                jacksonTypeRef<DefaultGatewayRetrieveResponse>(),
            )

        assertThat(roundtrippedDefaultGatewayRetrieveResponse)
            .isEqualTo(defaultGatewayRetrieveResponse)
    }
}
