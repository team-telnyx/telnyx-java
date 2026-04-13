// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateResponseTest {

    @Test
    fun create() {
        val voiceCloneCreateResponse =
            VoiceCloneCreateResponse.builder()
                .data(
                    VoiceCloneData.builder()
                        .id("660f9511-f3ac-52e5-b827-557766551111")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .gender(VoiceCloneData.Gender.MALE)
                        .label("Speak in a warm, friendly tone")
                        .language("en")
                        .modelId(VoiceCloneData.ModelId.QWEN3_TTS)
                        .name("clone-narrator")
                        .provider(VoiceCloneData.Provider.TELNYX)
                        .addProviderSupportedModel("Qwen3TTS")
                        .providerVoiceId("660f9511-f3ac-52e5-b827-557766551111")
                        .recordType(VoiceCloneData.RecordType.VOICE_CLONE)
                        .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .sourceVoiceDesignVersion(1L)
                        .status(VoiceCloneData.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .build()

        assertThat(voiceCloneCreateResponse.data())
            .contains(
                VoiceCloneData.builder()
                    .id("660f9511-f3ac-52e5-b827-557766551111")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .gender(VoiceCloneData.Gender.MALE)
                    .label("Speak in a warm, friendly tone")
                    .language("en")
                    .modelId(VoiceCloneData.ModelId.QWEN3_TTS)
                    .name("clone-narrator")
                    .provider(VoiceCloneData.Provider.TELNYX)
                    .addProviderSupportedModel("Qwen3TTS")
                    .providerVoiceId("660f9511-f3ac-52e5-b827-557766551111")
                    .recordType(VoiceCloneData.RecordType.VOICE_CLONE)
                    .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                    .sourceVoiceDesignVersion(1L)
                    .status(VoiceCloneData.Status.ACTIVE)
                    .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCloneCreateResponse =
            VoiceCloneCreateResponse.builder()
                .data(
                    VoiceCloneData.builder()
                        .id("660f9511-f3ac-52e5-b827-557766551111")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .gender(VoiceCloneData.Gender.MALE)
                        .label("Speak in a warm, friendly tone")
                        .language("en")
                        .modelId(VoiceCloneData.ModelId.QWEN3_TTS)
                        .name("clone-narrator")
                        .provider(VoiceCloneData.Provider.TELNYX)
                        .addProviderSupportedModel("Qwen3TTS")
                        .providerVoiceId("660f9511-f3ac-52e5-b827-557766551111")
                        .recordType(VoiceCloneData.RecordType.VOICE_CLONE)
                        .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .sourceVoiceDesignVersion(1L)
                        .status(VoiceCloneData.Status.ACTIVE)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedVoiceCloneCreateResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCloneCreateResponse),
                jacksonTypeRef<VoiceCloneCreateResponse>(),
            )

        assertThat(roundtrippedVoiceCloneCreateResponse).isEqualTo(voiceCloneCreateResponse)
    }
}
