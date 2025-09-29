// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifiednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberTest {

    @Test
    fun create() {
        val verifiedNumber =
            VerifiedNumber.builder()
                .phoneNumber("+15551234567")
                .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                .verifiedAt("2020-09-14T17:03:32.965812")
                .build()

        assertThat(verifiedNumber.phoneNumber()).contains("+15551234567")
        assertThat(verifiedNumber.recordType()).contains(VerifiedNumber.RecordType.VERIFIED_NUMBER)
        assertThat(verifiedNumber.verifiedAt()).contains("2020-09-14T17:03:32.965812")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedNumber =
            VerifiedNumber.builder()
                .phoneNumber("+15551234567")
                .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                .verifiedAt("2020-09-14T17:03:32.965812")
                .build()

        val roundtrippedVerifiedNumber =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedNumber),
                jacksonTypeRef<VerifiedNumber>(),
            )

        assertThat(roundtrippedVerifiedNumber).isEqualTo(verifiedNumber)
    }
}
