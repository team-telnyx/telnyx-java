// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCoverageListPageResponseTest {

    @Test
    fun create() {
        val networkCoverageListPageResponse =
            NetworkCoverageListPageResponse.builder()
                .addData(
                    NetworkCoverageListResponse.builder()
                        .addAvailableService(AvailableService.CLOUD_VPN)
                        .location(
                            NetworkCoverageListResponse.Location.builder()
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

        assertThat(networkCoverageListPageResponse.data().getOrNull())
            .containsExactly(
                NetworkCoverageListResponse.builder()
                    .addAvailableService(AvailableService.CLOUD_VPN)
                    .location(
                        NetworkCoverageListResponse.Location.builder()
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
        assertThat(networkCoverageListPageResponse.meta())
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
        val networkCoverageListPageResponse =
            NetworkCoverageListPageResponse.builder()
                .addData(
                    NetworkCoverageListResponse.builder()
                        .addAvailableService(AvailableService.CLOUD_VPN)
                        .location(
                            NetworkCoverageListResponse.Location.builder()
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

        val roundtrippedNetworkCoverageListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCoverageListPageResponse),
                jacksonTypeRef<NetworkCoverageListPageResponse>(),
            )

        assertThat(roundtrippedNetworkCoverageListPageResponse)
            .isEqualTo(networkCoverageListPageResponse)
    }
}
