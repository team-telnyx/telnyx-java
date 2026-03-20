// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileListPageResponseTest {

    @Test
    fun create() {
        val trafficPolicyProfileListPageResponse =
            TrafficPolicyProfileListPageResponse.builder()
                .addData(
                    TrafficPolicyProfileListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .addDomain("www.hbomax.com")
                        .addDomain("netflix.com")
                        .addIpRange("10.64.0.0/24")
                        .addIpRange("10.64.0.0/25")
                        .limitBwKbps(512L)
                        .recordType("traffic_policy_profile")
                        .addService("service_123")
                        .addService("service_456")
                        .type(TrafficPolicyProfileListResponse.Type.WHITELIST)
                        .updatedAt("2018-02-02T22:25:27.521Z")
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

        assertThat(trafficPolicyProfileListPageResponse.data().getOrNull())
            .containsExactly(
                TrafficPolicyProfileListResponse.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .addDomain("www.hbomax.com")
                    .addDomain("netflix.com")
                    .addIpRange("10.64.0.0/24")
                    .addIpRange("10.64.0.0/25")
                    .limitBwKbps(512L)
                    .recordType("traffic_policy_profile")
                    .addService("service_123")
                    .addService("service_456")
                    .type(TrafficPolicyProfileListResponse.Type.WHITELIST)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
        assertThat(trafficPolicyProfileListPageResponse.meta())
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
        val trafficPolicyProfileListPageResponse =
            TrafficPolicyProfileListPageResponse.builder()
                .addData(
                    TrafficPolicyProfileListResponse.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .addDomain("www.hbomax.com")
                        .addDomain("netflix.com")
                        .addIpRange("10.64.0.0/24")
                        .addIpRange("10.64.0.0/25")
                        .limitBwKbps(512L)
                        .recordType("traffic_policy_profile")
                        .addService("service_123")
                        .addService("service_456")
                        .type(TrafficPolicyProfileListResponse.Type.WHITELIST)
                        .updatedAt("2018-02-02T22:25:27.521Z")
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

        val roundtrippedTrafficPolicyProfileListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfileListPageResponse),
                jacksonTypeRef<TrafficPolicyProfileListPageResponse>(),
            )

        assertThat(roundtrippedTrafficPolicyProfileListPageResponse)
            .isEqualTo(trafficPolicyProfileListPageResponse)
    }
}
