// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationReplaceParamsTest {

    @Test
    fun create() {
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
    }

    @Test
    fun pathParams() {
        val params =
            TtsIntegrationReplaceParams.builder()
                .id("id")
                .updateCommunityTtsEngineRequest(UpdateCommunityTtsEngineRequest.builder().build())
                .build()

        assertThat(params._pathParam(0)).isEqualTo("id")
        // out-of-bound path param
        assertThat(params._pathParam(1)).isEqualTo("")
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body)
            .isEqualTo(
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
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TtsIntegrationReplaceParams.builder()
                .id("id")
                .updateCommunityTtsEngineRequest(UpdateCommunityTtsEngineRequest.builder().build())
                .build()

        val body = params._body()

        assertThat(body).isEqualTo(UpdateCommunityTtsEngineRequest.builder().build())
    }
}
