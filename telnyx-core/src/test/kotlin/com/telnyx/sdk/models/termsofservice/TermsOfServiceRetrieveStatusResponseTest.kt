// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import com.telnyx.sdk.models.termsofservice.agreements.TosProductType
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TermsOfServiceRetrieveStatusResponseTest {

    @Test
    fun create() {
        val termsOfServiceRetrieveStatusResponse =
            TermsOfServiceRetrieveStatusResponse.builder()
                .data(
                    TermsOfServiceRetrieveStatusResponse.Data.builder()
                        .agreementRequired(true)
                        .currentTermsVersion("v1.1.0")
                        .hasAgreed(false)
                        .productType(TosProductType.BRANDED_CALLING)
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .agreedVersion("v1.0.0")
                        .build()
                )
                .build()

        assertThat(termsOfServiceRetrieveStatusResponse.data())
            .isEqualTo(
                TermsOfServiceRetrieveStatusResponse.Data.builder()
                    .agreementRequired(true)
                    .currentTermsVersion("v1.1.0")
                    .hasAgreed(false)
                    .productType(TosProductType.BRANDED_CALLING)
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .agreedVersion("v1.0.0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val termsOfServiceRetrieveStatusResponse =
            TermsOfServiceRetrieveStatusResponse.builder()
                .data(
                    TermsOfServiceRetrieveStatusResponse.Data.builder()
                        .agreementRequired(true)
                        .currentTermsVersion("v1.1.0")
                        .hasAgreed(false)
                        .productType(TosProductType.BRANDED_CALLING)
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .agreedVersion("v1.0.0")
                        .build()
                )
                .build()

        val roundtrippedTermsOfServiceRetrieveStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(termsOfServiceRetrieveStatusResponse),
                jacksonTypeRef<TermsOfServiceRetrieveStatusResponse>(),
            )

        assertThat(roundtrippedTermsOfServiceRetrieveStatusResponse)
            .isEqualTo(termsOfServiceRetrieveStatusResponse)
    }
}
