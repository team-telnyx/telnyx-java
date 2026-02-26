// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.civicaddresses

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class LocationTest {

    @Test
    fun create() {
        val location =
            Location.builder()
                .id("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .additionalInfo("14th Floor")
                .description("Austin Office")
                .isDefault(true)
                .build()

        assertThat(location.id()).contains("542c3bca-d247-42bc-8fe7-e01d16ecd761")
        assertThat(location.additionalInfo()).contains("14th Floor")
        assertThat(location.description()).contains("Austin Office")
        assertThat(location.isDefault()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val location =
            Location.builder()
                .id("542c3bca-d247-42bc-8fe7-e01d16ecd761")
                .additionalInfo("14th Floor")
                .description("Austin Office")
                .isDefault(true)
                .build()

        val roundtrippedLocation =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(location),
                jacksonTypeRef<Location>(),
            )

        assertThat(roundtrippedLocation).isEqualTo(location)
    }
}
