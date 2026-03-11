// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingSettingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callingSettingService = client.whatsapp().phoneNumbers().callingSettings()

        val callingSetting = callingSettingService.retrieve("phone_number")

        callingSetting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val callingSettingService = client.whatsapp().phoneNumbers().callingSettings()

        val callingSetting =
            callingSettingService.update(
                CallingSettingUpdateParams.builder()
                    .phoneNumber("phone_number")
                    .enabled(true)
                    .build()
            )

        callingSetting.validate()
    }
}
