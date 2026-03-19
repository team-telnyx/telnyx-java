// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileCreateParamsTest {

    @Test
    fun create() {
        TrafficPolicyProfileCreateParams.builder()
            .type(TrafficPolicyProfileCreateParams.Type.WHITELIST)
            .addDomain("www.hbomax.com")
            .addDomain("netflix.com")
            .addIpRange("10.64.0.0/24")
            .addIpRange("10.64.0.0/25")
            .limitBwKbps(TrafficPolicyProfileCreateParams.LimitBwKbps._512)
            .addService("service_123")
            .addService("service_456")
            .build()
    }

    @Test
    fun body() {
        val params =
            TrafficPolicyProfileCreateParams.builder()
                .type(TrafficPolicyProfileCreateParams.Type.WHITELIST)
                .addDomain("www.hbomax.com")
                .addDomain("netflix.com")
                .addIpRange("10.64.0.0/24")
                .addIpRange("10.64.0.0/25")
                .limitBwKbps(TrafficPolicyProfileCreateParams.LimitBwKbps._512)
                .addService("service_123")
                .addService("service_456")
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(TrafficPolicyProfileCreateParams.Type.WHITELIST)
        assertThat(body.domains().getOrNull()).containsExactly("www.hbomax.com", "netflix.com")
        assertThat(body.ipRanges().getOrNull()).containsExactly("10.64.0.0/24", "10.64.0.0/25")
        assertThat(body.limitBwKbps()).contains(TrafficPolicyProfileCreateParams.LimitBwKbps._512)
        assertThat(body.services().getOrNull()).containsExactly("service_123", "service_456")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TrafficPolicyProfileCreateParams.builder()
                .type(TrafficPolicyProfileCreateParams.Type.WHITELIST)
                .build()

        val body = params._body()

        assertThat(body.type()).isEqualTo(TrafficPolicyProfileCreateParams.Type.WHITELIST)
    }
}
