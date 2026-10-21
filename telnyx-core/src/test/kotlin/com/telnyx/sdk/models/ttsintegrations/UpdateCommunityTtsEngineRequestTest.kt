// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class UpdateCommunityTtsEngineRequestTest {

    @Test
    fun create() {
        val updateCommunityTtsEngineRequest =
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
                .visibility(CommunityTtsEngineVisibility.PRIVATE)
                .voicesApiKeyRef("voices_api_key_ref")
                .voicesUrl("https://")
                .websocketUrl("wss://")
                .build()

        assertThat(updateCommunityTtsEngineRequest.capabilities())
            .contains(
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
        assertThat(updateCommunityTtsEngineRequest.connectTimeoutMs()).contains(500L)
        assertThat(updateCommunityTtsEngineRequest.contactEmail()).contains("contact_email")
        assertThat(updateCommunityTtsEngineRequest.dataRetentionPolicyUrl())
            .contains("data_retention_policy_url")
        assertThat(updateCommunityTtsEngineRequest.documentationUrl()).contains("https://")
        assertThat(updateCommunityTtsEngineRequest.supportedAudioFormats().getOrNull())
            .containsExactly(CommunityTtsAudioFormat.MP3)
        assertThat(updateCommunityTtsEngineRequest.visibility())
            .contains(CommunityTtsEngineVisibility.PRIVATE)
        assertThat(updateCommunityTtsEngineRequest.voicesApiKeyRef()).contains("voices_api_key_ref")
        assertThat(updateCommunityTtsEngineRequest.voicesUrl()).contains("https://")
        assertThat(updateCommunityTtsEngineRequest.websocketUrl()).contains("wss://")
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val updateCommunityTtsEngineRequest =
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
                .visibility(CommunityTtsEngineVisibility.PRIVATE)
                .voicesApiKeyRef("voices_api_key_ref")
                .voicesUrl("https://")
                .websocketUrl("wss://")
                .build()

        val roundtrippedUpdateCommunityTtsEngineRequest =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(updateCommunityTtsEngineRequest),
                jacksonTypeRef<UpdateCommunityTtsEngineRequest>(),
            )

        assertThat(roundtrippedUpdateCommunityTtsEngineRequest)
            .isEqualTo(updateCommunityTtsEngineRequest)
    }
}
