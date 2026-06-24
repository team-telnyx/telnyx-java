// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.portingorders.verificationcodes

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PortingVerificationCodeTest {

    @Test
    fun create() {
        val portingVerificationCode =
            PortingVerificationCode.builder()
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .phoneNumber("+13035550987")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_verification_code")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .verified(true)
                .build()

        assertThat(portingVerificationCode.id()).contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingVerificationCode.createdAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingVerificationCode.phoneNumber()).contains("+13035550987")
        assertThat(portingVerificationCode.portingOrderId())
            .contains("f1486bae-f067-460c-ad43-73a92848f902")
        assertThat(portingVerificationCode.recordType()).contains("porting_verification_code")
        assertThat(portingVerificationCode.updatedAt())
            .contains(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
        assertThat(portingVerificationCode.verified()).contains(true)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val portingVerificationCode =
            PortingVerificationCode.builder()
                .id("f1486bae-f067-460c-ad43-73a92848f902")
                .createdAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .phoneNumber("+13035550987")
                .portingOrderId("f1486bae-f067-460c-ad43-73a92848f902")
                .recordType("porting_verification_code")
                .updatedAt(OffsetDateTime.parse("2021-03-19T10:07:15.527000Z"))
                .verified(true)
                .build()

        val roundtrippedPortingVerificationCode =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(portingVerificationCode),
                jacksonTypeRef<PortingVerificationCode>(),
            )

        assertThat(roundtrippedPortingVerificationCode).isEqualTo(portingVerificationCode)
    }
}
