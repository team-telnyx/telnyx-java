// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.userdata.UserDataUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserDataServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userDataServiceAsync = client.whatsapp().userData()

        val userDataFuture = userDataServiceAsync.retrieve()

        val userData = userDataFuture.get()
        userData.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userDataServiceAsync = client.whatsapp().userData()

        val userDataFuture =
            userDataServiceAsync.update(
                UserDataUpdateParams.builder()
                    .webhookFailoverUrl("webhook_failover_url")
                    .webhookUrl("webhook_url")
                    .build()
            )

        val userData = userDataFuture.get()
        userData.validate()
    }
}
