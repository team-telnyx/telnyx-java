// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingOrderResponseTest {

    @Test
    fun create() {
        val externalVettingOrderResponse = ExternalVettingOrderResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingOrderResponse = ExternalVettingOrderResponse.builder().build()

        val roundtrippedExternalVettingOrderResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingOrderResponse),
                jacksonTypeRef<ExternalVettingOrderResponse>(),
            )

        assertThat(roundtrippedExternalVettingOrderResponse).isEqualTo(externalVettingOrderResponse)
    }
}
