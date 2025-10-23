// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyendpoints

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointTest {

    @Test
    fun create() {
        val dynamicEmergencyEndpoint =
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

        assertThat(dynamicEmergencyEndpoint.callbackNumber()).isEqualTo("+13125550000")
        assertThat(dynamicEmergencyEndpoint.callerName()).isEqualTo("Jane Doe Desk Phone")
        assertThat(dynamicEmergencyEndpoint.dynamicEmergencyAddressId())
            .isEqualTo("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(dynamicEmergencyEndpoint.id()).contains("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
        assertThat(dynamicEmergencyEndpoint.createdAt()).contains("2018-02-02T22:25:27.521Z")
        assertThat(dynamicEmergencyEndpoint.recordType()).contains("dynamic_emergency_endpoint")
        assertThat(dynamicEmergencyEndpoint.sipFromId()).contains("FXDFWEDF")
        assertThat(dynamicEmergencyEndpoint.status())
            .contains(DynamicEmergencyEndpoint.Status.PENDING)
        assertThat(dynamicEmergencyEndpoint.updatedAt()).contains("2018-02-02T22:25:27.521Z")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyEndpoint =
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

        val roundtrippedDynamicEmergencyEndpoint =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyEndpoint),
                jacksonTypeRef<DynamicEmergencyEndpoint>(),
            )

        assertThat(roundtrippedDynamicEmergencyEndpoint).isEqualTo(dynamicEmergencyEndpoint)
    }
}
