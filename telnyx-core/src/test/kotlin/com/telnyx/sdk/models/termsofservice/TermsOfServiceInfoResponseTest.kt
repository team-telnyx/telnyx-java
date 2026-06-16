// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.LocalDate
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TermsOfServiceInfoResponseTest {

    @Test
    fun create() {
        val termsOfServiceInfoResponse =
            TermsOfServiceInfoResponse.builder()
                .addAgreement(
                    TermsOfServiceInfoResponse.Agreement.builder()
                        .currentVersion("v1.0.0")
                        .description("Terms and Conditions for Telnyx Number Reputation service")
                        .effectiveDate(LocalDate.parse("2025-07-10"))
                        .productType(
                            TermsOfServiceInfoResponse.Agreement.ProductType.BRANDED_CALLING
                        )
                        .termsUrl("https://telnyx.com/terms/reputation-services")
                        .build()
                )
                .build()

        assertThat(termsOfServiceInfoResponse.agreements().getOrNull())
            .containsExactly(
                TermsOfServiceInfoResponse.Agreement.builder()
                    .currentVersion("v1.0.0")
                    .description("Terms and Conditions for Telnyx Number Reputation service")
                    .effectiveDate(LocalDate.parse("2025-07-10"))
                    .productType(TermsOfServiceInfoResponse.Agreement.ProductType.BRANDED_CALLING)
                    .termsUrl("https://telnyx.com/terms/reputation-services")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val termsOfServiceInfoResponse =
            TermsOfServiceInfoResponse.builder()
                .addAgreement(
                    TermsOfServiceInfoResponse.Agreement.builder()
                        .currentVersion("v1.0.0")
                        .description("Terms and Conditions for Telnyx Number Reputation service")
                        .effectiveDate(LocalDate.parse("2025-07-10"))
                        .productType(
                            TermsOfServiceInfoResponse.Agreement.ProductType.BRANDED_CALLING
                        )
                        .termsUrl("https://telnyx.com/terms/reputation-services")
                        .build()
                )
                .build()

        val roundtrippedTermsOfServiceInfoResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(termsOfServiceInfoResponse),
                jacksonTypeRef<TermsOfServiceInfoResponse>(),
            )

        assertThat(roundtrippedTermsOfServiceInfoResponse).isEqualTo(termsOfServiceInfoResponse)
    }
}
