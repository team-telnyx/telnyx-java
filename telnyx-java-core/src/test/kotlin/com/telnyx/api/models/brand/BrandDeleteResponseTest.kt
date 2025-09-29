// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandDeleteResponseTest {

    @Test
    fun create() {
        val brandDeleteResponse = BrandDeleteResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandDeleteResponse = BrandDeleteResponse.builder().build()

        val roundtrippedBrandDeleteResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandDeleteResponse),
                jacksonTypeRef<BrandDeleteResponse>(),
            )

        assertThat(roundtrippedBrandDeleteResponse).isEqualTo(brandDeleteResponse)
    }
}
