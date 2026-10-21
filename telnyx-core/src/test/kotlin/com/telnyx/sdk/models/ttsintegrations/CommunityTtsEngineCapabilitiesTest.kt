// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.ttsintegrations

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.JsonValue
import com.telnyx.sdk.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class CommunityTtsEngineCapabilitiesTest {

    @Test
    fun create() {
        val communityTtsEngineCapabilities =
            CommunityTtsEngineCapabilities.builder()
                .streamedAudio(true)
                .flushSupport(true)
                .forceInterruptSupport(true)
                .ssmlSupport(true)
                .voiceSettingsSchema(
                    CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                        .putAdditionalProperty("voice_speed", JsonValue.from(mapOf<String, Any>()))
                        .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        assertThat(communityTtsEngineCapabilities.streamedAudio()).isEqualTo(true)
        assertThat(communityTtsEngineCapabilities.flushSupport()).contains(true)
        assertThat(communityTtsEngineCapabilities.forceInterruptSupport()).contains(true)
        assertThat(communityTtsEngineCapabilities.ssmlSupport()).contains(true)
        assertThat(communityTtsEngineCapabilities.voiceSettingsSchema())
            .contains(
                CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                    .putAdditionalProperty("voice_speed", JsonValue.from(mapOf<String, Any>()))
                    .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val communityTtsEngineCapabilities =
            CommunityTtsEngineCapabilities.builder()
                .streamedAudio(true)
                .flushSupport(true)
                .forceInterruptSupport(true)
                .ssmlSupport(true)
                .voiceSettingsSchema(
                    CommunityTtsEngineCapabilities.VoiceSettingsSchema.builder()
                        .putAdditionalProperty("voice_speed", JsonValue.from(mapOf<String, Any>()))
                        .putAdditionalProperty("emotion", JsonValue.from(mapOf<String, Any>()))
                        .build()
                )
                .build()

        val roundtrippedCommunityTtsEngineCapabilities =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(communityTtsEngineCapabilities),
                jacksonTypeRef<CommunityTtsEngineCapabilities>(),
            )

        assertThat(roundtrippedCommunityTtsEngineCapabilities)
            .isEqualTo(communityTtsEngineCapabilities)
    }
}
