// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.virtualcrossconnectscoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectsCoverageListResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectsCoverageListResponse =
            VirtualCrossConnectsCoverageListResponse.builder()
                .addData(
                    VirtualCrossConnectsCoverageListResponse.Data.builder()
                        .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                        .cloudProvider(
                            VirtualCrossConnectsCoverageListResponse.Data.CloudProvider.AWS
                        )
                        .cloudProviderRegion("us-east-1")
                        .location(
                            VirtualCrossConnectsCoverageListResponse.Data.Location.builder()
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

        assertThat(virtualCrossConnectsCoverageListResponse.data().getOrNull())
            .containsExactly(
                VirtualCrossConnectsCoverageListResponse.Data.builder()
                    .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                    .cloudProvider(VirtualCrossConnectsCoverageListResponse.Data.CloudProvider.AWS)
                    .cloudProviderRegion("us-east-1")
                    .location(
                        VirtualCrossConnectsCoverageListResponse.Data.Location.builder()
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
        assertThat(virtualCrossConnectsCoverageListResponse.meta())
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
        val virtualCrossConnectsCoverageListResponse =
            VirtualCrossConnectsCoverageListResponse.builder()
                .addData(
                    VirtualCrossConnectsCoverageListResponse.Data.builder()
                        .availableBandwidth(listOf(50.0, 100.0, 200.0, 500.0))
                        .cloudProvider(
                            VirtualCrossConnectsCoverageListResponse.Data.CloudProvider.AWS
                        )
                        .cloudProviderRegion("us-east-1")
                        .location(
                            VirtualCrossConnectsCoverageListResponse.Data.Location.builder()
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

        val roundtrippedVirtualCrossConnectsCoverageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectsCoverageListResponse),
                jacksonTypeRef<VirtualCrossConnectsCoverageListResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectsCoverageListResponse)
            .isEqualTo(virtualCrossConnectsCoverageListResponse)
    }
}
