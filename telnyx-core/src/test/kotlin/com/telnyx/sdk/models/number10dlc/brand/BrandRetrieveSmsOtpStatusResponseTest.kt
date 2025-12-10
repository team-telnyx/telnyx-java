// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandRetrieveSmsOtpStatusResponseTest {

    @Test
    fun create() {
        val brandRetrieveSmsOtpStatusResponse =
            BrandRetrieveSmsOtpStatusResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        assertThat(brandRetrieveSmsOtpStatusResponse.brandId()).isEqualTo("B123ABC")
        assertThat(brandRetrieveSmsOtpStatusResponse.deliveryStatus())
            .isEqualTo("DELIVERED_HANDSET")
        assertThat(brandRetrieveSmsOtpStatusResponse.mobilePhone()).isEqualTo("+11234567890")
        assertThat(brandRetrieveSmsOtpStatusResponse.referenceId()).isEqualTo("OTP4B2001")
        assertThat(brandRetrieveSmsOtpStatusResponse.requestDate())
            .isEqualTo(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandRetrieveSmsOtpStatusResponse.deliveryStatusDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandRetrieveSmsOtpStatusResponse.deliveryStatusDetails())
            .contains("Delivered to handset")
        assertThat(brandRetrieveSmsOtpStatusResponse.verifyDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandRetrieveSmsOtpStatusResponse =
            BrandRetrieveSmsOtpStatusResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        val roundtrippedBrandRetrieveSmsOtpStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandRetrieveSmsOtpStatusResponse),
                jacksonTypeRef<BrandRetrieveSmsOtpStatusResponse>(),
            )

        assertThat(roundtrippedBrandRetrieveSmsOtpStatusResponse)
            .isEqualTo(brandRetrieveSmsOtpStatusResponse)
    }
}
