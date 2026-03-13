// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneDataTest {

    @Test
    fun create() {
        val voiceCloneData =
            VoiceCloneData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .gender(VoiceCloneData.Gender.MALE)
                .label("label")
                .language("language")
                .name("name")
                .recordType(VoiceCloneData.RecordType.VOICE_CLONE)
                .sourceVoiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceVoiceDesignVersion(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(voiceCloneData.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceCloneData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceCloneData.gender()).contains(VoiceCloneData.Gender.MALE)
        assertThat(voiceCloneData.label()).contains("label")
        assertThat(voiceCloneData.language()).contains("language")
        assertThat(voiceCloneData.name()).contains("name")
        assertThat(voiceCloneData.recordType()).contains(VoiceCloneData.RecordType.VOICE_CLONE)
        assertThat(voiceCloneData.sourceVoiceDesignId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceCloneData.sourceVoiceDesignVersion()).contains(0L)
        assertThat(voiceCloneData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCloneData =
            VoiceCloneData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .gender(VoiceCloneData.Gender.MALE)
                .label("label")
                .language("language")
                .name("name")
                .recordType(VoiceCloneData.RecordType.VOICE_CLONE)
                .sourceVoiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceVoiceDesignVersion(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVoiceCloneData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCloneData),
                jacksonTypeRef<VoiceCloneData>(),
            )

        assertThat(roundtrippedVoiceCloneData).isEqualTo(voiceCloneData)
    }
}
