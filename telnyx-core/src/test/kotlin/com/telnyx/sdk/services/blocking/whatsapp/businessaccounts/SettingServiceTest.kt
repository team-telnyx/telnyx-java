// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.whatsapp.businessaccounts

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.whatsapp.businessaccounts.settings.SettingUpdateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.whatsapp().businessAccounts().settings()

        val setting = settingService.retrieve("id")

        setting.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.whatsapp().businessAccounts().settings()

        val setting =
            settingService.update(
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

        setting.validate()
    }
}
