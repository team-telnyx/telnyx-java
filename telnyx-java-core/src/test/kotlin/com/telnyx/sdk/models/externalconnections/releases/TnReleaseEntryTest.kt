// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.externalconnections.releases

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TnReleaseEntryTest {

    @Test
    fun create() {
        val tnReleaseEntry =
            TnReleaseEntry.builder().numberId("number_id").phoneNumber("phone_number").build()

        assertThat(tnReleaseEntry.numberId()).contains("number_id")
        assertThat(tnReleaseEntry.phoneNumber()).contains("phone_number")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tnReleaseEntry =
            TnReleaseEntry.builder().numberId("number_id").phoneNumber("phone_number").build()

        val roundtrippedTnReleaseEntry =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tnReleaseEntry),
                jacksonTypeRef<TnReleaseEntry>(),
            )

        assertThat(roundtrippedTnReleaseEntry).isEqualTo(tnReleaseEntry)
    }
}
