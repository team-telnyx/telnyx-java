// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.services.blocking

import com.telnyx.sdk.client.okhttp.TelnyxOkHttpClient
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsAudioFormat
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngineCapabilities
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngineStatus
import com.telnyx.sdk.models.ttsintegrations.CommunityTtsEngineVisibility
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationCreateParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationListParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationReplaceParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveConformanceRunsParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationRetrieveDiscoverableParams
import com.telnyx.sdk.models.ttsintegrations.TtsIntegrationUpdateParams
import com.telnyx.sdk.models.ttsintegrations.UpdateCommunityTtsEngineRequest
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TtsIntegrationServiceTest {

    @Disabled("Mock server tests are disabled")
    @Test
    fun create() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val communityTtsEngine =
            ttsIntegrationService.create(
                TtsIntegrationCreateParams.builder()
                    .capabilities(
                        CommunityTtsEngineCapabilities.builder()
                            .streamedAudio(true)
                            .flushSupport(true)
                            .forceInterruptSupport(true)
                            .ssmlSupport(true)
                            .voiceSettingsSchema(
                                CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                    .putAdditionalProperty(
                                        "voice_speed",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .putAdditionalProperty(
                                        "emotion",
                                        JsonValue.from(mapOf<String, Any>()),
                                    )
                                    .build()
                            )
                            .build()
                    )
                    .name("acme")
                    .addSupportedAudioFormat(CommunityTtsAudioFormat.LINEAR16)
                    .voicesUrl("https://tts.acme.example/voices")
                    .websocketUrl("wss://tts.acme.example/v1")
                    .connectTimeoutMs(500L)
                    .contactEmail("contact_email")
                    .dataRetentionPolicyUrl("data_retention_policy_url")
                    .documentationUrl("https://tts.acme.example/docs")
                    .visibility(CommunityTtsEngineVisibility.PRIVATE)
                    .voicesApiKeyRef("voices_api_key_ref")
                    .build()
            )

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieve() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val communityTtsEngine = ttsIntegrationService.retrieve("id")

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun update() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val communityTtsEngine =
            ttsIntegrationService.update(
                TtsIntegrationUpdateParams.builder()
                    .id("id")
                    .updateCommunityTtsEngineRequest(
                        UpdateCommunityTtsEngineRequest.builder()
                            .capabilities(
                                CommunityTtsEngineCapabilities.builder()
                                    .streamedAudio(true)
                                    .flushSupport(true)
                                    .forceInterruptSupport(true)
                                    .ssmlSupport(true)
                                    .voiceSettingsSchema(
                                        CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                            .putAdditionalProperty(
                                                "voice_speed",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "emotion",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .connectTimeoutMs(500L)
                            .contactEmail("contact_email")
                            .dataRetentionPolicyUrl("data_retention_policy_url")
                            .documentationUrl("https://")
                            .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                            .visibility(CommunityTtsEngineVisibility.PUBLIC)
                            .voicesApiKeyRef("voices_api_key_ref")
                            .voicesUrl("https://")
                            .websocketUrl("wss://")
                            .build()
                    )
                    .build()
            )

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun list() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val ttsIntegrations =
            ttsIntegrationService.list(
                TtsIntegrationListParams.builder()
                    .page(TtsIntegrationListParams.Page.builder().number(1L).size(20L).build())
                    .status(CommunityTtsEngineStatus.DRAFT)
                    .visibility(CommunityTtsEngineVisibility.PRIVATE)
                    .build()
            )

        ttsIntegrations.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun delete() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        ttsIntegrationService.delete("id")
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun replace() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val communityTtsEngine =
            ttsIntegrationService.replace(
                TtsIntegrationReplaceParams.builder()
                    .id("id")
                    .updateCommunityTtsEngineRequest(
                        UpdateCommunityTtsEngineRequest.builder()
                            .capabilities(
                                CommunityTtsEngineCapabilities.builder()
                                    .streamedAudio(true)
                                    .flushSupport(true)
                                    .forceInterruptSupport(true)
                                    .ssmlSupport(true)
                                    .voiceSettingsSchema(
                                        CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                                            .putAdditionalProperty(
                                                "voice_speed",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .putAdditionalProperty(
                                                "emotion",
                                                JsonValue.from(mapOf<String, Any>()),
                                            )
                                            .build()
                                    )
                                    .build()
                            )
                            .connectTimeoutMs(500L)
                            .contactEmail("voices@acme.example")
                            .dataRetentionPolicyUrl("data_retention_policy_url")
                            .documentationUrl("https://tts.acme.example/docs")
                            .addSupportedAudioFormat(CommunityTtsAudioFormat.MP3)
                            .visibility(CommunityTtsEngineVisibility.PRIVATE)
                            .voicesApiKeyRef("voices_api_key_ref")
                            .voicesUrl("https://")
                            .websocketUrl("wss://")
                            .build()
                    )
                    .build()
            )

        communityTtsEngine.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveConformanceRuns() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val response =
            ttsIntegrationService.retrieveConformanceRuns(
                TtsIntegrationRetrieveConformanceRunsParams.builder()
                    .id("id")
                    .page(
                        TtsIntegrationRetrieveConformanceRunsParams.Page.builder()
                            .number(1L)
                            .size(20L)
                            .build()
                    )
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveDiscoverable() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val response =
            ttsIntegrationService.retrieveDiscoverable(
                TtsIntegrationRetrieveDiscoverableParams.builder()
                    .page(
                        TtsIntegrationRetrieveDiscoverableParams.Page.builder()
                            .number(1L)
                            .size(20L)
                            .build()
                    )
                    .status(CommunityTtsEngineStatus.DRAFT)
                    .visibility(CommunityTtsEngineVisibility.PRIVATE)
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    fun retrieveVoices() {
        val client = TelnyxOkHttpClient.builder().apiKey("My API Key").build()
        val ttsIntegrationService = client.ttsIntegrations()

        val response = ttsIntegrationService.retrieveVoices("id")

        response.validate()
    }
}
