// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.campaignbuilder.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandQualifyByUsecaseResponseTest {

    @Test
    fun create() {
        val brandQualifyByUsecaseResponse =
            BrandQualifyByUsecaseResponse.builder()
                .annualFee(0.0)
                .maxSubUsecases(0L)
                .minSubUsecases(0L)
                .mnoMetadata(
                    BrandQualifyByUsecaseResponse.MnoMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .monthlyFee(0.0)
                .quarterlyFee(0.0)
                .usecase("usecase")
                .build()

        assertThat(brandQualifyByUsecaseResponse.annualFee()).contains(0.0)
        assertThat(brandQualifyByUsecaseResponse.maxSubUsecases()).contains(0L)
        assertThat(brandQualifyByUsecaseResponse.minSubUsecases()).contains(0L)
        assertThat(brandQualifyByUsecaseResponse.mnoMetadata())
            .contains(
                BrandQualifyByUsecaseResponse.MnoMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(brandQualifyByUsecaseResponse.monthlyFee()).contains(0.0)
        assertThat(brandQualifyByUsecaseResponse.quarterlyFee()).contains(0.0)
        assertThat(brandQualifyByUsecaseResponse.usecase()).contains("usecase")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandQualifyByUsecaseResponse =
            BrandQualifyByUsecaseResponse.builder()
                .annualFee(0.0)
                .maxSubUsecases(0L)
                .minSubUsecases(0L)
                .mnoMetadata(
                    BrandQualifyByUsecaseResponse.MnoMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .monthlyFee(0.0)
                .quarterlyFee(0.0)
                .usecase("usecase")
                .build()

        val roundtrippedBrandQualifyByUsecaseResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandQualifyByUsecaseResponse),
                jacksonTypeRef<BrandQualifyByUsecaseResponse>(),
            )

        assertThat(roundtrippedBrandQualifyByUsecaseResponse)
            .isEqualTo(brandQualifyByUsecaseResponse)
    }
}
