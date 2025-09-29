// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.dynamicemergencyendpoints

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.Metadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointListResponseTest {

    @Test
    fun create() {
        val dynamicEmergencyEndpointListResponse =
            DynamicEmergencyEndpointListResponse.builder()
                .addData(
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
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        assertThat(dynamicEmergencyEndpointListResponse.data().getOrNull())
            .containsExactly(
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
        assertThat(dynamicEmergencyEndpointListResponse.meta())
            .contains(
                Metadata.builder()
                    .pageNumber(3.0)
                    .pageSize(1.0)
                    .totalPages(13.0)
                    .totalResults(13.0)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val dynamicEmergencyEndpointListResponse =
            DynamicEmergencyEndpointListResponse.builder()
                .addData(
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
                .meta(
                    Metadata.builder()
                        .pageNumber(3.0)
                        .pageSize(1.0)
                        .totalPages(13.0)
                        .totalResults(13.0)
                        .build()
                )
                .build()

        val roundtrippedDynamicEmergencyEndpointListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyEndpointListResponse),
                jacksonTypeRef<DynamicEmergencyEndpointListResponse>(),
            )

        assertThat(roundtrippedDynamicEmergencyEndpointListResponse)
            .isEqualTo(dynamicEmergencyEndpointListResponse)
    }
}
