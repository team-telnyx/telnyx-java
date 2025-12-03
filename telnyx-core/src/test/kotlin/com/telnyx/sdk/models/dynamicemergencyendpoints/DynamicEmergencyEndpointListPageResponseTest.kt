// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.dynamicemergencyendpoints

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.Metadata
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class DynamicEmergencyEndpointListPageResponseTest {

    @Test
    fun create() {
        val dynamicEmergencyEndpointListPageResponse =
            DynamicEmergencyEndpointListPageResponse.builder()
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

        assertThat(dynamicEmergencyEndpointListPageResponse.data().getOrNull())
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
        assertThat(dynamicEmergencyEndpointListPageResponse.meta())
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
        val dynamicEmergencyEndpointListPageResponse =
            DynamicEmergencyEndpointListPageResponse.builder()
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

        val roundtrippedDynamicEmergencyEndpointListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(dynamicEmergencyEndpointListPageResponse),
                jacksonTypeRef<DynamicEmergencyEndpointListPageResponse>(),
            )

        assertThat(roundtrippedDynamicEmergencyEndpointListPageResponse)
            .isEqualTo(dynamicEmergencyEndpointListPageResponse)
    }
}
