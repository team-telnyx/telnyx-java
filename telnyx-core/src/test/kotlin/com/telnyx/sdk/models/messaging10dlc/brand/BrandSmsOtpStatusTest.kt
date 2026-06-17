// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.messaging10dlc.brand

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandSmsOtpStatusTest {

    @Test
    fun create() {
        val brandSmsOtpStatus =
            BrandSmsOtpStatus.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        assertThat(brandSmsOtpStatus.brandId()).isEqualTo("B123ABC")
        assertThat(brandSmsOtpStatus.deliveryStatus()).isEqualTo("DELIVERED_HANDSET")
        assertThat(brandSmsOtpStatus.mobilePhone()).isEqualTo("+11234567890")
        assertThat(brandSmsOtpStatus.referenceId()).isEqualTo("OTP4B2001")
        assertThat(brandSmsOtpStatus.requestDate())
            .isEqualTo(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandSmsOtpStatus.deliveryStatusDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(brandSmsOtpStatus.deliveryStatusDetails()).contains("Delivered to handset")
        assertThat(brandSmsOtpStatus.verifyDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val brandSmsOtpStatus =
            BrandSmsOtpStatus.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        val roundtrippedBrandSmsOtpStatus =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(brandSmsOtpStatus),
                jacksonTypeRef<BrandSmsOtpStatus>(),
            )

        assertThat(roundtrippedBrandSmsOtpStatus).isEqualTo(brandSmsOtpStatus)
    }
}
