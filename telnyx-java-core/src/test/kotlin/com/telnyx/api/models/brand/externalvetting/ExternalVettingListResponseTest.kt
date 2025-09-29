// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand.externalvetting

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class ExternalVettingListResponseTest {

    @Test
    fun create() {
        val externalVettingListResponse = ExternalVettingListResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val externalVettingListResponse = ExternalVettingListResponse.builder().build()

        val roundtrippedExternalVettingListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(externalVettingListResponse),
                jacksonTypeRef<ExternalVettingListResponse>(),
            )

        assertThat(roundtrippedExternalVettingListResponse).isEqualTo(externalVettingListResponse)
    }
}
