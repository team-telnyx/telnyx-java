// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.memory.namespaces

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.memory.namespaces.settings.SettingPatchAllParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.ai().memory().namespaces().settings()

        val namespaceSettingsResponseFuture = settingServiceAsync.list("namespace")

        val namespaceSettingsResponse = namespaceSettingsResponseFuture.get()
        namespaceSettingsResponse.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.ai().memory().namespaces().settings()

        val namespaceSettingsResponseFuture =
            settingServiceAsync.patchAll(
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

        val namespaceSettingsResponse = namespaceSettingsResponseFuture.get()
        namespaceSettingsResponse.validate()
    }
}
