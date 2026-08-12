// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking.ai.collections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.SettingCreateParams
import com.telnyx.sdk.models.ai.collections.settings.SettingPatchAllParams
import com.telnyx.sdk.models.ai.collections.settings.SettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.ai().collections().settings()

        val settingsEnvelope =
            settingService.create(
                SettingCreateParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .settingsRequest(
                        SettingsRequest.builder()
                            .retrieval(
                                RetrievalSettings.builder()
                                    .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                    .topK(5L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        settingsEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.ai().collections().settings()

        val settingsEnvelope = settingService.list("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        settingsEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val settingService = client.ai().collections().settings()

        val settingsEnvelope =
            settingService.patchAll(
                SettingPatchAllParams.builder()
                    .uuid("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")
                    .settingsRequest(
                        SettingsRequest.builder()
                            .retrieval(
                                RetrievalSettings.builder()
                                    .retrievalType(RetrievalSettings.RetrievalType.VECTOR)
                                    .topK(5L)
                                    .build()
                            )
                            .build()
                    )
                    .build()
            )

        settingsEnvelope.validate()
    }
}
