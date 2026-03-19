// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneCreateFromDesignResponseTest {

    @Test
    fun create() {
        val voiceCloneCreateFromDesignResponse =
            VoiceCloneCreateFromDesignResponse.builder()
                .data(
                    VoiceCloneCreateFromDesignResponse.Data.builder()
                        .id("660f9511-f3ac-52e5-b827-557766551111")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .gender(VoiceCloneCreateFromDesignResponse.Data.Gender.MALE)
                        .label("Speak in a warm, friendly tone")
                        .language("en")
                        .name("clone-narrator")
                        .recordType(VoiceCloneCreateFromDesignResponse.Data.RecordType.VOICE_CLONE)
                        .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .sourceVoiceDesignVersion(1L)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .build()

        assertThat(voiceCloneCreateFromDesignResponse.data())
            .contains(
                VoiceCloneCreateFromDesignResponse.Data.builder()
                    .id("660f9511-f3ac-52e5-b827-557766551111")
                    .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .gender(VoiceCloneCreateFromDesignResponse.Data.Gender.MALE)
                    .label("Speak in a warm, friendly tone")
                    .language("en")
                    .name("clone-narrator")
                    .recordType(VoiceCloneCreateFromDesignResponse.Data.RecordType.VOICE_CLONE)
                    .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                    .sourceVoiceDesignVersion(1L)
                    .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCloneCreateFromDesignResponse =
            VoiceCloneCreateFromDesignResponse.builder()
                .data(
                    VoiceCloneCreateFromDesignResponse.Data.builder()
                        .id("660f9511-f3ac-52e5-b827-557766551111")
                        .createdAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .gender(VoiceCloneCreateFromDesignResponse.Data.Gender.MALE)
                        .label("Speak in a warm, friendly tone")
                        .language("en")
                        .name("clone-narrator")
                        .recordType(VoiceCloneCreateFromDesignResponse.Data.RecordType.VOICE_CLONE)
                        .sourceVoiceDesignId("550e8400-e29b-41d4-a716-446655440000")
                        .sourceVoiceDesignVersion(1L)
                        .updatedAt(OffsetDateTime.parse("2024-01-01T00:00:00Z"))
                        .build()
                )
                .build()

        val roundtrippedVoiceCloneCreateFromDesignResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCloneCreateFromDesignResponse),
                jacksonTypeRef<VoiceCloneCreateFromDesignResponse>(),
            )

        assertThat(roundtrippedVoiceCloneCreateFromDesignResponse)
            .isEqualTo(voiceCloneCreateFromDesignResponse)
    }
}
