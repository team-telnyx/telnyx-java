// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.async.ai.collections

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClientAsync
import com.telnyx.sdk.models.ai.collections.settings.RetrievalSettings
import com.telnyx.sdk.models.ai.collections.settings.SettingCreateParams
import com.telnyx.sdk.models.ai.collections.settings.SettingPatchAllParams
import com.telnyx.sdk.models.ai.collections.settings.SettingsRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class SettingServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.ai().collections().settings()

        val settingsEnvelopeFuture =
            settingServiceAsync.create(
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

        val settingsEnvelope = settingsEnvelopeFuture.get()
        settingsEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.ai().collections().settings()

        val settingsEnvelopeFuture =
            settingServiceAsync.list("6a09ccbd-8f9b-4c3a-9b0e-2f1d3c4b5a6e")

        val settingsEnvelope = settingsEnvelopeFuture.get()
        settingsEnvelope.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun patchAll() {
        val client = TelnyxOkHttpClientAsync.builder().apiKey("My API Key").build()
        val settingServiceAsync = client.ai().collections().settings()

        val settingsEnvelopeFuture =
            settingServiceAsync.patchAll(
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

        val settingsEnvelope = settingsEnvelopeFuture.get()
        settingsEnvelope.validate()
    }
}
