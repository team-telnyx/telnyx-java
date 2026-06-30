// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegionInformationTest {

    @Test
    fun create() {
        val regionInformation =
            RegionInformation.builder()
                .regionName("US")
                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                .build()

        assertThat(regionInformation.regionName()).contains("US")
        assertThat(regionInformation.regionType())
            .contains(RegionInformation.RegionType.COUNTRY_CODE)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regionInformation =
            RegionInformation.builder()
                .regionName("US")
                .regionType(RegionInformation.RegionType.COUNTRY_CODE)
                .build()

        val roundtrippedRegionInformation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regionInformation),
                jacksonTypeRef<RegionInformation>(),
            )

        assertThat(roundtrippedRegionInformation).isEqualTo(regionInformation)
    }
}
