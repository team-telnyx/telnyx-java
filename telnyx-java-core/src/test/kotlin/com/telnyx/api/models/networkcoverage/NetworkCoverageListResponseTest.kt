// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.networkcoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCoverageListResponseTest {

    @Test
    fun create() {
        val networkCoverageListResponse =
            NetworkCoverageListResponse.builder()
                .addData(
                    NetworkCoverageListResponse.Data.builder()
                        .addAvailableService(AvailableService.CLOUD_VPN)
                        .location(
                            NetworkCoverageListResponse.Data.Location.builder()
                                .code("chicago-il")
                                .name("Chicago IL, US")
                                .pop("CH1")
                                .region("AMER")
                                .site("ORD")
                                .build()
                        )
                        .recordType("network_coverage")
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

        assertThat(networkCoverageListResponse.data().getOrNull())
            .containsExactly(
                NetworkCoverageListResponse.Data.builder()
                    .addAvailableService(AvailableService.CLOUD_VPN)
                    .location(
                        NetworkCoverageListResponse.Data.Location.builder()
                            .code("chicago-il")
                            .name("Chicago IL, US")
                            .pop("CH1")
                            .region("AMER")
                            .site("ORD")
                            .build()
                    )
                    .recordType("network_coverage")
                    .build()
            )
        assertThat(networkCoverageListResponse.meta())
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
        val networkCoverageListResponse =
            NetworkCoverageListResponse.builder()
                .addData(
                    NetworkCoverageListResponse.Data.builder()
                        .addAvailableService(AvailableService.CLOUD_VPN)
                        .location(
                            NetworkCoverageListResponse.Data.Location.builder()
                                .code("chicago-il")
                                .name("Chicago IL, US")
                                .pop("CH1")
                                .region("AMER")
                                .site("ORD")
                                .build()
                        )
                        .recordType("network_coverage")
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

        val roundtrippedNetworkCoverageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCoverageListResponse),
                jacksonTypeRef<NetworkCoverageListResponse>(),
            )

        assertThat(roundtrippedNetworkCoverageListResponse).isEqualTo(networkCoverageListResponse)
    }
}
