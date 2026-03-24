// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileUpdateParamsTest {

    @Test
    fun create() {
        TrafficPolicyProfileUpdateParams.builder()
            .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
            .addDomain("netflix.com")
            .addIpRange("10.64.0.0/24")
            .limitBwKbps(TrafficPolicyProfileUpdateParams.LimitBwKbps.LIMIT_BW_KBPS_1024)
            .addService("service_123")
            .type(TrafficPolicyProfileUpdateParams.Type.WHITELIST)
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            TrafficPolicyProfileUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            TrafficPolicyProfileUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .addDomain("netflix.com")
                .addIpRange("10.64.0.0/24")
                .limitBwKbps(TrafficPolicyProfileUpdateParams.LimitBwKbps.LIMIT_BW_KBPS_1024)
                .addService("service_123")
                .type(TrafficPolicyProfileUpdateParams.Type.WHITELIST)
                .build()

        val body = params._body()

        assertThat(body.domains().getOrNull()).containsExactly("netflix.com")
        assertThat(body.ipRanges().getOrNull()).containsExactly("10.64.0.0/24")
        assertThat(body.limitBwKbps())
            .contains(TrafficPolicyProfileUpdateParams.LimitBwKbps.LIMIT_BW_KBPS_1024)
        assertThat(body.services().getOrNull()).containsExactly("service_123")
        assertThat(body.type()).contains(TrafficPolicyProfileUpdateParams.Type.WHITELIST)
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TrafficPolicyProfileUpdateParams.builder()
                .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                .build()

        val body = params._body()
    }
}
