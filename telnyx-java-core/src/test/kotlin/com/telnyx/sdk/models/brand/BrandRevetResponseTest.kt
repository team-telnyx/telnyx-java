// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRevetResponseTest {

    @Test
    fun create() {
        val brandRevetResponse = BrandRevetResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRevetResponse = BrandRevetResponse.builder().build()

        val roundtrippedBrandRevetResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRevetResponse),
                jacksonTypeRef<BrandRevetResponse>(),
            )

        assertThat(roundtrippedBrandRevetResponse).isEqualTo(brandRevetResponse)
    }
}
