// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileTest {

    @Test
    fun create() {
        val trafficPolicyProfile =
            TrafficPolicyProfile.builder()
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
                .type(TrafficPolicyProfile.Type.WHITELIST)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        assertThat(trafficPolicyProfile.id()).contains("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        assertThat(trafficPolicyProfile.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(trafficPolicyProfile.domains().getOrNull())
            .containsExactly("www.hbomax.com", "netflix.com")
        assertThat(trafficPolicyProfile.ipRanges().getOrNull())
            .containsExactly("10.64.0.0/24", "10.64.0.0/25")
        assertThat(trafficPolicyProfile.limitBwKbps()).contains(512L)
        assertThat(trafficPolicyProfile.recordType()).contains("traffic_policy_profile")
        assertThat(trafficPolicyProfile.services().getOrNull())
            .containsExactly("service_123", "service_456")
        assertThat(trafficPolicyProfile.type()).contains(TrafficPolicyProfile.Type.WHITELIST)
        assertThat(trafficPolicyProfile.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trafficPolicyProfile =
            TrafficPolicyProfile.builder()
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
                .type(TrafficPolicyProfile.Type.WHITELIST)
                .updatedAt("2018-02-02T22:25:27.521Z")
                .build()

        val roundtrippedTrafficPolicyProfile =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfile),
                jacksonTypeRef<TrafficPolicyProfile>(),
            )

        assertThat(roundtrippedTrafficPolicyProfile).isEqualTo(trafficPolicyProfile)
    }
}
