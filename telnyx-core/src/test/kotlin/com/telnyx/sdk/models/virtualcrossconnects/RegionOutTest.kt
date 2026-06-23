// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.virtualcrossconnects

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegionOutTest {

    @Test
    fun create() {
        val regionOut =
            RegionOut.builder()
                .region(
                    RegionOut.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .build()

        assertThat(regionOut.region())
            .contains(
                RegionOut.Region.builder()
                    .code("ashburn-va")
                    .name("Ashburn")
                    .recordType("region")
                    .build()
            )
        assertThat(regionOut.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regionOut =
            RegionOut.builder()
                .region(
                    RegionOut.Region.builder()
                        .code("ashburn-va")
                        .name("Ashburn")
                        .recordType("region")
                        .build()
                )
                .regionCode("ashburn-va")
                .build()

        val roundtrippedRegionOut =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regionOut),
                jacksonTypeRef<RegionOut>(),
            )

        assertThat(roundtrippedRegionOut).isEqualTo(regionOut)
    }
}
