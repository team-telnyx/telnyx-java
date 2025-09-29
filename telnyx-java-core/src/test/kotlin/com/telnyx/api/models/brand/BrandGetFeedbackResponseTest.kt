// File generated from our OpenAPI spec by Stainless.

package com.telnyx.api.models.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandGetFeedbackResponseTest {

    @Test
    fun create() {
        val brandGetFeedbackResponse =
            BrandGetFeedbackResponse.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .addCategory(
                    BrandGetFeedbackResponse.Category.builder()
                        .id("TAX_ID")
                        .description(
                            "Tax Id does not match with the company name or business type."
                        )
                        .displayName("Tax Id")
                        .fields(listOf("ein", "companyName", "entityType"))
                        .build()
                )
                .build()

        assertThat(brandGetFeedbackResponse.brandId())
            .isEqualTo("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
        assertThat(brandGetFeedbackResponse.category())
            .containsExactly(
                BrandGetFeedbackResponse.Category.builder()
                    .id("TAX_ID")
                    .description("Tax Id does not match with the company name or business type.")
                    .displayName("Tax Id")
                    .fields(listOf("ein", "companyName", "entityType"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandGetFeedbackResponse =
            BrandGetFeedbackResponse.builder()
                .brandId("d88dd2aa-1bb9-4ef0-9ec8-1752b80316a5")
                .addCategory(
                    BrandGetFeedbackResponse.Category.builder()
                        .id("TAX_ID")
                        .description(
                            "Tax Id does not match with the company name or business type."
                        )
                        .displayName("Tax Id")
                        .fields(listOf("ein", "companyName", "entityType"))
                        .build()
                )
                .build()

        val roundtrippedBrandGetFeedbackResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandGetFeedbackResponse),
                jacksonTypeRef<BrandGetFeedbackResponse>(),
            )

        assertThat(roundtrippedBrandGetFeedbackResponse).isEqualTo(brandGetFeedbackResponse)
    }
}
