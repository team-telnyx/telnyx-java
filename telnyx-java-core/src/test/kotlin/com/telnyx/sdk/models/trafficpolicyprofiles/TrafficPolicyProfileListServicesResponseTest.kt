// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileListServicesResponseTest {

    @Test
    fun create() {
        val trafficPolicyProfileListServicesResponse =
            TrafficPolicyProfileListServicesResponse.builder()
                .id("service_123")
                .group("Streaming")
                .name("Netflix")
                .resourceType("wireless_pcrf_service")
                .build()

        assertThat(trafficPolicyProfileListServicesResponse.id()).contains("service_123")
        assertThat(trafficPolicyProfileListServicesResponse.group()).contains("Streaming")
        assertThat(trafficPolicyProfileListServicesResponse.name()).contains("Netflix")
        assertThat(trafficPolicyProfileListServicesResponse.resourceType())
            .contains("wireless_pcrf_service")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trafficPolicyProfileListServicesResponse =
            TrafficPolicyProfileListServicesResponse.builder()
                .id("service_123")
                .group("Streaming")
                .name("Netflix")
                .resourceType("wireless_pcrf_service")
                .build()

        val roundtrippedTrafficPolicyProfileListServicesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfileListServicesResponse),
                jacksonTypeRef<TrafficPolicyProfileListServicesResponse>(),
            )

        assertThat(roundtrippedTrafficPolicyProfileListServicesResponse)
            .isEqualTo(trafficPolicyProfileListServicesResponse)
    }
}
