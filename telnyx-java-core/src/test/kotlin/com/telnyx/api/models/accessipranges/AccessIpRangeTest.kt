// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.accessipranges

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import com.telnyx.api.models.accessipaddress.CloudflareSyncStatus
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AccessIpRangeTest {

    @Test
    fun create() {
        val accessIpRange =
            AccessIpRange.builder()
                .id("id")
                .cidrBlock("cidr_block")
                .status(CloudflareSyncStatus.PENDING)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(accessIpRange.id()).isEqualTo("id")
        assertThat(accessIpRange.cidrBlock()).isEqualTo("cidr_block")
        assertThat(accessIpRange.status()).isEqualTo(CloudflareSyncStatus.PENDING)
        assertThat(accessIpRange.userId()).isEqualTo("user_id")
        assertThat(accessIpRange.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(accessIpRange.description()).contains("description")
        assertThat(accessIpRange.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val accessIpRange =
            AccessIpRange.builder()
                .id("id")
                .cidrBlock("cidr_block")
                .status(CloudflareSyncStatus.PENDING)
                .userId("user_id")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .description("description")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedAccessIpRange =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(accessIpRange),
                jacksonTypeRef<AccessIpRange>(),
            )

        assertThat(roundtrippedAccessIpRange).isEqualTo(accessIpRange)
    }
}
