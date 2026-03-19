// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voiceclones

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceCloneListPageResponseTest {

    @Test
    fun create() {
        val voiceCloneListPageResponse =
            VoiceCloneListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    VoiceCloneListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(voiceCloneListPageResponse.data().getOrNull())
            .containsExactly(
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
            )
        assertThat(voiceCloneListPageResponse.meta())
            .contains(
                VoiceCloneListPageResponse.Meta.builder()
                    .pageNumber(1L)
                    .pageSize(20L)
                    .totalPages(3L)
                    .totalResults(42L)
                    .build()
            )
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val voiceCloneListPageResponse =
            VoiceCloneListPageResponse.builder()
                .addData(
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
                )
                .meta(
                    VoiceCloneListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedVoiceCloneListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceCloneListPageResponse),
                jacksonTypeRef<VoiceCloneListPageResponse>(),
            )

        assertThat(roundtrippedVoiceCloneListPageResponse).isEqualTo(voiceCloneListPageResponse)
    }
}
