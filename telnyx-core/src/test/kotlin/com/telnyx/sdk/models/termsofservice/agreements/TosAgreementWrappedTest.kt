// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TosAgreementWrappedTest {

    @Test
    fun create() {
        val tosAgreementWrapped =
            TosAgreementWrapped.builder()
                .data(
                    TosAgreement.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(TosProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        assertThat(tosAgreementWrapped.data())
            .isEqualTo(
                TosAgreement.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .productType(TosProductType.BRANDED_CALLING)
                    .termsVersion("v1.0.0")
                    .version("v1.0.0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tosAgreementWrapped =
            TosAgreementWrapped.builder()
                .data(
                    TosAgreement.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(TosProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        val roundtrippedTosAgreementWrapped =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tosAgreementWrapped),
                jacksonTypeRef<TosAgreementWrapped>(),
            )

        assertThat(roundtrippedTosAgreementWrapped).isEqualTo(tosAgreementWrapped)
    }
}
