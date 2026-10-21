// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.telnyx.sdk.core.JsonValue
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class TtsIntegrationCreateParamsTest {

    @Test
    fun create() {
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
                            .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
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
    }

    @Test
    fun body() {
        val params =
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

        val body = params._body()

        assertThat(body.capabilities())
            .isEqualTo(
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
                            .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
                            .build()
                    )
                    .build()
            )
        assertThat(body.name()).isEqualTo("acme")
        assertThat(body.supportedAudioFormats()).containsExactly(CommunityTtsAudioFormat.LINEAR16)
        assertThat(body.voicesUrl()).isEqualTo("https://tts.acme.example/voices")
        assertThat(body.websocketUrl()).isEqualTo("wss://tts.acme.example/v1")
        assertThat(body.connectTimeoutMs()).contains(500L)
        assertThat(body.contactEmail()).contains("contact_email")
        assertThat(body.dataRetentionPolicyUrl()).contains("data_retention_policy_url")
        assertThat(body.documentationUrl()).contains("https://tts.acme.example/docs")
        assertThat(body.visibility()).contains(CommunityTtsEngineVisibility.PRIVATE)
        assertThat(body.voicesApiKeyRef()).contains("voices_api_key_ref")
    }

    @Test
    fun bodyWithoutOptionalFields() {
        val params =
            TtsIntegrationCreateParams.builder()
                .capabilities(CommunityTtsEngineCapabilities.builder().streamedAudio(true).build())
                .name("acme")
                .addSupportedAudioFormat(CommunityTtsAudioFormat.LINEAR16)
                .voicesUrl("https://tts.acme.example/voices")
                .websocketUrl("wss://tts.acme.example/v1")
                .build()

        val body = params._body()

        assertThat(body.capabilities())
            .isEqualTo(CommunityTtsEngineCapabilities.builder().streamedAudio(true).build())
        assertThat(body.name()).isEqualTo("acme")
        assertThat(body.supportedAudioFormats()).containsExactly(CommunityTtsAudioFormat.LINEAR16)
        assertThat(body.voicesUrl()).isEqualTo("https://tts.acme.example/voices")
        assertThat(body.websocketUrl()).isEqualTo("wss://tts.acme.example/v1")
    }
}
