// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyendpoints

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointDeleteResponseTest {

    @Test
    fun create() {
        val dynamicEmergencyEndpointDeleteResponse =
            DynamicEmergencyEndpointDeleteResponse.builder()
                .data(
                    DynamicEmergencyEndpoint.builder()
                        .callbackNumber("+13125550000")
                        .callerName("Jane Doe Desk Phone")
                        .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("dynamic_emergency_endpoint")
                        .sipFromId("FXDFWEDF")
                        .status(DynamicEmergencyEndpoint.Status.PENDING)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(dynamicEmergencyEndpointDeleteResponse.data())
            .contains(
                DynamicEmergencyEndpoint.builder()
                    .callbackNumber("+13125550000")
                    .callerName("Jane Doe Desk Phone")
                    .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .recordType("dynamic_emergency_endpoint")
                    .sipFromId("FXDFWEDF")
                    .status(DynamicEmergencyEndpoint.Status.PENDING)
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyEndpointDeleteResponse =
            DynamicEmergencyEndpointDeleteResponse.builder()
                .data(
                    DynamicEmergencyEndpoint.builder()
                        .callbackNumber("+13125550000")
                        .callerName("Jane Doe Desk Phone")
                        .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .id("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .recordType("dynamic_emergency_endpoint")
                        .sipFromId("FXDFWEDF")
                        .status(DynamicEmergencyEndpoint.Status.PENDING)
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedDynamicEmergencyEndpointDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyEndpointDeleteResponse),
                jacksonTypeRef<DynamicEmergencyEndpointDeleteResponse>(),
            )

        assertThat(roundtrippedDynamicEmergencyEndpointDeleteResponse)
            .isEqualTo(dynamicEmergencyEndpointDeleteResponse)
    }
}
