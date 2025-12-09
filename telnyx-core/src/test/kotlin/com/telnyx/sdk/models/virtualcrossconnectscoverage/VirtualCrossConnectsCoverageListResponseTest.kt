// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnectscoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VirtualCrossConnectsCoverageListResponseTest {

    @Test
    fun create() {
        val virtualCrossConnectsCoverageListResponse =
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

        assertThat(virtualCrossConnectsCoverageListResponse.availableBandwidth().getOrNull())
            .containsExactly(50.0, 100.0, 200.0, 500.0)
        assertThat(virtualCrossConnectsCoverageListResponse.cloudProvider())
            .contains(VirtualCrossConnectsCoverageListResponse.CloudProvider.AWS)
        assertThat(virtualCrossConnectsCoverageListResponse.cloudProviderRegion())
            .contains("us-east-1")
        assertThat(virtualCrossConnectsCoverageListResponse.location())
            .contains(
                VirtualCrossConnectsCoverageListResponse.Location.builder()
                    .code("chicago-il")
                    .name("Chicago IL, US")
                    .pop("CH1")
                    .region("AMER")
                    .site("ORD")
                    .build()
            )
        assertThat(virtualCrossConnectsCoverageListResponse.recordType())
            .contains("virtual_cross_connects_coverage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val virtualCrossConnectsCoverageListResponse =
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

        val roundtrippedVirtualCrossConnectsCoverageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(virtualCrossConnectsCoverageListResponse),
                jacksonTypeRef<VirtualCrossConnectsCoverageListResponse>(),
            )

        assertThat(roundtrippedVirtualCrossConnectsCoverageListResponse)
            .isEqualTo(virtualCrossConnectsCoverageListResponse)
    }
}
