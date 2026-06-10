// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementListPageResponseTest {

    @Test
    fun create() {
        val agreementListPageResponse =
            AgreementListPageResponse.builder()
                .addData(
                    AgreementListResponse.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(AgreementListResponse.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .meta(
                    AgreementListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(agreementListPageResponse.data())
            .containsExactly(
                AgreementListResponse.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .productType(AgreementListResponse.ProductType.BRANDED_CALLING)
                    .termsVersion("v1.0.0")
                    .version("v1.0.0")
                    .build()
            )
        assertThat(agreementListPageResponse.meta())
            .isEqualTo(
                AgreementListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementListPageResponse =
            AgreementListPageResponse.builder()
                .addData(
                    AgreementListResponse.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(AgreementListResponse.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .meta(
                    AgreementListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedAgreementListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementListPageResponse),
                jacksonTypeRef<AgreementListPageResponse>(),
            )

        assertThat(roundtrippedAgreementListPageResponse).isEqualTo(agreementListPageResponse)
    }
}
