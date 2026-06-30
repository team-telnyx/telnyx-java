// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.trafficpolicyprofiles

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TrafficPolicyProfileDeleteResponseTest {

    @Test
    fun create() {
        val trafficPolicyProfileDeleteResponse =
            TrafficPolicyProfileDeleteResponse.builder()
                .data(
                    TrafficPolicyProfileDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        assertThat(trafficPolicyProfileDeleteResponse.data())
            .contains(
                TrafficPolicyProfileDeleteResponse.Data.builder()
                    .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val trafficPolicyProfileDeleteResponse =
            TrafficPolicyProfileDeleteResponse.builder()
                .data(
                    TrafficPolicyProfileDeleteResponse.Data.builder()
                        .id("6a09cdc3-8948-47f0-aa62-74ac943d6c58")
                        .build()
                )
                .build()

        val roundtrippedTrafficPolicyProfileDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(trafficPolicyProfileDeleteResponse),
                jacksonTypeRef<TrafficPolicyProfileDeleteResponse>(),
            )

        assertThat(roundtrippedTrafficPolicyProfileDeleteResponse)
            .isEqualTo(trafficPolicyProfileDeleteResponse)
    }
}
