// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.accessipaddress

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpAddressResponseTest {

    @Test
    fun create() {
        val accessIpAddressResponse =
            AccessIpAddressResponse.builder()
                .id("id")
                .ipAddress("ip_address")
                .source("source")
                .status(CloudflareSyncStatus.PENDING)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accessIpAddressResponse.id()).isEqualTo("id")
        assertThat(accessIpAddressResponse.ipAddress()).isEqualTo("ip_address")
        assertThat(accessIpAddressResponse.source()).isEqualTo("source")
        assertThat(accessIpAddressResponse.status()).isEqualTo(CloudflareSyncStatus.PENDING)
        assertThat(accessIpAddressResponse.userId()).isEqualTo("user_id")
        assertThat(accessIpAddressResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accessIpAddressResponse.description()).contains("description")
        assertThat(accessIpAddressResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessIpAddressResponse =
            AccessIpAddressResponse.builder()
                .id("id")
                .ipAddress("ip_address")
                .source("source")
                .status(CloudflareSyncStatus.PENDING)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccessIpAddressResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessIpAddressResponse),
                jacksonTypeRef<AccessIpAddressResponse>(),
            )

        assertThat(roundtrippedAccessIpAddressResponse).isEqualTo(accessIpAddressResponse)
    }
}
