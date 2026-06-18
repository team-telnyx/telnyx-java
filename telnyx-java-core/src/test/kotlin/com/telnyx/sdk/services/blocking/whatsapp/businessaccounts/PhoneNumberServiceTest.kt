// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.businessaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.businessaccounts.phonenumbers.PhoneNumberInitializeVerificationParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class PhoneNumberServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().businessAccounts().phoneNumbers()

        val page = phoneNumberService.list("id")

        page.response().validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun initializeVerification() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val phoneNumberService = client.whatsapp().businessAccounts().phoneNumbers()

        phoneNumberService.initializeVerification(
            PhoneNumberInitializeVerificationParams.builder()
                .id("id")
                .displayName("display_name")
                .phoneNumber("phone_number")
                .language("language")
                .verificationMethod(PhoneNumberInitializeVerificationParams.VerificationMethod.SMS)
                .build()
        )
    }
}
