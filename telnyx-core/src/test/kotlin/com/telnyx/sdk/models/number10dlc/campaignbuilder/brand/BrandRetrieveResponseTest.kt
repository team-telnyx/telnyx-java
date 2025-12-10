// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.campaignbuilder.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveResponseTest {

    @Test
    fun create() {
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .annualFee(0.0)
                .maxSubUsecases(0L)
                .minSubUsecases(0L)
                .mnoMetadata(
                    BrandRetrieveResponse.MnoMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .monthlyFee(0.0)
                .quarterlyFee(0.0)
                .usecase("usecase")
                .build()

        assertThat(brandRetrieveResponse.annualFee()).contains(0.0)
        assertThat(brandRetrieveResponse.maxSubUsecases()).contains(0L)
        assertThat(brandRetrieveResponse.minSubUsecases()).contains(0L)
        assertThat(brandRetrieveResponse.mnoMetadata())
            .contains(
                BrandRetrieveResponse.MnoMetadata.builder()
                    .putAdditionalProperty("foo", JsonValue.from("bar"))
                    .build()
            )
        assertThat(brandRetrieveResponse.monthlyFee()).contains(0.0)
        assertThat(brandRetrieveResponse.quarterlyFee()).contains(0.0)
        assertThat(brandRetrieveResponse.usecase()).contains("usecase")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveResponse =
            BrandRetrieveResponse.builder()
                .annualFee(0.0)
                .maxSubUsecases(0L)
                .minSubUsecases(0L)
                .mnoMetadata(
                    BrandRetrieveResponse.MnoMetadata.builder()
                        .putAdditionalProperty("foo", JsonValue.from("bar"))
                        .build()
                )
                .monthlyFee(0.0)
                .quarterlyFee(0.0)
                .usecase("usecase")
                .build()

        val roundtrippedBrandRetrieveResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveResponse),
                jacksonTypeRef<BrandRetrieveResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveResponse).isEqualTo(brandRetrieveResponse)
    }
}
