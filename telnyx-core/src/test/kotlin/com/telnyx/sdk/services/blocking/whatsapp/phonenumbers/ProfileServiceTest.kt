// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.profile.ProfileUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class ProfileServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.whatsapp().phoneNumbers().profile()

        val profile = profileService.retrieve("phone_number")

        profile.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val profileService = client.whatsapp().phoneNumbers().profile()

        val profile =
            profileService.update(
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

        profile.validate()
    }
}
