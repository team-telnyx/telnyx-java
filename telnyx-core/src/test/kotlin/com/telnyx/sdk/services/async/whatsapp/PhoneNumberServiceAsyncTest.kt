// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberResendVerificationParams
import com.telnyx.sdk.models.whatsapp.phonenumbers.PhoneNumberVerifyParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list()

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().phoneNumbers()

        val future = phoneNumberServiceAsync.delete("phone_number")

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun resendVerification() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().phoneNumbers()

        val future =
            phoneNumberServiceAsync.resendVerification(
                PhoneNumberResendVerificationParams.builder()
                    .phoneNumber("phone_number")
                    .verificationMethod(PhoneNumberResendVerificationParams.VerificationMethod.SMS)
                    .build()
            )

        val response = future.get()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun verify() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().phoneNumbers()

        val future =
            phoneNumberServiceAsync.verify(
                PhoneNumberVerifyParams.builder().phoneNumber("phone_number").code("code").build()
            )

        val response = future.get()
    }
}
