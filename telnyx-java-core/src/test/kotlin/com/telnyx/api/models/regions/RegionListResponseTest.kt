// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.regions

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegionListResponseTest {

    @Test
    fun create() {
        val regionListResponse =
            RegionListResponse.builder()
                .addData(
                    RegionListResponse.Data.builder()
                        .code("ashburn-va")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("Ashburn")
                        .recordType("region")
                        .addSupportedInterface("wireguard_interface")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        assertThat(regionListResponse.data().getOrNull())
            .containsExactly(
                RegionListResponse.Data.builder()
                    .code("ashburn-va")
                    .createdAt("2018-02-02T22:25:27.521Z")
                    .name("Ashburn")
                    .recordType("region")
                    .addSupportedInterface("wireguard_interface")
                    .updatedAt("2018-02-02T22:25:27.521Z")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regionListResponse =
            RegionListResponse.builder()
                .addData(
                    RegionListResponse.Data.builder()
                        .code("ashburn-va")
                        .createdAt("2018-02-02T22:25:27.521Z")
                        .name("Ashburn")
                        .recordType("region")
                        .addSupportedInterface("wireguard_interface")
                        .updatedAt("2018-02-02T22:25:27.521Z")
                        .build()
                )
                .build()

        val roundtrippedRegionListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regionListResponse),
                jacksonTypeRef<RegionListResponse>(),
            )

        assertThat(roundtrippedRegionListResponse).isEqualTo(regionListResponse)
    }
}
