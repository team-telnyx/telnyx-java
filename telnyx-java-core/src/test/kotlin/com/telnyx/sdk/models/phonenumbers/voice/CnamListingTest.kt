// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.phonenumbers.voice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CnamListingTest {

    @Test
    fun create() {
        val cnamListing =
            CnamListing.builder().cnamListingDetails("example").cnamListingEnabled(true).build()

        assertThat(cnamListing.cnamListingDetails()).contains("example")
        assertThat(cnamListing.cnamListingEnabled()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val cnamListing =
            CnamListing.builder().cnamListingDetails("example").cnamListingEnabled(true).build()

        val roundtrippedCnamListing =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(cnamListing),
                jacksonTypeRef<CnamListing>(),
            )

        assertThat(roundtrippedCnamListing).isEqualTo(cnamListing)
    }
}
