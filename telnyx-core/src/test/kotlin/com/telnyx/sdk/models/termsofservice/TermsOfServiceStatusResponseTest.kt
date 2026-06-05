// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TermsOfServiceStatusResponseTest {

    @Test
    fun create() {
        val termsOfServiceStatusResponse =
            TermsOfServiceStatusResponse.builder()
                .data(
                    TermsOfServiceStatusResponse.Data.builder()
                        .agreementRequired(true)
                        .currentTermsVersion("v1.1.0")
                        .hasAgreed(false)
                        .productType(TermsOfServiceStatusResponse.Data.ProductType.BRANDED_CALLING)
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .agreedVersion("v1.0.0")
                        .build()
                )
                .build()

        assertThat(termsOfServiceStatusResponse.data())
            .isEqualTo(
                TermsOfServiceStatusResponse.Data.builder()
                    .agreementRequired(true)
                    .currentTermsVersion("v1.1.0")
                    .hasAgreed(false)
                    .productType(TermsOfServiceStatusResponse.Data.ProductType.BRANDED_CALLING)
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .agreedVersion("v1.0.0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val termsOfServiceStatusResponse =
            TermsOfServiceStatusResponse.builder()
                .data(
                    TermsOfServiceStatusResponse.Data.builder()
                        .agreementRequired(true)
                        .currentTermsVersion("v1.1.0")
                        .hasAgreed(false)
                        .productType(TermsOfServiceStatusResponse.Data.ProductType.BRANDED_CALLING)
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .agreedVersion("v1.0.0")
                        .build()
                )
                .build()

        val roundtrippedTermsOfServiceStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(termsOfServiceStatusResponse),
                jacksonTypeRef<TermsOfServiceStatusResponse>(),
            )

        assertThat(roundtrippedTermsOfServiceStatusResponse).isEqualTo(termsOfServiceStatusResponse)
    }
}
