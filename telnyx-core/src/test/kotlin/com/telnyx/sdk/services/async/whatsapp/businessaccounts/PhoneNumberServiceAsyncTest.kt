// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.businessaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberInitializeVerificationParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().businessAccounts().phoneNumbers()

        val pageFuture = phoneNumberServiceAsync.list("id")

        val page = pageFuture.get()
        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initializeVerification() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val phoneNumberServiceAsync = client.whatsapp().businessAccounts().phoneNumbers()

        val future =
            phoneNumberServiceAsync.initializeVerification(
                PhoneNumberInitializeVerificationParams.builder()
                    .id("id")
                    .displayName("display_name")
                    .phoneNumber("phone_number")
                    .language("language")
                    .verificationMethod(
                        PhoneNumberInitializeVerificationParams.VerificationMethod.SMS
                    )
                    .build()
            )

        val response = future.get()
    }
}
