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
                    .about("about")
                    .address("address")
                    .category("category")
                    .description("description")
                    .displayName("display_name")
                    .email("email")
                    .website("website")
                    .build()
            )

        val profile = profileFuture.get()
        profile.validate()
    }
}
