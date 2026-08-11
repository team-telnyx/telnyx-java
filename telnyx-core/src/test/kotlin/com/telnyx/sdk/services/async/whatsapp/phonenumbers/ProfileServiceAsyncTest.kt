// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.whatsapp().phoneNumbers().profile()

        val profileFuture = profileServiceAsync.retrieve("phone_number")

        val profile = profileFuture.get()
        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val profileServiceAsync = client.whatsapp().phoneNumbers().profile()

        val profileFuture =
            profileServiceAsync.update(
                ProfileUpdateParams.builder()
                    .phoneNumber("phone_number")
                    .about("string")
                    .address("string")
                    .category("string")
                    .description("string")
                    .displayName("string")
                    .email("string")
                    .profileId("3fa85f64-5717-4562-b3fc-2c963f66afa6")
                    .website("string")
                    .build()
            )

        val profile = profileFuture.get()
        profile.validate()
    }
}
