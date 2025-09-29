// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.publicinternetgateways

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class RegionInTest {

    @Test
    fun create() {
        val regionIn = RegionIn.builder().regionCode("ashburn-va").build()

        assertThat(regionIn.regionCode()).contains("ashburn-va")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val regionIn = RegionIn.builder().regionCode("ashburn-va").build()

        val roundtrippedRegionIn =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(regionIn),
                jacksonTypeRef<RegionIn>(),
            )

        assertThat(roundtrippedRegionIn).isEqualTo(regionIn)
    }
}
