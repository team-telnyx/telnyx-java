// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberListResponseTest {

    @Test
    fun create() {
        val verifiedNumberListResponse =
            VerifiedNumberListResponse.builder()
                .addData(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .meta(
                    VerifiedNumberListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(verifiedNumberListResponse.data())
            .containsExactly(
                VerifiedNumber.builder()
                    .phoneNumber("+15551234567")
                    .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                    .verifiedAt("2020-09-14T17:03:32.965812")
                    .build()
            )
        assertThat(verifiedNumberListResponse.meta())
            .isEqualTo(
                VerifiedNumberListResponse.Meta.builder()
                    .pageNumber(2L)
                    .pageSize(25L)
                    .totalPages(3L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedNumberListResponse =
            VerifiedNumberListResponse.builder()
                .addData(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .meta(
                    VerifiedNumberListResponse.Meta.builder()
                        .pageNumber(2L)
                        .pageSize(25L)
                        .totalPages(3L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVerifiedNumberListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedNumberListResponse),
                jacksonTypeRef<VerifiedNumberListResponse>(),
            )

        assertThat(roundtrippedVerifiedNumberListResponse).isEqualTo(verifiedNumberListResponse)
    }
}
