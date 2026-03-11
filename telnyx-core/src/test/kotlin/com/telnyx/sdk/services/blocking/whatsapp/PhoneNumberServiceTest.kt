// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().phoneNumbers()

        val page = phoneNumberService.list()

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().phoneNumbers()

        phoneNumberService.delete("phone_number")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendVerification() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().phoneNumbers()

        phoneNumberService.resendVerification(
            PhoneNumberResendVerificationParams.builder()
                .phoneNumber("phone_number")
                .verificationMethod(PhoneNumberResendVerificationParams.VerificationMethod.SMS)
                .build()
        )
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().phoneNumbers()

        phoneNumberService.verify(
            PhoneNumberVerifyParams.builder().phoneNumber("phone_number").code("code").build()
        )
    }
}
