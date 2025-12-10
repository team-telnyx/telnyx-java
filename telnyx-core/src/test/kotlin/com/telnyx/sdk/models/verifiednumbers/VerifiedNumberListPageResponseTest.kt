// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.verifiednumbers

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerifiedNumberListPageResponseTest {

    @Test
    fun create() {
        val verifiedNumberListPageResponse =
            VerifiedNumberListPageResponse.builder()
                .addData(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .meta(
                    VerifiedNumberListPageResponse.Meta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        assertThat(verifiedNumberListPageResponse.data())
            .containsExactly(
                VerifiedNumber.builder()
                    .phoneNumber("+15551234567")
                    .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                    .verifiedAt("2020-09-14T17:03:32.965812")
                    .build()
            )
        assertThat(verifiedNumberListPageResponse.meta())
            .isEqualTo(
                VerifiedNumberListPageResponse.Meta.builder()
                    .pageNumber(2L)
                    .totalPages(3L)
                    .pageSize(25L)
                    .totalResults(55L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verifiedNumberListPageResponse =
            VerifiedNumberListPageResponse.builder()
                .addData(
                    VerifiedNumber.builder()
                        .phoneNumber("+15551234567")
                        .recordType(VerifiedNumber.RecordType.VERIFIED_NUMBER)
                        .verifiedAt("2020-09-14T17:03:32.965812")
                        .build()
                )
                .meta(
                    VerifiedNumberListPageResponse.Meta.builder()
                        .pageNumber(2L)
                        .totalPages(3L)
                        .pageSize(25L)
                        .totalResults(55L)
                        .build()
                )
                .build()

        val roundtrippedVerifiedNumberListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verifiedNumberListPageResponse),
                jacksonTypeRef<VerifiedNumberListPageResponse>(),
            )

        assertThat(roundtrippedVerifiedNumberListPageResponse)
            .isEqualTo(verifiedNumberListPageResponse)
    }
}
