// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneListResponseTest {

    @Test
    fun create() {
        val voiceCloneListResponse =
            VoiceCloneListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .gender(VoiceCloneListResponse.Gender.MALE)
                .label("label")
                .language("language")
                .name("name")
                .recordType(VoiceCloneListResponse.RecordType.VOICE_CLONE)
                .sourceVoiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceVoiceDesignVersion(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        assertThat(voiceCloneListResponse.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceCloneListResponse.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceCloneListResponse.gender()).contains(VoiceCloneListResponse.Gender.MALE)
        assertThat(voiceCloneListResponse.label()).contains("label")
        assertThat(voiceCloneListResponse.language()).contains("language")
        assertThat(voiceCloneListResponse.name()).contains("name")
        assertThat(voiceCloneListResponse.recordType())
            .contains(VoiceCloneListResponse.RecordType.VOICE_CLONE)
        assertThat(voiceCloneListResponse.sourceVoiceDesignId())
            .contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceCloneListResponse.sourceVoiceDesignVersion()).contains(0L)
        assertThat(voiceCloneListResponse.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCloneListResponse =
            VoiceCloneListResponse.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .gender(VoiceCloneListResponse.Gender.MALE)
                .label("label")
                .language("language")
                .name("name")
                .recordType(VoiceCloneListResponse.RecordType.VOICE_CLONE)
                .sourceVoiceDesignId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .sourceVoiceDesignVersion(0L)
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .build()

        val roundtrippedVoiceCloneListResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCloneListResponse),
                jacksonTypeRef<VoiceCloneListResponse>(),
            )

        assertThat(roundtrippedVoiceCloneListResponse).isEqualTo(voiceCloneListResponse)
    }
}
