// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectsCoverageListPageResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectsCoverageListPageResponse =
            VirtualCrossConnectsCoverageListPageResponse.builder()
                .addData(
                    VirtualCrossConnectsCoverageListResponse.builder()
                        .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                        .cloudProvider(VirtualCrossConnectsCoverageListResponse.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .location(
                            VirtualCrossConnectsCoverageListResponse.Location.builder()
                                .code("chicago-il")
                                .name("Chicago IL, US")
                                .pop("CH1")
                                .region("AMER")
                                .site("ORD")
                                .build()
                        )
                        .recordType("virtual_cross_connects_coverage")
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

        assertThat(virtualCrossConnectsCoverageListPageResponse.data().getOrNull())
            .containsExactly(
                VirtualCrossConnectsCoverageListResponse.builder()
                    .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                    .cloudProvider(VirtualCrossConnectsCoverageListResponse.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .location(
                        VirtualCrossConnectsCoverageListResponse.Location.builder()
                            .code("chicago-il")
                            .name("Chicago IL, US")
                            .pop("CH1")
                            .region("AMER")
                            .site("ORD")
                            .build()
                    )
                    .recordType("virtual_cross_connects_coverage")
                    .build()
            )
        assertThat(virtualCrossConnectsCoverageListPageResponse.meta())
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
        val virtualCrossConnectsCoverageListPageResponse =
            VirtualCrossConnectsCoverageListPageResponse.builder()
                .addData(
                    VirtualCrossConnectsCoverageListResponse.builder()
                        .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                        .cloudProvider(VirtualCrossConnectsCoverageListResponse.CloudProvider.AWS)
                        .cloudProviderRegion("us-east-1")
                        .location(
                            VirtualCrossConnectsCoverageListResponse.Location.builder()
                                .code("chicago-il")
                                .name("Chicago IL, US")
                                .pop("CH1")
                                .region("AMER")
                                .site("ORD")
                                .build()
                        )
                        .recordType("virtual_cross_connects_coverage")
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

        val roundtrippedVirtualCrossConnectsCoverageListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectsCoverageListPageResponse),
                jacksonTypeRef<VirtualCrossConnectsCoverageListPageResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectsCoverageListPageResponse)
            .isEqualTo(virtualCrossConnectsCoverageListPageResponse)
    }
}
