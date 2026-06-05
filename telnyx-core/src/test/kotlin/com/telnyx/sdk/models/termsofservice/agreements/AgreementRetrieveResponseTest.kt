// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class AgreementRetrieveResponseTest {

    @Test
    fun create() {
        val agreementRetrieveResponse =
            AgreementRetrieveResponse.builder()
                .data(
                    AgreementRetrieveResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(AgreementRetrieveResponse.Data.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        assertThat(agreementRetrieveResponse.data())
            .isEqualTo(
                AgreementRetrieveResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .productType(AgreementRetrieveResponse.Data.ProductType.BRANDED_CALLING)
                    .termsVersion("v1.0.0")
                    .version("v1.0.0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val agreementRetrieveResponse =
            AgreementRetrieveResponse.builder()
                .data(
                    AgreementRetrieveResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(AgreementRetrieveResponse.Data.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        val roundtrippedAgreementRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(agreementRetrieveResponse),
                jacksonTypeRef<AgreementRetrieveResponse>(),
            )

        assertThat(roundtrippedAgreementRetrieveResponse).isEqualTo(agreementRetrieveResponse)
    }
}
