// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserDataServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userDataService = client.whatsapp().userData()

        val userData = userDataService.retrieve()

        userData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val userDataService = client.whatsapp().userData()

        val userData =
            userDataService.update(
                UserDataUpdateParams.builder()
                    .webhookFailoverUrl("https://example.com")
                    .webhookUrl("https://example.com")
                    .build()
            )

        userData.validate()
    }
}
