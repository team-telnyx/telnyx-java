// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.smsotp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmsOtpGetStatusResponseTest {

    @Test
    fun create() {
        val smsOtpGetStatusResponse =
            SmsOtpGetStatusResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        assertThat(smsOtpGetStatusResponse.brandId()).isEqualTo("B123ABC")
        assertThat(smsOtpGetStatusResponse.deliveryStatus()).isEqualTo("DELIVERED_HANDSET")
        assertThat(smsOtpGetStatusResponse.mobilePhone()).isEqualTo("+11234567890")
        assertThat(smsOtpGetStatusResponse.referenceId()).isEqualTo("OTP4B2001")
        assertThat(smsOtpGetStatusResponse.requestDate())
            .isEqualTo(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(smsOtpGetStatusResponse.deliveryStatusDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
        assertThat(smsOtpGetStatusResponse.deliveryStatusDetails()).contains("Delivered to handset")
        assertThat(smsOtpGetStatusResponse.verifyDate())
            .contains(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val smsOtpGetStatusResponse =
            SmsOtpGetStatusResponse.builder()
                .brandId("B123ABC")
                .deliveryStatus("DELIVERED_HANDSET")
                .mobilePhone("+11234567890")
                .referenceId("OTP4B2001")
                .requestDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .deliveryStatusDetails("Delivered to handset")
                .verifyDate(OffsetDateTime.parse("2024-12-03T17:12:33.560000+00:00"))
                .build()

        val roundtrippedSmsOtpGetStatusResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(smsOtpGetStatusResponse),
                jacksonTypeRef<SmsOtpGetStatusResponse>(),
            )

        assertThat(roundtrippedSmsOtpGetStatusResponse).isEqualTo(smsOtpGetStatusResponse)
    }
}
