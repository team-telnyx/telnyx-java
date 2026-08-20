// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.rcs.brands

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandAddressTest {

    @Test
    fun create() {
        val brandAddress =
            BrandAddress.builder()
                .administrativeArea("x")
                .city("x")
                .countryCode("SE")
                .line1("x")
                .postalCode("x")
                .line2("x")
                .build()

        assertThat(brandAddress.administrativeArea()).isEqualTo("x")
        assertThat(brandAddress.city()).isEqualTo("x")
        assertThat(brandAddress.countryCode()).isEqualTo("SE")
        assertThat(brandAddress.line1()).isEqualTo("x")
        assertThat(brandAddress.postalCode()).isEqualTo("x")
        assertThat(brandAddress.line2()).contains("x")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandAddress =
            BrandAddress.builder()
                .administrativeArea("x")
                .city("x")
                .countryCode("SE")
                .line1("x")
                .postalCode("x")
                .line2("x")
                .build()

        val roundtrippedBrandAddress =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandAddress),
                jacksonTypeRef<BrandAddress>(),
            )

        assertThat(roundtrippedBrandAddress).isEqualTo(brandAddress)
    }
}
