// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.termsofservice.numberreputation

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class NumberReputationAgreeResponseTest {

    @Test
    fun create() {
        val numberReputationAgreeResponse =
            NumberReputationAgreeResponse.builder()
                .data(
                    NumberReputationAgreeResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(NumberReputationAgreeResponse.Data.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        assertThat(numberReputationAgreeResponse.data())
            .isEqualTo(
                NumberReputationAgreeResponse.Data.builder()
                    .id("550e8400-e29b-41d4-a716-446655440000")
                    .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                    .productType(NumberReputationAgreeResponse.Data.ProductType.BRANDED_CALLING)
                    .termsVersion("v1.0.0")
                    .version("v1.0.0")
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val numberReputationAgreeResponse =
            NumberReputationAgreeResponse.builder()
                .data(
                    NumberReputationAgreeResponse.Data.builder()
                        .id("550e8400-e29b-41d4-a716-446655440000")
                        .agreedAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .createdAt(OffsetDateTime.parse("2025-07-10T10:30:00Z"))
                        .productType(NumberReputationAgreeResponse.Data.ProductType.BRANDED_CALLING)
                        .termsVersion("v1.0.0")
                        .version("v1.0.0")
                        .build()
                )
                .build()

        val roundtrippedNumberReputationAgreeResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(numberReputationAgreeResponse),
                jacksonTypeRef<NumberReputationAgreeResponse>(),
            )

        assertThat(roundtrippedNumberReputationAgreeResponse)
            .isEqualTo(numberReputationAgreeResponse)
    }
}
