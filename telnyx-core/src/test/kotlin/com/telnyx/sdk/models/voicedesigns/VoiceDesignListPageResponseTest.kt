// File generated from our OpenAPI spec by Stainless.

package com.telnyx.sdk.models.voicedesigns

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.telnyx.sdk.core.jsonMapper
import java.time.OffsetDateTime
import kotlin.jvm.optionals.getOrNull
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class VoiceDesignListPageResponseTest {

    @Test
    fun create() {
        val voiceDesignListPageResponse =
            VoiceDesignListPageResponse.builder()
                .addData(
                    VoiceDesignListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .provider(VoiceDesignListResponse.Provider.TELNYX)
                        .addProviderSupportedModel("string")
                        .recordType(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    VoiceDesignListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        assertThat(voiceDesignListPageResponse.data().getOrNull())
            .containsExactly(
                VoiceDesignListResponse.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .name("name")
                    .provider(VoiceDesignListResponse.Provider.TELNYX)
                    .addProviderSupportedModel("string")
                    .recordType(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
                    .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                    .build()
            )
        assertThat(voiceDesignListPageResponse.meta())
            .contains(
                VoiceDesignListPageResponse.Meta.builder()
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
        val voiceDesignListPageResponse =
            VoiceDesignListPageResponse.builder()
                .addData(
                    VoiceDesignListResponse.builder()
                        .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                        .createdAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .name("name")
                        .provider(VoiceDesignListResponse.Provider.TELNYX)
                        .addProviderSupportedModel("string")
                        .recordType(VoiceDesignListResponse.RecordType.VOICE_DESIGN)
                        .updatedAt(OffsetDateTime.parse("2019-12-27T18:11:19.117Z"))
                        .build()
                )
                .meta(
                    VoiceDesignListPageResponse.Meta.builder()
                        .pageNumber(1L)
                        .pageSize(20L)
                        .totalPages(3L)
                        .totalResults(42L)
                        .build()
                )
                .build()

        val roundtrippedVoiceDesignListPageResponse =
            jsonMapper.readValue(
                jsonMapper.writeValueAsString(voiceDesignListPageResponse),
                jacksonTypeRef<VoiceDesignListPageResponse>(),
            )

        assertThat(roundtrippedVoiceDesignListPageResponse).isEqualTo(voiceDesignListPageResponse)
    }
}
