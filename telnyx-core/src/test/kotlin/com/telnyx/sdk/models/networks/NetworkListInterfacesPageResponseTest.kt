// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networks

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkListInterfacesPageResponseTest {

    @Test
    fun create() {
        val networkListInterfacesPageResponse =
            NetworkListInterfacesPageResponse.builder()
                .addData(
                    NetworkListInterfacesResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt("created_at")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType("network_interface")
                        .region(
                            NetworkListInterfacesResponse.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("region_code")
                        .status(InterfaceStatus.PROVISIONED)
                        .type("wireguard_interface")
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(networkListInterfacesPageResponse.data().getOrNull())
            .containsExactly(
                NetworkListInterfacesResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt("created_at")
                    .name("name")
                    .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .recordType("network_interface")
                    .region(
                        NetworkListInterfacesResponse.Region.builder()
                            .code("ashburn-va")
                            .name("Ashburn")
                            .recordType("region")
                            .build()
                    )
                    .regionCode("region_code")
                    .status(InterfaceStatus.PROVISIONED)
                    .type("wireguard_interface")
                    .updatedAt("updated_at")
                    .build()
            )
        assertThat(networkListInterfacesPageResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkListInterfacesPageResponse =
            NetworkListInterfacesPageResponse.builder()
                .addData(
                    NetworkListInterfacesResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt("created_at")
                        .name("name")
                        .networkId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .recordType("network_interface")
                        .region(
                            NetworkListInterfacesResponse.Region.builder()
                                .code("ashburn-va")
                                .name("Ashburn")
                                .recordType("region")
                                .build()
                        )
                        .regionCode("region_code")
                        .status(InterfaceStatus.PROVISIONED)
                        .type("wireguard_interface")
                        .updatedAt("updated_at")
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedNetworkListInterfacesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkListInterfacesPageResponse),
                jacksonTypeRef<NetworkListInterfacesPageResponse>(),
            )

        assertThat(roundtrippedNetworkListInterfacesPageResponse)
            .isEqualTo(networkListInterfacesPageResponse)
    }
}
