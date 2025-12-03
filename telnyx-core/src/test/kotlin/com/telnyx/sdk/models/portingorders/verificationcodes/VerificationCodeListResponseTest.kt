// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.authenticationproviders.PaginationMeta
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VerificationCodeListResponseTest {

    @Test
    fun create() {
        val verificationCodeListResponse =
            VerificationCodeListResponse.builder()
                .addData(
                    VerificationCodeListResponse.Data.builder()
                        .id("52090326-6533-4421-bcf4-bd0117cf3954")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000001")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(true)
                        .build()
                )
                .addData(
                    VerificationCodeListResponse.Data.builder()
                        .id("cf076b8e-645b-4040-8209-543c5909775f")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000002")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(false)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(2L)
                        .totalPages(1L)
                        .totalResults(2L)
                        .build()
                )
                .build()

        assertThat(verificationCodeListResponse.data().getOrNull())
            .containsExactly(
                VerificationCodeListResponse.Data.builder()
                    .id("52090326-6533-4421-bcf4-bd0117cf3954")
                    .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .phoneNumber("+61424000001")
                    .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                    .recordType("porting_verification_code")
                    .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .verified(true)
                    .build(),
                VerificationCodeListResponse.Data.builder()
                    .id("cf076b8e-645b-4040-8209-543c5909775f")
                    .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .phoneNumber("+61424000002")
                    .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                    .recordType("porting_verification_code")
                    .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                    .verified(false)
                    .build(),
            )
        assertThat(verificationCodeListResponse.meta())
            .contains(
                PaginationMeta.builder()
                    .pageNumber(1L)
                    .pageSize(2L)
                    .totalPages(1L)
                    .totalResults(2L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val verificationCodeListResponse =
            VerificationCodeListResponse.builder()
                .addData(
                    VerificationCodeListResponse.Data.builder()
                        .id("52090326-6533-4421-bcf4-bd0117cf3954")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000001")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(true)
                        .build()
                )
                .addData(
                    VerificationCodeListResponse.Data.builder()
                        .id("cf076b8e-645b-4040-8209-543c5909775f")
                        .createdAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .phoneNumber("+61424000002")
                        .portingOrderId("f28e6ecc-29a8-430b-bd0b-d93055f70604")
                        .recordType("porting_verification_code")
                        .updatedAt(OffsetDateTime.parse("2020-10-22T15:00:00.000Z"))
                        .verified(false)
                        .build()
                )
                .meta(
                    PaginationMeta.builder()
                        .pageNumber(1L)
                        .pageSize(2L)
                        .totalPages(1L)
                        .totalResults(2L)
                        .build()
                )
                .build()

        val roundtrippedVerificationCodeListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(verificationCodeListResponse),
                jacksonTypeRef<VerificationCodeListResponse>(),
            )

        assertThat(roundtrippedVerificationCodeListResponse).isEqualTo(verificationCodeListResponse)
    }
}
