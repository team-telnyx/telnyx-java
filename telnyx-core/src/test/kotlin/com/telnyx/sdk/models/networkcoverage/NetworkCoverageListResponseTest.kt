// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.networkcoverage

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.NetappsLocation
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NetworkCoverageListResponseTest {

    @Test
    fun create() {
        val networkCoverageListResponse =
            NetworkCoverageListResponse.builder()
                .addAvailableService(AvailableService.CLOUD_VPN)
                .location(
                    NetappsLocation.builder()
                        .code("chicago-il")
                        .name("Chicago IL, US")
                        .pop("CH1")
                        .region("AMER")
                        .site("ORD")
                        .build()
                )
                .recordType("network_coverage")
                .build()

        assertThat(networkCoverageListResponse.availableServices().getOrNull())
            .containsExactly(AvailableService.CLOUD_VPN)
        assertThat(networkCoverageListResponse.location())
            .contains(
                NetappsLocation.builder()
                    .code("chicago-il")
                    .name("Chicago IL, US")
                    .pop("CH1")
                    .region("AMER")
                    .site("ORD")
                    .build()
            )
        assertThat(networkCoverageListResponse.recordType()).contains("network_coverage")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val networkCoverageListResponse =
            NetworkCoverageListResponse.builder()
                .addAvailableService(AvailableService.CLOUD_VPN)
                .location(
                    NetappsLocation.builder()
                        .code("chicago-il")
                        .name("Chicago IL, US")
                        .pop("CH1")
                        .region("AMER")
                        .site("ORD")
                        .build()
                )
                .recordType("network_coverage")
                .build()

        val roundtrippedNetworkCoverageListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(networkCoverageListResponse),
                jacksonTypeRef<NetworkCoverageListResponse>(),
            )

        assertThat(roundtrippedNetworkCoverageListResponse).isEqualTo(networkCoverageListResponse)
    }
}
