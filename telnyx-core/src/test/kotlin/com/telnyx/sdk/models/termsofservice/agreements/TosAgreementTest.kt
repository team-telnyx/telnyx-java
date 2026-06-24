// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.agreements

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TosAgreementTest {

    @Test
    fun create() {
        val tosAgreement =
            TosAgreement.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .productType(TosProductType.BRANDED_CALLING)
                .termsVersion("v1.0.0")
                .version("v1.0.0")
                .build()

        assertThat(tosAgreement.id()).contains("550e8400-e29b-41d4-a716-446655440000")
        assertThat(tosAgreement.agreedAt()).contains(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
        assertThat(tosAgreement.createdAt()).contains(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
        assertThat(tosAgreement.productType()).contains(TosProductType.BRANDED_CALLING)
        assertThat(tosAgreement.termsVersion()).contains("v1.0.0")
        assertThat(tosAgreement.version()).contains("v1.0.0")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val tosAgreement =
            TosAgreement.builder()
                .id("550e8400-e29b-41d4-a716-446655440000")
                .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                .productType(TosProductType.BRANDED_CALLING)
                .termsVersion("v1.0.0")
                .version("v1.0.0")
                .build()

        val roundtrippedTosAgreement =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(tosAgreement),
                jacksonTypeRef<TosAgreement>(),
            )

        assertThat(roundtrippedTosAgreement).isEqualTo(tosAgreement)
    }
}
