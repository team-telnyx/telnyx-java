// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandGetSmsOtpByReferenceResponseTest {

    @Test
    fun create() {
        val brandGetSmsOtpByReferenceResponse =
            BrandGetSmsOtpByReferenceResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        assertThat(brandGetSmsOtpByReferenceResponse.brandId()).isEqualTo("B123ABC")
        assertThat(brandGetSmsOtpByReferenceResponse.deliveryStatus())
            .isEqualTo("DELIVERED_HANDSET")
        assertThat(brandGetSmsOtpByReferenceResponse.mobilePhone()).isEqualTo("+11234567890")
        assertThat(brandGetSmsOtpByReferenceResponse.referenceId()).isEqualTo("OTP4B2001")
        assertThat(brandGetSmsOtpByReferenceResponse.requestDate())
            .isEqualTo(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandGetSmsOtpByReferenceResponse.deliveryStatusDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandGetSmsOtpByReferenceResponse.deliveryStatusDetails())
            .contains("Delivered to handset")
        assertThat(brandGetSmsOtpByReferenceResponse.verifyDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandGetSmsOtpByReferenceResponse =
            BrandGetSmsOtpByReferenceResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        val roundtrippedBrandGetSmsOtpByReferenceResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandGetSmsOtpByReferenceResponse),
                jacksonTypeRef<BrandGetSmsOtpByReferenceResponse>(),
            )

        assertThat(roundtrippedBrandGetSmsOtpByReferenceResponse)
            .isEqualTo(brandGetSmsOtpByReferenceResponse)
    }
}
