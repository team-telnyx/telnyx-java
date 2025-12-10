// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand.smsotp

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmsOtpTriggerResponseTest {

    @Test
    fun create() {
        val smsOtpTriggerResponse =
            SmsOtpTriggerResponse.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .referenceId("OTP4B2001")
                .build()

        assertThat(smsOtpTriggerResponse.brandId())
            .isEqualTo("4b20019b-043a-78f8-0657-b3be3f4b4002")
        assertThat(smsOtpTriggerResponse.referenceId()).isEqualTo("OTP4B2001")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val smsOtpTriggerResponse =
            SmsOtpTriggerResponse.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .referenceId("OTP4B2001")
                .build()

        val roundtrippedSmsOtpTriggerResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(smsOtpTriggerResponse),
                jacksonTypeRef<SmsOtpTriggerResponse>(),
            )

        assertThat(roundtrippedSmsOtpTriggerResponse).isEqualTo(smsOtpTriggerResponse)
    }
}
