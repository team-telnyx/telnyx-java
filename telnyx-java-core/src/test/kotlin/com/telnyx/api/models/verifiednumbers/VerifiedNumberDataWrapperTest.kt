// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.verifiednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberDataWrapperTest {

    @Test
    fun create() {
        val verifiedNumberDataWrapper =
            VerifiedNumberDataWrapper.builder()
                .data(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .build()

        assertThat(verifiedNumberDataWrapper.data())
            .contains(
                VerifiedNumber.builder()
                    .phoneNumber("+15551234567")
                    .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                    .verifiedAt("2020-09-14T17:03:32.965812")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedNumberDataWrapper =
            VerifiedNumberDataWrapper.builder()
                .data(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .build()

        val roundtrippedVerifiedNumberDataWrapper =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedNumberDataWrapper),
                jacksonTypeRef<VerifiedNumberDataWrapper>(),
            )

        assertThat(roundtrippedVerifiedNumberDataWrapper).isEqualTo(verifiedNumberDataWrapper)
    }
}
