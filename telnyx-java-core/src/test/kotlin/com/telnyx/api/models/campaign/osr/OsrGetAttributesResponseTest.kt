// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.campaign.osr

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class OsrGetAttributesResponseTest {

    @Test
    fun create() {
        val osrGetAttributesResponse = OsrGetAttributesResponse.builder().build()
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val osrGetAttributesResponse = OsrGetAttributesResponse.builder().build()

        val roundtrippedOsrGetAttributesResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(osrGetAttributesResponse),
                jacksonTypeRef<OsrGetAttributesResponse>(),
            )

        assertThat(roundtrippedOsrGetAttributesResponse).isEqualTo(osrGetAttributesResponse)
    }
}
