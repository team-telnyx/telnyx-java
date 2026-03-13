// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignDataTest {

    @Test
    fun create() {
        val voiceDesignData =
            VoiceDesignData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .prompt("prompt")
                .recordType(VoiceDesignData.RecordType.VOICE_DESIGN)
                .text("text")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .versionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceSampleSize(0L)
                .build()

        assertThat(voiceDesignData.id()).contains("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
        assertThat(voiceDesignData.createdAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceDesignData.name()).contains("name")
        assertThat(voiceDesignData.prompt()).contains("prompt")
        assertThat(voiceDesignData.recordType()).contains(VoiceDesignData.RecordType.VOICE_DESIGN)
        assertThat(voiceDesignData.text()).contains("text")
        assertThat(voiceDesignData.updatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceDesignData.version()).contains(0L)
        assertThat(voiceDesignData.versionCreatedAt())
            .contains(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
        assertThat(voiceDesignData.voiceSampleSize()).contains(0L)
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceDesignData =
            VoiceDesignData.builder()
                .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .name("name")
                .prompt("prompt")
                .recordType(VoiceDesignData.RecordType.VOICE_DESIGN)
                .text("text")
                .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .version(0L)
                .versionCreatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                .voiceSampleSize(0L)
                .build()

        val roundtrippedVoiceDesignData =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignData),
                jacksonTypeRef<VoiceDesignData>(),
            )

        assertThat(roundtrippedVoiceDesignData).isEqualTo(voiceDesignData)
    }
}
