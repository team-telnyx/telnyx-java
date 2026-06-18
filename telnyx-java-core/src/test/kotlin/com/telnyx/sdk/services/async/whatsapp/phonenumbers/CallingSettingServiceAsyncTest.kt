// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.phonenumbers

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.phonenumbers.callingsettings.CallingSettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class CallingSettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callingSettingServiceAsync = client.whatsapp().phoneNumbers().callingSettings()

        val callingSettingFuture = callingSettingServiceAsync.retrieve("phone_number")

        val callingSetting = callingSettingFuture.get()
        callingSetting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val callingSettingServiceAsync = client.whatsapp().phoneNumbers().callingSettings()

        val callingSettingFuture =
            callingSettingServiceAsync.update(
                CallingSettingUpdateParams.builder()
                    .phoneNumber("phone_number")
                    .enabled(true)
                    .build()
            )

        val callingSetting = callingSettingFuture.get()
        callingSetting.validate()
    }
}
