// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandOptionalAttributesTest {

    @Test
    fun create() {
        val brandOptionalAttributes =
            BrandOptionalAttributes.builder().taxExemptStatus("taxExemptStatus").build()

        assertThat(brandOptionalAttributes.taxExemptStatus()).contains("taxExemptStatus")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandOptionalAttributes =
            BrandOptionalAttributes.builder().taxExemptStatus("taxExemptStatus").build()

        val roundtrippedBrandOptionalAttributes =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandOptionalAttributes),
                jacksonTypeRef<BrandOptionalAttributes>(),
            )

        assertThat(roundtrippedBrandOptionalAttributes).isEqualTo(brandOptionalAttributes)
    }
}
