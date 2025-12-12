// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.number10dlc.brand

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class BrandTriggerSmsOtpParamsTest {

    @Test
    fun create() {
        BrandTriggerSmsOtpParams.builder()
            .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
            .pinSms("Your PIN is @OTP_PIN@")
            .successSms("Verification successful!")
            .build()
    }

    @Test
    fun pathParams() {
        val params =
            BrandTriggerSmsOtpParams.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .pinSms("Your PIN is @OTP_PIN@")
                .successSms("Verification successful!")
                .build()

        assertThat(params._pathParam(0)).isEqualTo("4b20019b-043a-78f8-0657-b3be3f4b4002")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
            BrandTriggerSmsOtpParams.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .pinSms("Your PIN is @OTP_PIN@")
                .successSms("Verification successful!")
                .build()

        val body = params._body()

        assertThat(body.pinSms()).isEqualTo("Your PIN is @OTP_PIN@")
        assertThat(body.successSms()).isEqualTo("Verification successful!")
    }
}
