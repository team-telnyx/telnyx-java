// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.number10dlc.brand

import com.telnyx.sdk.TestServerExtension
import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpGetStatusParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpTriggerParams
import com.telnyx.sdk.models.number10dlc.brand.smsotp.SmsOtpVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class SmsOtpServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    fun getStatus() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpServiceAsync = client.number10dlc().brand().smsOtp()

        val responseFuture =
            smsOtpServiceAsync.getStatus(
                SmsOtpGetStatusParams.builder().referenceId("OTP4B2001").brandId("B123ABC").build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun trigger() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpServiceAsync = client.number10dlc().brand().smsOtp()

        val responseFuture =
            smsOtpServiceAsync.trigger(
                SmsOtpTriggerParams.builder()
                    .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                    .pinSms("Your PIN is @OTP_PIN@")
                    .successSms("Verification successful!")
                    .build()
            )

        val response = responseFuture.get()
        response.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    fun verify() {
        val client =
            TelnyxOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val smsOtpServiceAsync = client.number10dlc().brand().smsOtp()

        val future =
            smsOtpServiceAsync.verify(
                SmsOtpVerifyParams.builder()
                    .brandId("4b20019b-043a-78f8-0657-b3be3f4b4002")
                    .otpPin("123456")
                    .build()
            )

        val response = future.get()
    }
}
