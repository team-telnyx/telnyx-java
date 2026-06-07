// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TermsOfServiceRetrieveInfoResponseTest {

    @Test
    fun create() {
        val termsOfServiceRetrieveInfoResponse =
            TermsOfServiceRetrieveInfoResponse.builder()
                .addAgreement(
                    TermsOfServiceRetrieveInfoResponse.Agreement.builder()
                        .currentVersion("v1.0.0")
                        .description("Terms and Conditions for Telnyx Number Reputation service")
                        .effectiveDate(LocalDate.parse("2025-07-10"))
                        .productType(
                            TermsOfServiceRetrieveInfoResponse.Agreement.ProductType.BRANDED_CALLING
                        )
                        .termsUrl("https://telnyx.com/terms/reputation-services")
                        .build()
                )
                .build()

        assertThat(termsOfServiceRetrieveInfoResponse.agreements().getOrNull())
            .containsExactly(
                TermsOfServiceRetrieveInfoResponse.Agreement.builder()
                    .currentVersion("v1.0.0")
                    .description("Terms and Conditions for Telnyx Number Reputation service")
                    .effectiveDate(LocalDate.parse("2025-07-10"))
                    .productType(
                        TermsOfServiceRetrieveInfoResponse.Agreement.ProductType.BRANDED_CALLING
                    )
                    .termsUrl("https://telnyx.com/terms/reputation-services")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val termsOfServiceRetrieveInfoResponse =
            TermsOfServiceRetrieveInfoResponse.builder()
                .addAgreement(
                    TermsOfServiceRetrieveInfoResponse.Agreement.builder()
                        .currentVersion("v1.0.0")
                        .description("Terms and Conditions for Telnyx Number Reputation service")
                        .effectiveDate(LocalDate.parse("2025-07-10"))
                        .productType(
                            TermsOfServiceRetrieveInfoResponse.Agreement.ProductType.BRANDED_CALLING
                        )
                        .termsUrl("https://telnyx.com/terms/reputation-services")
                        .build()
                )
                .build()

        val roundtrippedTermsOfServiceRetrieveInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(termsOfServiceRetrieveInfoResponse),
                jacksonTypeRef<TermsOfServiceRetrieveInfoResponse>(),
            )

        assertThat(roundtrippedTermsOfServiceRetrieveInfoResponse)
            .isEqualTo(termsOfServiceRetrieveInfoResponse)
    }
}
