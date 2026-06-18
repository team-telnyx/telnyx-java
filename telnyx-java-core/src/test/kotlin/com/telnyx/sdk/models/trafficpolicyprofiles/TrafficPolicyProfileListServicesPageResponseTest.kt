// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileListServicesPageResponseTest {

    @Test
    fun create() {
        val trafficPolicyProfileListServicesPageResponse =
            TrafficPolicyProfileListServicesPageResponse.builder()
                .addData(
                    TrafficPolicyProfileListServicesResponse.builder()
                        .id("service_123")
                        .group("Streaming")
                        .name("Netflix")
                        .resourceType("wireless_pcrf_service")
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

        assertThat(trafficPolicyProfileListServicesPageResponse.data().getOrNull())
            .containsExactly(
                TrafficPolicyProfileListServicesResponse.builder()
                    .id("service_123")
                    .group("Streaming")
                    .name("Netflix")
                    .resourceType("wireless_pcrf_service")
                    .build()
            )
        assertThat(trafficPolicyProfileListServicesPageResponse.meta())
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
        val trafficPolicyProfileListServicesPageResponse =
            TrafficPolicyProfileListServicesPageResponse.builder()
                .addData(
                    TrafficPolicyProfileListServicesResponse.builder()
                        .id("service_123")
                        .group("Streaming")
                        .name("Netflix")
                        .resourceType("wireless_pcrf_service")
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

        val roundtrippedTrafficPolicyProfileListServicesPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfileListServicesPageResponse),
                jacksonTypeRef<TrafficPolicyProfileListServicesPageResponse>(),
            )

        assertThat(roundtrippedTrafficPolicyProfileListServicesPageResponse)
            .isEqualTo(trafficPolicyProfileListServicesPageResponse)
    }
}
