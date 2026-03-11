// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.whatsapp.businessaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.whatsapp().businessAccounts().settings()

        val settingFuture = settingServiceAsync.retrieve("id")

        val setting = settingFuture.get()
        setting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.whatsapp().businessAccounts().settings()

        val settingFuture =
            settingServiceAsync.update(
                SettingUpdateParams.builder()
                    .id("id")
                    .name("name")
                    .timezone("America/New_York")
                    .webhookEnabled(true)
                    .addWebhookEvent("string")
                    .webhookFailoverUrl("webhook_failover_url")
                    .webhookUrl("webhook_url")
                    .build()
            )

        val setting = settingFuture.get()
        setting.validate()
    }
}
