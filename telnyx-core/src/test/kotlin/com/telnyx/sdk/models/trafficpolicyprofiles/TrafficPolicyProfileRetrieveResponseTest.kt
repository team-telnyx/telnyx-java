// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileRetrieveResponseTest {

    @Test
    fun create() {
        val trafficPolicyProfileRetrieveResponse =
            TrafficPolicyProfileRetrieveResponse.builder()
                .data(
                    TrafficPolicyProfileRetrieveResponse.Data.builder()
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
                        .type(TrafficPolicyProfileRetrieveResponse.Data.Type.WHITELIST)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(trafficPolicyProfileRetrieveResponse.data())
            .contains(
                TrafficPolicyProfileRetrieveResponse.Data.builder()
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
                    .type(TrafficPolicyProfileRetrieveResponse.Data.Type.WHITELIST)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trafficPolicyProfileRetrieveResponse =
            TrafficPolicyProfileRetrieveResponse.builder()
                .data(
                    TrafficPolicyProfileRetrieveResponse.Data.builder()
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
                        .type(TrafficPolicyProfileRetrieveResponse.Data.Type.WHITELIST)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedTrafficPolicyProfileRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfileRetrieveResponse),
                jacksonTypeRef<TrafficPolicyProfileRetrieveResponse>(),
            )

        assertThat(roundtrippedTrafficPolicyProfileRetrieveResponse)
            .isEqualTo(trafficPolicyProfileRetrieveResponse)
    }
}
