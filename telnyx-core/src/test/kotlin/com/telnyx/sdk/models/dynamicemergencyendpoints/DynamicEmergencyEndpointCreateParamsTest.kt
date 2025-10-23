// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyendpoints

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointCreateParamsTest {

    @Test
    fun create() {
        DynamicEmergencyEndpointCreateParams.builder()
            .dynamicEmergencyEndpoint(
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
    }

    @Test
    fun body() {
        val params =
            DynamicEmergencyEndpointCreateParams.builder()
                .dynamicEmergencyEndpoint(
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    fun bodyWithoutOptionalFields() {
        val params =
            DynamicEmergencyEndpointCreateParams.builder()
                .dynamicEmergencyEndpoint(
                    DynamicEmergencyEndpoint.builder()
                        .callbackNumber("+13125550000")
                        .callerName("Jane Doe Desk Phone")
                        .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                        .build()
                )
                .build()

        val body = params._body()

        assertThat(body)
            .isEqualTo(
                DynamicEmergencyEndpoint.builder()
                    .callbackNumber("+13125550000")
                    .callerName("Jane Doe Desk Phone")
                    .dynamicEmergencyAddressId("0ccc7b54-4df3-4bca-a65a-3da1ecc777f0")
                    .build()
            )
    }
}
