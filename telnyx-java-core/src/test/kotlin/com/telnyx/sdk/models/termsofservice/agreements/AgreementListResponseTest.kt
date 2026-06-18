// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementListResponseTest {

    @Test
    fun create() {
        val agreementListResponse =
            AgreementListResponse.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .productType(AgreementListResponse.ProductType.BRANDED_CALLING)
                .termsVersion("v1.0.0")
                .version("v1.0.0")
                .build()

        assertThat(agreementListResponse.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(agreementListResponse.agreedAt())
            .contains(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
        assertThat(agreementListResponse.createdAt())
            .contains(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
        assertThat(agreementListResponse.productType())
            .contains(AgreementListResponse.ProductType.BRANDED_CALLING)
        assertThat(agreementListResponse.termsVersion()).contains("v1.0.0")
        assertThat(agreementListResponse.version()).contains("v1.0.0")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementListResponse =
            AgreementListResponse.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .productType(AgreementListResponse.ProductType.BRANDED_CALLING)
                .termsVersion("v1.0.0")
                .version("v1.0.0")
                .build()

        val roundtrippedAgreementListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementListResponse),
                jacksonTypeRef<AgreementListResponse>(),
            )

        assertThat(roundtrippedAgreementListResponse).isEqualTo(agreementListResponse)
    }
}
