// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.number10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SmsOtpServiceTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpService = client.number10dlc().brand().smsOtp()

        val response =
            smsOtpService.getStatus(
                SmsOtpGetStatusParams.builder().referenceId("OTP4B2001").brandId("B123ABC").build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun trigger() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpService = client.number10dlc().brand().smsOtp()

        val response =
            smsOtpService.trigger(
                SmsOtpTriggerParams.builder()
                    .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                    .pinSms("Your PIN is @OTP_PIN@")
                    .successSms("Verification successful!")
                    .build()
            )

        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClient.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpService = client.number10dlc().brand().smsOtp()

        smsOtpService.verify(
            SmsOtpVerifyParams.builder()
                .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                .otpPin("123456")
                .build()
        )
    }
}
