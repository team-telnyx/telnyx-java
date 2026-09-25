// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.memory.namespaces

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.ai().memory().namespaces().settings()

        val namespaceSettingsResponse = settingService.list("namespace")

        namespaceSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.ai().memory().namespaces().settings()

        val namespaceSettingsResponse =
            settingService.patchAll(
                SettingPatchAllParams.builder()
                    .namespace("namespace")
                    .summary(
                        SettingPatchAllParams.Summary.builder()
                            .instructions(
                                "Lead with the customer's plan tier. Keep it under 100 words."
                            )
                            .build()
                    )
                    .build()
            )

        namespaceSettingsResponse.validate()
    }
}
